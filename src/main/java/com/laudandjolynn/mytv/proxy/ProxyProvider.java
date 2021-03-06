/*******************************************************************************
 * Copyright 2015 htd0324@gmail.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.laudandjolynn.mytv.proxy;

import java.util.List;

import com.laudandjolynn.mytv.model.Proxy;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2015年4月28日 下午5:44:44
 * @copyright: www.laudandjolynn.com
 */
public interface ProxyProvider {
	public List<Proxy> getProxies();
}
