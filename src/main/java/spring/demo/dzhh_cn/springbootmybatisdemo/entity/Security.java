package spring.demo.dzhh_cn.springbootmybatisdemo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 证券信息表
 * </p>
 *
 * @author dongzhihua
 * @since 2018-05-15
 */
@TableName("abs_mall_security")
public class Security implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证券的或者产品的-security_id
     */
    @TableId(value = "security_id", type = IdType.AUTO)
    private Integer securityId;
    /**
     * 证券内部代码
     */
    private String securityInternalId;
    /**
     * 证券代码
     */
    private String securityCode;
    /**
     * 证券组
     */
    private String securityGroup;
    /**
     * 证券类型
     */
    private String securityType;
    /**
     * 证券简称/产品简称
     */
    private String securityName;
    /**
     * 证券全称/产品全称
     */
    private String securityFullName;
    /**
     * 证券描述/产品描述
     */
    private String securityDescription;
    /**
     * 票面利率(发行时)
     */
    private BigDecimal coupon;
    /**
     * 利率类型
     */
    private String couponType;
    /**
     * 每年付息次数
     */
    private String couponFrequency;
    /**
     * 利率说明
     */
    private String couponDescription;
    /**
     * 基准利率
     */
    private BigDecimal couponBaseRate;
    /**
     * 基准利率公式
     */
    private String couponBaseRateRule;
    /**
     * 基准利率公式描述
     */
    private String couponBaseRateDescription;
    /**
     * 固定利差
     */
    private BigDecimal spread;
    /**
     * 凭证类别
     */
    private String issueForm;
    /**
     * 计息期规则
     */
    private String dayCount;
    /**
     * 每份面值(元)
     */
    private BigDecimal par;
    /**
     * 发行金额
     */
    private BigDecimal issueAmount;
    /**
     * 发行日
     */
    private Date issueDate;
    /**
     * 到期日
     */
    private Date maturityDate;
    /**
     * 发行方式
     */
    private String issueType;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdDate;
    /**
     * 修改人
     */
    private String lastModifiedBy;
    /**
     * 修改时间
     */
    private Date modifiedDate;
    /**
     * 备注
     */
    private String remark;
    /**
     * 交易流通场所
     */
    private String exchange;


    public Integer getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Integer securityId) {
        this.securityId = securityId;
    }

    public String getSecurityInternalId() {
        return securityInternalId;
    }

    public void setSecurityInternalId(String securityInternalId) {
        this.securityInternalId = securityInternalId;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityFullName() {
        return securityFullName;
    }

    public void setSecurityFullName(String securityFullName) {
        this.securityFullName = securityFullName;
    }

    public String getSecurityDescription() {
        return securityDescription;
    }

    public void setSecurityDescription(String securityDescription) {
        this.securityDescription = securityDescription;
    }

    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getCouponFrequency() {
        return couponFrequency;
    }

    public void setCouponFrequency(String couponFrequency) {
        this.couponFrequency = couponFrequency;
    }

    public String getCouponDescription() {
        return couponDescription;
    }

    public void setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription;
    }

    public BigDecimal getCouponBaseRate() {
        return couponBaseRate;
    }

    public void setCouponBaseRate(BigDecimal couponBaseRate) {
        this.couponBaseRate = couponBaseRate;
    }

    public String getCouponBaseRateRule() {
        return couponBaseRateRule;
    }

    public void setCouponBaseRateRule(String couponBaseRateRule) {
        this.couponBaseRateRule = couponBaseRateRule;
    }

    public String getCouponBaseRateDescription() {
        return couponBaseRateDescription;
    }

    public void setCouponBaseRateDescription(String couponBaseRateDescription) {
        this.couponBaseRateDescription = couponBaseRateDescription;
    }

    public BigDecimal getSpread() {
        return spread;
    }

    public void setSpread(BigDecimal spread) {
        this.spread = spread;
    }

    public String getIssueForm() {
        return issueForm;
    }

    public void setIssueForm(String issueForm) {
        this.issueForm = issueForm;
    }

    public String getDayCount() {
        return dayCount;
    }

    public void setDayCount(String dayCount) {
        this.dayCount = dayCount;
    }

    public BigDecimal getPar() {
        return par;
    }

    public void setPar(BigDecimal par) {
        this.par = par;
    }

    public BigDecimal getIssueAmount() {
        return issueAmount;
    }

    public void setIssueAmount(BigDecimal issueAmount) {
        this.issueAmount = issueAmount;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public String toString() {
        return "Security{" +
        ", securityId=" + securityId +
        ", securityInternalId=" + securityInternalId +
        ", securityCode=" + securityCode +
        ", securityGroup=" + securityGroup +
        ", securityType=" + securityType +
        ", securityName=" + securityName +
        ", securityFullName=" + securityFullName +
        ", securityDescription=" + securityDescription +
        ", coupon=" + coupon +
        ", couponType=" + couponType +
        ", couponFrequency=" + couponFrequency +
        ", couponDescription=" + couponDescription +
        ", couponBaseRate=" + couponBaseRate +
        ", couponBaseRateRule=" + couponBaseRateRule +
        ", couponBaseRateDescription=" + couponBaseRateDescription +
        ", spread=" + spread +
        ", issueForm=" + issueForm +
        ", dayCount=" + dayCount +
        ", par=" + par +
        ", issueAmount=" + issueAmount +
        ", issueDate=" + issueDate +
        ", maturityDate=" + maturityDate +
        ", issueType=" + issueType +
        ", createdBy=" + createdBy +
        ", createdDate=" + createdDate +
        ", lastModifiedBy=" + lastModifiedBy +
        ", modifiedDate=" + modifiedDate +
        ", remark=" + remark +
        ", exchange=" + exchange +
        "}";
    }
}
