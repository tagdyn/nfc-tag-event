package org.nfclabs.base.context;

import org.nfclabs.base.INamespace;
import org.nfclabs.base.IMetadataCollection;

public interface INfcUser extends INamespace, IMetadataCollection {
 
	public abstract String getUserName();
}
 
