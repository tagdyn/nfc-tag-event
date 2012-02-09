/*
 * Copyright 2011-2012 NFC Labs
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.nfclabs.base.context;

import org.nfclabs.base.types.INfcTagPhysicalType;
import org.nfclabs.base.tagevent.IGeoLocation;

public interface INfcTag {
 
	public abstract String getSerialNumber();
	public abstract INfcTagPhysicalType getTagPhysicalType();
	public abstract IGeoLocation getGeolocation();
}
 