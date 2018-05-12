package com.hanshow.base.member.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: MemberBase</p>
 * <p>Description:会员基础信息表 </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: www.hanshow.com</p>
 * @author hanshow
 * @date 2018-05-12 18:44:38
 * @version 1.0
 */
public class MemberBase implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
    * 分页查询条件
    */
    private String whereStr;

    /**
     * 主键uuid
     */
    private String id;

    /**
     * 用户微信的union_id
     */
    private String unionId;

    /**
     * 用户公众号的open id
     */
    private String openId;

    /**
     * 会员昵称
     */
    private String nickName;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 账户状态（1：正常 2:已停用 3:冻结）
     */
    private Integer accountStatus;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 商户id
     */
    private Integer merchantId;

    /**
     * 密码
     */
    private String password;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 删除标识 1正常2删除
     */
    private Byte delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public String getWhereStr() {
        return whereStr;
    }

    public void setWhereStr(String whereStr) {
        this.whereStr = whereStr;
    }
}