package org.nfclabs.base.context;

import org.nfclabs.base.tagevent.IGeoLocation;
import org.nfclabs.base.types.INfcTagPhysicalType;

public interface INfcTag {
 
	public abstract String getSerialNumber();
	public abstract INfcTagPhysicalType getTagPhysicalType();
	public abstract IGeoLocation getGeolocation();
}
 
