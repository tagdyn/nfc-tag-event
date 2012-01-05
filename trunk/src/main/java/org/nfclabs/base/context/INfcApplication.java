package org.nfclabs.base.context;

import org.nfclabs.base.IMetadataCollection;
import org.nfclabs.base.INamespace;
import org.nfclabs.base.ISimpleObject;

public interface INfcApplication extends IMetadataCollection, INamespace, IVersion, ISimpleObject {
 
	public abstract String getIconURI();
}
 
