/*
 * Copyright 2013-2016 Uncharted Software Inc.
 *
 *  Property of Uncharted(TM), formerly Oculus Info Inc.
 *  https://uncharted.software/
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package influent.server.spi.impl.anb;

import javax.xml.bind.annotation.XmlAttribute;

public class LinkStyle {
	
	private String attrArrowStyle;
	private String attrType;
	
	//------------------------------------------------------------------------------------------------------------------
    
    public LinkStyle() {}
    
	//------------------------------------------------------------------------------------------------------------------

	@XmlAttribute
    public void setAttrArrowStyle(String attrArrowStyle) {
		this.attrArrowStyle = attrArrowStyle;
	}
	
	//------------------------------------------------------------------------------------------------------------------

	public String getAttrArrowStyle() {
		return this.attrArrowStyle;
	}
	
	//------------------------------------------------------------------------------------------------------------------

	@XmlAttribute
    public void setAttrType(String attrType) {
		this.attrType = attrType;
	}
	
	//------------------------------------------------------------------------------------------------------------------

	public String getAttrType() {
		return this.attrType;
	}
}

