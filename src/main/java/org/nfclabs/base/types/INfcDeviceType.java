package org.nfclabs.base.types;

import org.nfclabs.base.ITypeObject;
import org.nfclabs.base.IMetadataCollection;

public interface INfcDeviceType extends ITypeObject, IMetadataCollection {
 
	public abstract NfcDeviceFormFactor getDeviceFormFactor();
}
 
