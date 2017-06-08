package com.np.order.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import com.np.order.Money;

/*
 * 見積書 Model
 *
 * This class was autogenerated on:
 * [Mon Jan 11 18:47:34 JST 2016]
 *
 * [WARNING]
 * Don't edit this class directly, because it may be regenerated late.
 */
@Entity
@Table(name = "ESTMATION_SHEET_TBL")
public class EstmationSheet {
	public static final String TABLE_NAME = "ESTMATION_SHEET_TBL";

	/*
	 * ---------------------- Public Field Names Definition
	 * ----------------------------
	 */
	public static final String EstimationId = "EstimationId";
	public static final String EstimationCd = "EstimationCd";
	public static final String CustomerId = "CustomerId";
	public static final String CustomerName = "CustomerName";
	public static final String Address1 = "Address1";
	public static final String Address2 = "Address2";
	public static final String Address3 = "Address3";
	public static final String Tel = "Tel";
	public static final String Fax = "Fax";
	public static final String Title = "Title";
	public static final String Amount = "Amount";
	public static final String IssueDate = "IssueDate";
	public static final String StaffName = "StaffName";
	public static final String PostCode = "PostCode";
	public static final String Note = "Note";
	public static final String CustomerDept = "CustomerDept";
	public static final String CustomeStaff = "CustomeStaff";
	public static final String LangFlg = "LangFlg";
	public static final String DeliveryType = "DeliveryType";
	public static final String DeliveryAddress = "DeliveryAddress";
	public static final String DeliveryLimitDays = "DeliveryLimitDays";
	public static final String EstimationOkDays = "EstimationOkDays";
	public static final String PaymentCondition = "PaymentCondition";
	public static final String PaymentMethord = "PaymentMethord";
	public static final String DiscountAmount = "DiscountAmount";
	public static final String Currency = "Currency";
	public static final String UserId = "UserId";
	public static final String RegTime = "RegTime";
	public static final String UpdTime = "UpdTime";

	/*
	 * ---------------------- Private Fields Definition
	 * ----------------------------
	 */
	@Id
	/* 报价ID */
	@Column(name = "ESTIMATION_ID", length = 0, nullable = false)
	private Long estimationId;

	/* 踩番规约 */
	@Column(name = "ESTIMATION_CD", length = 64, nullable = false)
	private String estimationCd;

	/* 客户ID */
	@Column(name = "CUSTOMER_ID", length = 0, nullable = true)
	@JoinTable(name = "Customer")
	@JoinColumn(name = "CustomerId")
	private Long customerId;

	/* 客户名称 */
	@Column(name = "CUSTOMER_NAME", length = 64, nullable = true)
	private String customerName;

	/* 地址一 */
	@Column(name = "ADDRESS1", length = 64, nullable = true)
	private String address1;

	/* 地址二 */
	@Column(name = "ADDRESS2", length = 64, nullable = true)
	private String address2;

	/* 地址三 */
	@Column(name = "ADDRESS3", length = 64, nullable = true)
	private String address3;

	/* 电话 */
	@Column(name = "TEL", length = 64, nullable = true)
	private String tel;

	/* fax */
	@Column(name = "FAX", length = 64, nullable = true)
	private String fax;

	/* 标题 */
	@Column(name = "TITLE", length = 64, nullable = true)
	private String title;

	/* 总价 */
	@Column(name = "AMOUNT", length = 0, nullable = true)
	private Money amount;

	/* 发行日期 */
	@Column(name = "ISSUE_DATE", length = 8, nullable = true)
	private String issueDate;

	/* 担当名称 */
	@Column(name = "STAFF_NAME", length = 64, nullable = true)
	private String staffName;

	/* 邮编 */
	@Column(name = "POST_CODE", length = 64, nullable = true)
	private String postCode;

	/* 备考 */
	@Column(name = "NOTE", length = 64, nullable = true)
	private String note;

	/* 客户部门 */
	@Column(name = "CUSTOMER_DEPT", length = 64, nullable = true)
	private String customerDept;

	/* 客户职位 */
	@Column(name = "CUSTOME_STAFF", length = 64, nullable = true)
	private String customeStaff;

	/* 确认标志 */
	@Column(name = "LANG_FLG", length = 64, nullable = true)
	private String langFlg;

	/* 交货方式 */
	@Column(name = "DELIVERY_TYPE", length = 64, nullable = true)
	private String deliveryType;

	/* 交货地址 */
	@Column(name = "DELIVERY_ADDRESS", length = 64, nullable = true)
	private String deliveryAddress;

	/* 交货日期 */
	@Column(name = "DELIVERY_LIMIT_DAYS", length = 64, nullable = true)
	private String deliveryLimitDays;

	/* 报价单有效日期 */
	@Column(name = "ESTIMATION_OK_DAYS", length = 64, nullable = true)
	private String estimationOkDays;

	/* 支払条件 */
	@Column(name = "PAYMENT_CONDITION", length = 64, nullable = true)
	private String paymentCondition;

	/* 支付方式 */
	@Column(name = "PAYMENT_METHORD", length = 64, nullable = true)
	private String paymentMethord;

	/* 折扣数额 */
	@Column(name = "DISCOUNT_AMOUNT", length = 0, nullable = true)
	private Money discountAmount;

	/* 货币类型 */
	@Column(name = "CURRENCY", length = 16, nullable = true)
	private String currency;

	/* ユーザーID */
	@Column(name = "USER_ID", length = 0, nullable = true)
	private Long userId;

	/*  */
	@Column(name = "REG_TIME", length = 0, nullable = true)
	private Long regTime;

	/*  */
	@Column(name = "UPD_TIME", length = 0, nullable = true)
	private Long updTime;

	/*
	 * ---------------------- Getter / Setter Methods
	 * ----------------------------
	 */

	/*
	 * Get the 报价ID
	 * 
	 * @return the value of 报价ID
	 */
	public Long getEstimationId() {
		return estimationId;
	}

	/*
	 * Set the value of 报价ID
	 * 
	 * @param estimationId the new value for 报价ID
	 */
	public void setEstimationId(Long estimationId) {
		this.estimationId = estimationId;
	}

	/*
	 * Get the 踩番规约
	 * 
	 * @return the value of 踩番规约
	 */
	public String getEstimationCd() {
		return estimationCd;
	}

	/*
	 * Set the value of 踩番规约
	 * 
	 * @param estimationCd the new value for 踩番规约
	 */
	public void setEstimationCd(String estimationCd) {
		this.estimationCd = estimationCd;
	}

	/*
	 * Get the 客户ID
	 * 
	 * @return the value of 客户ID
	 */
	public Long getCustomerId() {
		return customerId;
	}

	/*
	 * Set the value of 客户ID
	 * 
	 * @param customerId the new value for 客户ID
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	/*
	 * Get the 客户名称
	 * 
	 * @return the value of 客户名称
	 */
	public String getCustomerName() {
		return customerName;
	}

	/*
	 * Set the value of 客户名称
	 * 
	 * @param customerName the new value for 客户名称
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/*
	 * Get the 地址一
	 * 
	 * @return the value of 地址一
	 */
	public String getAddress1() {
		return address1;
	}

	/*
	 * Set the value of 地址一
	 * 
	 * @param address1 the new value for 地址一
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/*
	 * Get the 地址二
	 * 
	 * @return the value of 地址二
	 */
	public String getAddress2() {
		return address2;
	}

	/*
	 * Set the value of 地址二
	 * 
	 * @param address2 the new value for 地址二
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/*
	 * Get the 地址三
	 * 
	 * @return the value of 地址三
	 */
	public String getAddress3() {
		return address3;
	}

	/*
	 * Set the value of 地址三
	 * 
	 * @param address3 the new value for 地址三
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	/*
	 * Get the 电话
	 * 
	 * @return the value of 电话
	 */
	public String getTel() {
		return tel;
	}

	/*
	 * Set the value of 电话
	 * 
	 * @param tel the new value for 电话
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/*
	 * Get the fax
	 * 
	 * @return the value of fax
	 */
	public String getFax() {
		return fax;
	}

	/*
	 * Set the value of fax
	 * 
	 * @param fax the new value for fax
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/*
	 * Get the 标题
	 * 
	 * @return the value of 标题
	 */
	public String getTitle() {
		return title;
	}

	/*
	 * Set the value of 标题
	 * 
	 * @param title the new value for 标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * Get the 总价
	 * 
	 * @return the value of 总价
	 */
	public Money getAmount() {
		return amount;
	}

	/*
	 * Set the value of 总价
	 * 
	 * @param amount the new value for 总价
	 */
	public void setAmount(Money amount) {
		this.amount = amount;
	}

	/*
	 * Get the 发行日期
	 * 
	 * @return the value of 发行日期
	 */
	public String getIssueDate() {
		return issueDate;
	}

	/*
	 * Set the value of 发行日期
	 * 
	 * @param issueDate the new value for 发行日期
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	/*
	 * Get the 担当名称
	 * 
	 * @return the value of 担当名称
	 */
	public String getStaffName() {
		return staffName;
	}

	/*
	 * Set the value of 担当名称
	 * 
	 * @param staffName the new value for 担当名称
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	/*
	 * Get the 邮编
	 * 
	 * @return the value of 邮编
	 */
	public String getPostCode() {
		return postCode;
	}

	/*
	 * Set the value of 邮编
	 * 
	 * @param postCode the new value for 邮编
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/*
	 * Get the 备考
	 * 
	 * @return the value of 备考
	 */
	public String getNote() {
		return note;
	}

	/*
	 * Set the value of 备考
	 * 
	 * @param note the new value for 备考
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/*
	 * Get the 客户部门
	 * 
	 * @return the value of 客户部门
	 */
	public String getCustomerDept() {
		return customerDept;
	}

	/*
	 * Set the value of 客户部门
	 * 
	 * @param customerDept the new value for 客户部门
	 */
	public void setCustomerDept(String customerDept) {
		this.customerDept = customerDept;
	}

	/*
	 * Get the 客户职位
	 * 
	 * @return the value of 客户职位
	 */
	public String getCustomeStaff() {
		return customeStaff;
	}

	/*
	 * Set the value of 客户职位
	 * 
	 * @param customeStaff the new value for 客户职位
	 */
	public void setCustomeStaff(String customeStaff) {
		this.customeStaff = customeStaff;
	}

	/*
	 * Get the 确认标志
	 * 
	 * @return the value of 确认标志
	 */
	public String getLangFlg() {
		return langFlg;
	}

	/*
	 * Set the value of 确认标志
	 * 
	 * @param langFlg the new value for 确认标志
	 */
	public void setLangFlg(String langFlg) {
		this.langFlg = langFlg;
	}

	/*
	 * Get the 交货方式
	 * 
	 * @return the value of 交货方式
	 */
	public String getDeliveryType() {
		return deliveryType;
	}

	/*
	 * Set the value of 交货方式
	 * 
	 * @param deliveryType the new value for 交货方式
	 */
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	/*
	 * Get the 交货地址
	 * 
	 * @return the value of 交货地址
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/*
	 * Set the value of 交货地址
	 * 
	 * @param deliveryAddress the new value for 交货地址
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	/*
	 * Get the 交货日期
	 * 
	 * @return the value of 交货日期
	 */
	public String getDeliveryLimitDays() {
		return deliveryLimitDays;
	}

	/*
	 * Set the value of 交货日期
	 * 
	 * @param deliveryLimitDays the new value for 交货日期
	 */
	public void setDeliveryLimitDays(String deliveryLimitDays) {
		this.deliveryLimitDays = deliveryLimitDays;
	}

	/*
	 * Get the 报价单有效日期
	 * 
	 * @return the value of 报价单有效日期
	 */
	public String getEstimationOkDays() {
		return estimationOkDays;
	}

	/*
	 * Set the value of 报价单有效日期
	 * 
	 * @param estimationOkDays the new value for 报价单有效日期
	 */
	public void setEstimationOkDays(String estimationOkDays) {
		this.estimationOkDays = estimationOkDays;
	}

	/*
	 * Get the 支払条件
	 * 
	 * @return the value of 支払条件
	 */
	public String getPaymentCondition() {
		return paymentCondition;
	}

	/*
	 * Set the value of 支払条件
	 * 
	 * @param paymentCondition the new value for 支払条件
	 */
	public void setPaymentCondition(String paymentCondition) {
		this.paymentCondition = paymentCondition;
	}

	/*
	 * Get the 支付方式
	 * 
	 * @return the value of 支付方式
	 */
	public String getPaymentMethord() {
		return paymentMethord;
	}

	/*
	 * Set the value of 支付方式
	 * 
	 * @param paymentMethord the new value for 支付方式
	 */
	public void setPaymentMethord(String paymentMethord) {
		this.paymentMethord = paymentMethord;
	}

	/*
	 * Get the 折扣数额
	 * 
	 * @return the value of 折扣数额
	 */
	public Money getDiscountAmount() {
		return discountAmount;
	}

	/*
	 * Set the value of 折扣数额
	 * 
	 * @param discountAmount the new value for 折扣数额
	 */
	public void setDiscountAmount(Money discountAmount) {
		this.discountAmount = discountAmount;
	}

	/*
	 * Get the 货币类型
	 * 
	 * @return the value of 货币类型
	 */
	public String getCurrency() {
		return currency;
	}

	/*
	 * Set the value of 货币类型
	 * 
	 * @param currency the new value for 货币类型
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/*
	 * Get the ユーザーID
	 * 
	 * @return the value of ユーザーID
	 */
	public Long getUserId() {
		return userId;
	}

	/*
	 * Set the value of ユーザーID
	 * 
	 * @param userId the new value for ユーザーID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Long getRegTime() {
		return regTime;
	}

	/*
	 * Set the value of
	 * 
	 * @param regTime the new value for $col.ViewName
	 */
	public void setRegTime(Long regTime) {
		this.regTime = regTime;
	}

	/*
	 * Get the
	 * 
	 * @return the value of $col.ViewName
	 */
	public Long getUpdTime() {
		return updTime;
	}

	/*
	 * Set the value of
	 * 
	 * @param updTime the new value for $col.ViewName
	 */
	public void setUpdTime(Long updTime) {
		this.updTime = updTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t");
		sb.append("EstimationId");
		sb.append("=");
		sb.append(estimationId);
		sb.append("\n");
		sb.append("\t");
		sb.append("EstimationCd");
		sb.append("=");
		sb.append(estimationCd);
		sb.append("\n");
		sb.append("\t");
		sb.append("CustomerId");
		sb.append("=");
		sb.append(customerId);
		sb.append("\n");
		sb.append("\t");
		sb.append("CustomerName");
		sb.append("=");
		sb.append(customerName);
		sb.append("\n");
		sb.append("\t");
		sb.append("Address1");
		sb.append("=");
		sb.append(address1);
		sb.append("\n");
		sb.append("\t");
		sb.append("Address2");
		sb.append("=");
		sb.append(address2);
		sb.append("\n");
		sb.append("\t");
		sb.append("Address3");
		sb.append("=");
		sb.append(address3);
		sb.append("\n");
		sb.append("\t");
		sb.append("Tel");
		sb.append("=");
		sb.append(tel);
		sb.append("\n");
		sb.append("\t");
		sb.append("Fax");
		sb.append("=");
		sb.append(fax);
		sb.append("\n");
		sb.append("\t");
		sb.append("Title");
		sb.append("=");
		sb.append(title);
		sb.append("\n");
		sb.append("\t");
		sb.append("Amount");
		sb.append("=");
		sb.append(amount);
		sb.append("\n");
		sb.append("\t");
		sb.append("IssueDate");
		sb.append("=");
		sb.append(issueDate);
		sb.append("\n");
		sb.append("\t");
		sb.append("StaffName");
		sb.append("=");
		sb.append(staffName);
		sb.append("\n");
		sb.append("\t");
		sb.append("PostCode");
		sb.append("=");
		sb.append(postCode);
		sb.append("\n");
		sb.append("\t");
		sb.append("Note");
		sb.append("=");
		sb.append(note);
		sb.append("\n");
		sb.append("\t");
		sb.append("CustomerDept");
		sb.append("=");
		sb.append(customerDept);
		sb.append("\n");
		sb.append("\t");
		sb.append("CustomeStaff");
		sb.append("=");
		sb.append(customeStaff);
		sb.append("\n");
		sb.append("\t");
		sb.append("LangFlg");
		sb.append("=");
		sb.append(langFlg);
		sb.append("\n");
		sb.append("\t");
		sb.append("DeliveryType");
		sb.append("=");
		sb.append(deliveryType);
		sb.append("\n");
		sb.append("\t");
		sb.append("DeliveryAddress");
		sb.append("=");
		sb.append(deliveryAddress);
		sb.append("\n");
		sb.append("\t");
		sb.append("DeliveryLimitDays");
		sb.append("=");
		sb.append(deliveryLimitDays);
		sb.append("\n");
		sb.append("\t");
		sb.append("EstimationOkDays");
		sb.append("=");
		sb.append(estimationOkDays);
		sb.append("\n");
		sb.append("\t");
		sb.append("PaymentCondition");
		sb.append("=");
		sb.append(paymentCondition);
		sb.append("\n");
		sb.append("\t");
		sb.append("PaymentMethord");
		sb.append("=");
		sb.append(paymentMethord);
		sb.append("\n");
		sb.append("\t");
		sb.append("DiscountAmount");
		sb.append("=");
		sb.append(discountAmount);
		sb.append("\n");
		sb.append("\t");
		sb.append("Currency");
		sb.append("=");
		sb.append(currency);
		sb.append("\n");
		sb.append("\t");
		sb.append("UserId");
		sb.append("=");
		sb.append(userId);
		sb.append("\n");
		sb.append("\t");
		sb.append("RegTime");
		sb.append("=");
		sb.append(regTime);
		sb.append("\n");
		sb.append("\t");
		sb.append("UpdTime");
		sb.append("=");
		sb.append(updTime);
		sb.append("\n");
		return sb.toString();
	}

}
