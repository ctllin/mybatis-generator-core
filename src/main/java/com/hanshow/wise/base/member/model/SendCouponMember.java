package com.hanshow.wise.base.member.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: SendCouponMember</p>
 * <p>Description:发卷信息-会员信息 关联表 </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: www.hanshow.com</p>
 * @author hanshow
 * @date 2018-05-15 14:21:52
 * @version 1.0
 */
public class SendCouponMember implements Serializable {
    /**
    * 分页查询条件
    */
    private String whereStr;

    /**
     * 主键
     */
    private String id;

    /**
     * 发卷主键对应provide_coupon主键
     */
    private Integer sendCouponId;

    /**
     * 会员id
     */
    private String memberId;

    /**
     * 会员手机号码
     */
    private String memberPhoneNumber;

    /**
     * 1未使用2已经使用
     */
    private Byte status;

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
    private Short delFlag;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSendCouponId() {
        return sendCouponId;
    }

    public void setSendCouponId(Integer sendCouponId) {
        this.sendCouponId = sendCouponId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber == null ? null : memberPhoneNumber.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
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
        sb.append(", sendCouponId=").append(sendCouponId);
        sb.append(", memberId=").append(memberId);
        sb.append(", memberPhoneNumber=").append(memberPhoneNumber);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", delFlag=").append(delFlag);
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