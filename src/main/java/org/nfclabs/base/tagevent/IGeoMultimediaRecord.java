package org.nfclabs.base.tagevent;

public interface IGeoMultimediaRecord extends IMultimediaRecord {
 
	public abstract IGeoLocation getGeoLocation();
	public abstract boolean hasLocation();
}
 
