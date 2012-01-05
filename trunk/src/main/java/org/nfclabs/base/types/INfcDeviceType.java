package org.nfclabs.base.types;

import org.nfclabs.base.IMetadataCollection;
import org.nfclabs.base.ITypeObject;

public interface INfcDeviceType extends ITypeObject, IMetadataCollection {
 
	public abstract NfcDeviceFormFactor getDeviceFormFactor();
}
 
