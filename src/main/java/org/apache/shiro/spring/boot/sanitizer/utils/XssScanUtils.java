/*
 * Copyright (c) 2018, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.shiro.spring.boot.sanitizer.utils;

import org.apache.commons.lang3.ArrayUtils;

public class XssScanUtils {
	
	public static boolean isXssHeader(String[] policyHeaders, String name) {
		if(policyHeaders != null && policyHeaders.length > 0){
			return ArrayUtils.contains(policyHeaders, name);
		}
		return false;
	}
	
}
