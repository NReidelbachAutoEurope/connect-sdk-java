/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class OrderReferences {

	private String descriptor = null;

	private OrderInvoiceData invoiceData = null;

	private Long merchantOrderId = null;

	private String merchantReference = null;

	/**
	 * Descriptive text that is used towards to consumer, either during an online checkout at a third party and/or on the statement of the consumer. For card transactions this is usually referred to as a Soft Descriptor. The maximum allowed length varies per card acquirer:
	 * <ul><li>AIB - 22 characters
	 * <li>American Express - 25 characters
	 * <li>Atos Origin BNP - 15 characters
	 * <li>Barclays - 25 characters
	 * <li>Catella - 22 characters
	 * <li>CBA - 20 characters
	 * <li>Elavon - 25 characters
	 * <li>First Data - 25 characters
	 * <li>INICIS (INIPAY) - 22-30 characters
	 * <li>JCB - 25 characters
	 * <li>Merchant Solutions - 22-25 characters
	 * <li>Payvision (EU &amp; HK) - 25 characters
	 * <li>SEB Euroline - 22 characters
	 * <li>Sub1 Argentina - 15 characters
	 * <li>Wells Fargo - 25 characters
	 * </ul>
	 * Note that we advise you to use 22 characters as the max length as beyond this our experience is that issuers will start to truncate. We currently also only allow per API call overrides for AIB and Barclays<br>
	 * For alternative payment products the maximum allowed length varies per payment product:
	 * <ul><li>402 eCard Poland - 30 characters
	 * <li>404 INICIS - 80 characters
	 * <li>802 Nordea ePayment Finland - 234 characters
	 * <li>809 iDeal - 32 characters
	 * <li>819 Aktia - 210 characters
	 * <li>836 SOFORT - 42 characters
	 * <li>840 PayPal - 127 characters
	 * <li>841 WebMoney - 175 characters
	 * <li>845 CashU - 250 characters
	 * <li>849 Yandex - 64 characters
	 * <li>861 Alipay - 256 characters
	 * <li>880 BOKU - 20 characters
	 * <li>8580 Qiwi - 255 characters
	 * <li>1504 Konbini - 80 characters
	 * </ul>
	 * All other payment products don't support a descriptor.
	 */
	public String getDescriptor() {
		return descriptor;
	}

	/**
	 * Descriptive text that is used towards to consumer, either during an online checkout at a third party and/or on the statement of the consumer. For card transactions this is usually referred to as a Soft Descriptor. The maximum allowed length varies per card acquirer:
	 * <ul><li>AIB - 22 characters
	 * <li>American Express - 25 characters
	 * <li>Atos Origin BNP - 15 characters
	 * <li>Barclays - 25 characters
	 * <li>Catella - 22 characters
	 * <li>CBA - 20 characters
	 * <li>Elavon - 25 characters
	 * <li>First Data - 25 characters
	 * <li>INICIS (INIPAY) - 22-30 characters
	 * <li>JCB - 25 characters
	 * <li>Merchant Solutions - 22-25 characters
	 * <li>Payvision (EU &amp; HK) - 25 characters
	 * <li>SEB Euroline - 22 characters
	 * <li>Sub1 Argentina - 15 characters
	 * <li>Wells Fargo - 25 characters
	 * </ul>
	 * Note that we advise you to use 22 characters as the max length as beyond this our experience is that issuers will start to truncate. We currently also only allow per API call overrides for AIB and Barclays<br>
	 * For alternative payment products the maximum allowed length varies per payment product:
	 * <ul><li>402 eCard Poland - 30 characters
	 * <li>404 INICIS - 80 characters
	 * <li>802 Nordea ePayment Finland - 234 characters
	 * <li>809 iDeal - 32 characters
	 * <li>819 Aktia - 210 characters
	 * <li>836 SOFORT - 42 characters
	 * <li>840 PayPal - 127 characters
	 * <li>841 WebMoney - 175 characters
	 * <li>845 CashU - 250 characters
	 * <li>849 Yandex - 64 characters
	 * <li>861 Alipay - 256 characters
	 * <li>880 BOKU - 20 characters
	 * <li>8580 Qiwi - 255 characters
	 * <li>1504 Konbini - 80 characters
	 * </ul>
	 * All other payment products don't support a descriptor.
	 */
	public void setDescriptor(String value) {
		this.descriptor = value;
	}

	/**
	 * Object containing additional invoice data
	 */
	public OrderInvoiceData getInvoiceData() {
		return invoiceData;
	}

	/**
	 * Object containing additional invoice data
	 */
	public void setInvoiceData(OrderInvoiceData value) {
		this.invoiceData = value;
	}

	/**
	 * Your order identifier<br>
	 * Note: This does not need to have a unique value for each transaction. This allows your to link multiple transactions to the same logical order in your system.
	 */
	public Long getMerchantOrderId() {
		return merchantOrderId;
	}

	/**
	 * Your order identifier<br>
	 * Note: This does not need to have a unique value for each transaction. This allows your to link multiple transactions to the same logical order in your system.
	 */
	public void setMerchantOrderId(Long value) {
		this.merchantOrderId = value;
	}

	/**
	 * Your unique reference of the transaction that is also returned in our report files. This is almost always used for your reconciliation of our report files.
	 */
	public String getMerchantReference() {
		return merchantReference;
	}

	/**
	 * Your unique reference of the transaction that is also returned in our report files. This is almost always used for your reconciliation of our report files.
	 */
	public void setMerchantReference(String value) {
		this.merchantReference = value;
	}
}
