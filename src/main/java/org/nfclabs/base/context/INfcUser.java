package org.nfclabs.base.context;

import org.nfclabs.base.IMetadataCollection;
import org.nfclabs.base.INamespace;

public interface INfcUser extends INamespace, IMetadataCollection {
 
	public abstract String getUserName();
}
 
