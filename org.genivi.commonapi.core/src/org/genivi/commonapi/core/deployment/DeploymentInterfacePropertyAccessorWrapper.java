/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package org.genivi.commonapi.core.deployment;

import org.franca.core.franca.FInterface;
import org.franca.deploymodel.core.FDeployedInterface;
import org.genivi.commonapi.core.deployment.DeploymentInterfacePropertyAccessor;

public class DeploymentInterfacePropertyAccessorWrapper extends DeploymentInterfacePropertyAccessor {
	
	boolean encapsulate;

	public DeploymentInterfacePropertyAccessorWrapper(FDeployedInterface target) {
		super(target);
		encapsulate = (target == null); 
	}
	
	public DeploymentInterfacePropertyAccessor.EnumBackingType getEnumBackingType(FInterface obj) {
		if(encapsulate) {
			return DeploymentInterfacePropertyAccessor.EnumBackingType.Int32;
		}
		return super.getEnumBackingType(obj);
	}
}