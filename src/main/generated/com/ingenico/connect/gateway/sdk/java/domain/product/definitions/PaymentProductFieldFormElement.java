/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

public class PaymentProductFieldFormElement {

	private String type = null;

	private List<ValueMappingElement> valueMapping = null;

	/**
	 * Type of form element to be used. The following types can be returned:
	 * <ul>
	 * <li>text - A normal text input field
	 * <li>list - A list of values that the consumer needs to choose from is detailed in the <span class="property">valueMapping</span> array
	 * <li>currency - Currency fields should be split into two fields, with the second one being specifically for the cents
	 * </ul>
	 */
	public String getType() {
		return type;
	}

	/**
	 * Type of form element to be used. The following types can be returned:
	 * <ul>
	 * <li>text - A normal text input field
	 * <li>list - A list of values that the consumer needs to choose from is detailed in the <span class="property">valueMapping</span> array
	 * <li>currency - Currency fields should be split into two fields, with the second one being specifically for the cents
	 * </ul>
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * An array of values and displayNames that should be used to populate the list object in the GUI
	 */
	public List<ValueMappingElement> getValueMapping() {
		return valueMapping;
	}

	/**
	 * An array of values and displayNames that should be used to populate the list object in the GUI
	 */
	public void setValueMapping(List<ValueMappingElement> value) {
		this.valueMapping = value;
	}
}
