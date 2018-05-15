package com.hanshow.wise.base.member.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: SendCoupon</p>
 * <p>Description:新建发卷信息 </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: www.hanshow.com</p>
 * @author hanshow
 * @date 2018-05-15 14:21:52
 * @version 1.0
 */
public class SendCoupon implements Serializable {
    /**
    * 分页查询条件
    */
    private String whereStr;

    /**
     * 主键
     */
    private String id;

    /**
     * 优惠卷类型：1首单2注册
     */
    private Integer couponType;

    /**
     * 优惠卷主键
     */
    private Integer couponId;

    /**
     * 优惠卷唯一标识
     */
    private String couponUuid;

    /**
     * 优惠卷批次号
     */
    private String couponBatchNumber;

    /**
     * 优惠卷名称
     */
    private String couponName;

    /**
     * 执行时间（别名发放时间）
     */
    private Date execTime;

    /**
     * 短信通知：1通知2不通知
     */
    private Integer messageNotice;

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

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponUuid() {
        return couponUuid;
    }

    public void setCouponUuid(String couponUuid) {
        this.couponUuid = couponUuid == null ? null : couponUuid.trim();
    }

    public String getCouponBatchNumber() {
        return couponBatchNumber;
    }

    public void setCouponBatchNumber(String couponBatchNumber) {
        this.couponBatchNumber = couponBatchNumber == null ? null : couponBatchNumber.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public Date getExecTime() {
        return execTime;
    }

    public void setExecTime(Date execTime) {
        this.execTime = execTime;
    }

    public Integer getMessageNotice() {
        return messageNotice;
    }

    public void setMessageNotice(Integer messageNotice) {
        this.messageNotice = messageNotice;
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
        sb.append(", couponType=").append(couponType);
        sb.append(", couponId=").append(couponId);
        sb.append(", couponUuid=").append(couponUuid);
        sb.append(", couponBatchNumber=").append(couponBatchNumber);
        sb.append(", couponName=").append(couponName);
        sb.append(", execTime=").append(execTime);
        sb.append(", messageNotice=").append(messageNotice);
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