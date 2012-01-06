package org.nfclabs.base.context;

import org.nfclabs.base.INamespace;
import org.nfclabs.base.IMetadataCollection;
import org.nfclabs.base.types.INfcDeviceType;

public interface INfcDevice extends INamespace, IMetadataCollection {
 
	public abstract String getSerialNumber();
	public abstract INfcDeviceType getNfcDeviceType();
}
 
