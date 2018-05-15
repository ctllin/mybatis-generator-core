package com.hanshow.wise.base.member.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: MemberExtra</p>
 * <p>Description:会员附加信息表 </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: www.hanshow.com</p>
 * @author hanshow
 * @date 2018-05-15 14:21:52
 * @version 1.0
 */
public class MemberExtra implements Serializable {
    /**
    * 分页查询条件
    */
    private String whereStr;

    /**
     * 主键
     */
    private String id;

    /**
     * 会员id
     */
    private String memberId;

    /**
     * 线下member_id
     */
    private String preMemberId;

    /**
     * 名字
     */
    private String name;

    /**
     * 会员昵称
     */
    private String nickName;

    /**
     * 姓
     */
    private String familyName;

    /**
     * 名
     */
    private String givenName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 身份证号码
     */
    private String identityCard;

    /**
     * 护照
     */
    private String passPort;

    /**
     * 证件类型 1:驾照  2:军官证 99:其他
     */
    private Byte papersPype;

    /**
     * 证件号码
     */
    private String papersNumber;

    /**
     * 车牌号
     */
    private String carNumber;

    /**
     * 出生年月
     */
    private Date birthday;

    /**
     * 日生月日
     */
    private String shortBirthday;

    /**
     * 农历生日
     */
    private Date chineseBirthday;

    /**
     * 所在省
     */
    private String location;

    /**
     * 头像地址
     */
    private String photoUrl;

    /**
     * QQ
     */
    private String qqAccount;

    /**
     * 微博
     */
    private String weiboAccount;

    /**
     * 微信
     */
    private String weixinAccount;

    /**
     * 百度
     */
    private String baiduAccount;

    /**
     * 支付宝
     */
    private String alipayAccount;

    /**
     * 豆瓣
     */
    private String doubanAccount;

    /**
     * 固话
     */
    private String telephone;

    /**
     * 工作地址
     */
    private String workAddress;

    /**
     * 居住地
     */
    private String address;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 文化程度（0：小学 1：初中 2：高中 3：中专 4：大专 5：本科 6：硕士 7：其他）
     */
    private Byte educationId;

    /**
     * 职业（0：政府部门 1：金融部门 2：私营企业 3：外资企业 4：企事业单位 5：信息行业 6：服务业 7：医务人员 8：学生 9：其它 ）
     */
    private Byte vocationId;

    /**
     * 收入范围（0：1000元以下 1：1001－1500元 2：1501－2000元 3：2001－3000元 4：3001－4000元 5：4001－5000元 6：5001－6000元 7：6001－8000元 8：8001元以上 ）
     */
    private Byte incomeId;

    /**
     * 所属地类型（1：市区|2：城镇）
     */
    private Byte cityWideid;

    /**
     * 会员类型（1：员工 2：促销 3：顾客 4：团体 5：供应商）
     */
    private Byte degreeId;

    /**
     * 所属地（1：中国大陆 2：香港 3：澳门 4：台湾 5：其他 ）
     */
    private Byte nationId;

    /**
     * 交通工具（1：汽车 2：出租 3：公共汽车 4：摩托车 5：其他）
     */
    private Byte vehicleId;

    /**
     * 民族
     */
    private String nation;

    /**
     * 冻结原因ID 0表示自定义原因
     */
    private Byte reasonId;

    /**
     * 冻结操作人id
     */
    private Integer frozenEditorId;

    /**
     * 冻结时间
     */
    private Date frozenTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 上次修改时间
     */
    private Date updateTime;

    /**
     * 删除标识 1正常2删除
     */
    private Byte delFlag;

    /**
     * 冻结原因
     */
    private String reason;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getPreMemberId() {
        return preMemberId;
    }

    public void setPreMemberId(String preMemberId) {
        this.preMemberId = preMemberId == null ? null : preMemberId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName == null ? null : givenName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    public String getPassPort() {
        return passPort;
    }

    public void setPassPort(String passPort) {
        this.passPort = passPort == null ? null : passPort.trim();
    }

    public Byte getPapersPype() {
        return papersPype;
    }

    public void setPapersPype(Byte papersPype) {
        this.papersPype = papersPype;
    }

    public String getPapersNumber() {
        return papersNumber;
    }

    public void setPapersNumber(String papersNumber) {
        this.papersNumber = papersNumber == null ? null : papersNumber.trim();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getShortBirthday() {
        return shortBirthday;
    }

    public void setShortBirthday(String shortBirthday) {
        this.shortBirthday = shortBirthday == null ? null : shortBirthday.trim();
    }

    public Date getChineseBirthday() {
        return chineseBirthday;
    }

    public void setChineseBirthday(Date chineseBirthday) {
        this.chineseBirthday = chineseBirthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public String getQqAccount() {
        return qqAccount;
    }

    public void setQqAccount(String qqAccount) {
        this.qqAccount = qqAccount == null ? null : qqAccount.trim();
    }

    public String getWeiboAccount() {
        return weiboAccount;
    }

    public void setWeiboAccount(String weiboAccount) {
        this.weiboAccount = weiboAccount == null ? null : weiboAccount.trim();
    }

    public String getWeixinAccount() {
        return weixinAccount;
    }

    public void setWeixinAccount(String weixinAccount) {
        this.weixinAccount = weixinAccount == null ? null : weixinAccount.trim();
    }

    public String getBaiduAccount() {
        return baiduAccount;
    }

    public void setBaiduAccount(String baiduAccount) {
        this.baiduAccount = baiduAccount == null ? null : baiduAccount.trim();
    }

    public String getAlipayAccount() {
        return alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount == null ? null : alipayAccount.trim();
    }

    public String getDoubanAccount() {
        return doubanAccount;
    }

    public void setDoubanAccount(String doubanAccount) {
        this.doubanAccount = doubanAccount == null ? null : doubanAccount.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public Byte getEducationId() {
        return educationId;
    }

    public void setEducationId(Byte educationId) {
        this.educationId = educationId;
    }

    public Byte getVocationId() {
        return vocationId;
    }

    public void setVocationId(Byte vocationId) {
        this.vocationId = vocationId;
    }

    public Byte getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Byte incomeId) {
        this.incomeId = incomeId;
    }

    public Byte getCityWideid() {
        return cityWideid;
    }

    public void setCityWideid(Byte cityWideid) {
        this.cityWideid = cityWideid;
    }

    public Byte getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Byte degreeId) {
        this.degreeId = degreeId;
    }

    public Byte getNationId() {
        return nationId;
    }

    public void setNationId(Byte nationId) {
        this.nationId = nationId;
    }

    public Byte getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Byte vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Byte getReasonId() {
        return reasonId;
    }

    public void setReasonId(Byte reasonId) {
        this.reasonId = reasonId;
    }

    public Integer getFrozenEditorId() {
        return frozenEditorId;
    }

    public void setFrozenEditorId(Integer frozenEditorId) {
        this.frozenEditorId = frozenEditorId;
    }

    public Date getFrozenTime() {
        return frozenTime;
    }

    public void setFrozenTime(Date frozenTime) {
        this.frozenTime = frozenTime;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", preMemberId=").append(preMemberId);
        sb.append(", name=").append(name);
        sb.append(", nickName=").append(nickName);
        sb.append(", familyName=").append(familyName);
        sb.append(", givenName=").append(givenName);
        sb.append(", sex=").append(sex);
        sb.append(", identityCard=").append(identityCard);
        sb.append(", passPort=").append(passPort);
        sb.append(", papersPype=").append(papersPype);
        sb.append(", papersNumber=").append(papersNumber);
        sb.append(", carNumber=").append(carNumber);
        sb.append(", birthday=").append(birthday);
        sb.append(", shortBirthday=").append(shortBirthday);
        sb.append(", chineseBirthday=").append(chineseBirthday);
        sb.append(", location=").append(location);
        sb.append(", photoUrl=").append(photoUrl);
        sb.append(", qqAccount=").append(qqAccount);
        sb.append(", weiboAccount=").append(weiboAccount);
        sb.append(", weixinAccount=").append(weixinAccount);
        sb.append(", baiduAccount=").append(baiduAccount);
        sb.append(", alipayAccount=").append(alipayAccount);
        sb.append(", doubanAccount=").append(doubanAccount);
        sb.append(", telephone=").append(telephone);
        sb.append(", workAddress=").append(workAddress);
        sb.append(", address=").append(address);
        sb.append(", postCode=").append(postCode);
        sb.append(", educationId=").append(educationId);
        sb.append(", vocationId=").append(vocationId);
        sb.append(", incomeId=").append(incomeId);
        sb.append(", cityWideid=").append(cityWideid);
        sb.append(", degreeId=").append(degreeId);
        sb.append(", nationId=").append(nationId);
        sb.append(", vehicleId=").append(vehicleId);
        sb.append(", nation=").append(nation);
        sb.append(", reasonId=").append(reasonId);
        sb.append(", frozenEditorId=").append(frozenEditorId);
        sb.append(", frozenTime=").append(frozenTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", reason=").append(reason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getWhereStr() {
        return whereStr;
    }

    public void setWhereStr(String whereStr) {
        this.whereStr = whereStr;
    }
}