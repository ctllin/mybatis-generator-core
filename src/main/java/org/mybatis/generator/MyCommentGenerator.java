package org.mybatis.generator;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;

/**
 * 描述：
 * 
 * @since 1.0
 * @version 1.0
 * @作者：ctllin 
 */
public class MyCommentGenerator implements CommentGenerator {
	private Properties properties;
	private Properties systemPro;
	private boolean suppressDate;
	private boolean suppressAllComments;
	private String currentDateStr;
	private String currentYear;

	private boolean commentSet;// 需要在addConfigurationProperties 增加 commentSet
	private boolean commentGet;// 需要在addConfigurationProperties 增加 commentGet
	private boolean commentField;// 需要在addConfigurationProperties 增加 commentField
	private boolean commentClass;// 需要在addConfigurationProperties 增加  commentClass

	public MyCommentGenerator() {
		super();
		properties = new Properties();
		systemPro = System.getProperties();
		suppressDate = false;
		suppressAllComments = false;
		commentSet = false;
		commentGet = false;
		commentField = false;
		commentClass = false;
		currentDateStr = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
		currentYear = (new SimpleDateFormat("yyyy")).format(new Date());

	}

	public void addJavaFileComment(CompilationUnit compilationUnit) {
		// add no file level comments by default
		return;
	}

	/**
	 * Adds a suitable comment to warn users that the element was generated, and
	 * when it was generated.
	 */
	public void addComment(XmlElement xmlElement) {
		return;
	}

	public void addRootComment(XmlElement rootElement) {
		// add no document level comments by default
		return;
	}

	public void addConfigurationProperties(Properties properties) {
		this.properties.putAll(properties);

		suppressDate = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));

		suppressAllComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
		// add by ctllin
		commentSet = isTrue(properties.getProperty("commentSet"));
		commentGet = isTrue(properties.getProperty("commentGet"));
		commentClass = isTrue(properties.getProperty("commentClass"));
		commentField = isTrue(properties.getProperty("commentField"));
	}

	/**
	 * This method adds the custom javadoc tag for. You may do nothing if you do
	 * not wish to include the Javadoc tag - however, if you do not include the
	 * Javadoc tag then the Java merge capability of the eclipse plugin will
	 * break.
	 * 
	 * @param javaElement
	 *            the java element
	 */
	protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
		javaElement.addJavaDocLine(" *");
		StringBuilder sb = new StringBuilder();
		sb.append(" * ");
		sb.append(MergeConstants.NEW_ELEMENT_TAG);
		if (markAsDoNotDelete) {
			sb.append(" do_not_delete_during_merge");
		}
		String s = getDateString();
		if (s != null) {
			sb.append(' ');
			sb.append(s);
		}
		javaElement.addJavaDocLine(sb.toString());
	}

	/**
	 * This method returns a formated date string to include in the Javadoc tag
	 * and XML comments. You may return null if you do not want the date in
	 * these documentation elements.
	 * 
	 * @return a string representing the current timestamp, or null
	 */
	protected String getDateString() {
		String result = null;
		if (!suppressDate) {
			result = currentDateStr;
		}
		return result;
	}

	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
		if (commentClass) {
			return;
		}
	}

	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
			return;
		}
		StringBuilder sb = new StringBuilder();
		innerEnum.addJavaDocLine("/**");
		sb.append(" * ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		innerEnum.addJavaDocLine(sb.toString().replace("\n", " "));
		innerEnum.addJavaDocLine(" */");
	}
	// add by ctllin 添加类注释
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		if (commentField) {
			return;
		}
		StringBuilder sb = new StringBuilder();
		field.addJavaDocLine("/**");
		sb.append(" * ");
		sb.append(introspectedColumn.getRemarks());
		field.addJavaDocLine(sb.toString().replace("\n", " "));
		field.addJavaDocLine(" */");
	}

	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
		if (commentField) {
			return;
		}
		//modify by ctl Example不要字段注释
//		StringBuilder sb = new StringBuilder();
//		field.addJavaDocLine("/**");
//		sb.append(" * ");
//		sb.append(introspectedTable.getFullyQualifiedTable());
//		field.addJavaDocLine(sb.toString().replace("\n", " "));
//		field.addJavaDocLine(" */");
	}

	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
			return;
		}
		method.addJavaDocLine("/**");
		addJavadocTag(method, false);
		method.addJavaDocLine(" */");
	}

	public void addGetterComment(Method method, IntrospectedTable introspectedTable,IntrospectedColumn introspectedColumn) {
		if (commentGet) {
			return;
		}
		method.addJavaDocLine("/**");
		StringBuilder sb = new StringBuilder();
		sb.append(" * ");
		sb.append(introspectedColumn.getRemarks());
		method.addJavaDocLine(sb.toString().replace("\n", " "));
		sb.setLength(0);
		sb.append(" * @return ");
		sb.append(introspectedColumn.getActualColumnName());
		sb.append(" ");
		sb.append(introspectedColumn.getRemarks());
		method.addJavaDocLine(sb.toString().replace("\n", " "));
		method.addJavaDocLine(" */");
	}

	public void addSetterComment(Method method, IntrospectedTable introspectedTable,IntrospectedColumn introspectedColumn) {
		if (commentSet) {
			return;
		}
		method.addJavaDocLine("/**");
		StringBuilder sb = new StringBuilder();
		sb.append(" * ");
		sb.append(introspectedColumn.getRemarks());
		method.addJavaDocLine(sb.toString().replace("\n", " "));
		Parameter parm = method.getParameters().get(0);
		sb.setLength(0);
		sb.append(" * @param ");
		sb.append(parm.getName());
		sb.append(" ");
		sb.append(introspectedColumn.getRemarks());
		method.addJavaDocLine(sb.toString().replace("\n", " "));
		method.addJavaDocLine(" */");
	}

	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
		if (commentClass) {
			return;
		}
	}

	// add by ctllin 添加类注释
	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		if (commentClass) {
			return;
		}
	
		StringBuilder sb = new StringBuilder();
		topLevelClass.addJavaDocLine("/**");
		sb.append(" * <p>Title: ").append(introspectedTable.getFullyQualifiedTable().getDomainObjectName()).append("</p>").append("\n");
		sb.append(" * <p>Description:").append(introspectedTable.getRemarks()).append(" </p>").append("\n");
		sb.append(" * <p>Copyright: Copyright (c) ").append(currentYear).append("</p>").append("\n");
		sb.append(" * <p>Company: www.hanshow.com</p>").append("\n");
		sb.append(" * @author ").append(systemPro.getProperty("user.name")).append("\n");
		sb.append(" * @date ").append(currentDateStr).append("\n");
		sb.append(" * @version 1.0");
		topLevelClass.addJavaDocLine(sb.toString());
		topLevelClass.addJavaDocLine(" */");

	}

	@Override
	public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable,
			Set<FullyQualifiedJavaType> imports) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable,
			Set<FullyQualifiedJavaType> imports) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable,
			Set<FullyQualifiedJavaType> imports) {
		// TODO Auto-generated method stub

	}

}