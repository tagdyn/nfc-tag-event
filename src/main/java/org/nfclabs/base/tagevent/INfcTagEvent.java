package org.nfclabs.base.tagevent;

import org.nfclabs.base.IUniqueObject;
import org.nfclabs.base.context.INfcApplication;
import org.nfclabs.base.context.INfcDevice;
import org.nfclabs.base.context.INfcTag;
import org.nfclabs.base.context.INfcUser;
import org.nfclabs.base.types.INfcTagEventType;

public interface INfcTagEvent extends IUniqueObject, IBitemporalObject {
 
	public abstract INfcUser getNfcUser();
	public abstract INfcDevice getNfcDevice();
	public abstract INfcApplication getNfcApplication();
	public abstract INfcTag getNfcTag();
	public abstract IGeoLocation getGeoLocation();
	public abstract INfcTagEventType getEventType();
	public abstract String getEventData();
}
 
