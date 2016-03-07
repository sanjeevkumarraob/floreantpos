/**
 * ************************************************************************
 * * The contents of this file are subject to the MRPL 1.2
 * * (the  "License"),  being   the  Mozilla   Public  License
 * * Version 1.1  with a permitted attribution clause; you may not  use this
 * * file except in compliance with the License. You  may  obtain  a copy of
 * * the License at http://www.floreantpos.org/license.html
 * * Software distributed under the License  is  distributed  on  an "AS IS"
 * * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * * License for the specific  language  governing  rights  and  limitations
 * * under the License.
 * * The Original Code is FLOREANT POS.
 * * The Initial Developer of the Original Code is OROCUBE LLC
 * * All portions are Copyright (C) 2015 OROCUBE LLC
 * * All Rights Reserved.
 * ************************************************************************
 */
package com.floreantpos.ui.views.order;

import org.apache.commons.lang.StringUtils;

import com.floreantpos.Messages;
import com.floreantpos.model.OrderTypeProperties;

public enum OrderType {
	DINE_IN, TAKE_OUT, PICKUP, HOME_DELIVERY, DRIVE_THRU, BAR_TAB, RETAIL, FOR_HERE;

	private OrderTypeProperties properties;

	public String toString() {
		if (properties != null && StringUtils.isNotEmpty(properties.getAlias())) {
			return properties.getAlias();
		}

		String string = Messages.getString(name());
		if (StringUtils.isEmpty(string)) {
			return name().replaceAll("_", " "); //$NON-NLS-1$ //$NON-NLS-2$
		}

		return string;
	}

	public OrderTypeProperties getProperties() {
		return properties;
	}

	public void setProperties(OrderTypeProperties properties) {
		this.properties = properties;
	};

	public boolean isVisible() {
		return this.properties.isVisible();
	}
}