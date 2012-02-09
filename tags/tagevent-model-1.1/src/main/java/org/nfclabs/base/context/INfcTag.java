package org.nfclabs.base.context;

import org.nfclabs.base.types.INfcTagPhysicalType;
import org.nfclabs.base.tagevent.IGeoLocation;

public interface INfcTag {
 
	public abstract String getSerialNumber();
	public abstract INfcTagPhysicalType getTagPhysicalType();
	public abstract IGeoLocation getGeoLocation();
	public abstract boolean hasLocation();
}
 
