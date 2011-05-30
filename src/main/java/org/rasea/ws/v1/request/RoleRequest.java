/*
 * Rasea Server
 * 
 * Copyright (c) 2008, Rasea <http://rasea.org>. All rights reserved.
 *
 * Rasea Server is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://gnu.org/licenses>
 * or write to the Free Software Foundation, Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.rasea.ws.v1.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.rasea.ws.v1.type.RoleType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "applicationName", "role" })
public class RoleRequest {

	@XmlElement(required = true)
	private String applicationName;

	@XmlElement(required = true)
	private RoleType role;

	public String getApplicationName() {
		return this.applicationName;
	}

	public RoleType getRole() {
		return this.role;
	}

	public void setApplicationName(final String applicationName) {
		this.applicationName = applicationName;
	}

	public void setRole(final RoleType role) {
		this.role = role;
	}
}
