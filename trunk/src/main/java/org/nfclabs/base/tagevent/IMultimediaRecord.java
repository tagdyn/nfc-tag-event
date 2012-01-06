package org.nfclabs.base.tagevent;

import org.nfclabs.base.IUniqueObject;

public interface IMultimediaRecord extends IBitemporalObject, IVirtualObject, IUniqueObject {
 
	public abstract INfcTagEvent getNfcTagEvent();
}
 
