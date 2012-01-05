package org.nfclabs.base;

import java.util.List;
import java.util.Set;

public interface IMetadataCollection {
 
	public abstract Set<INamespace> getMetadataNamespaces();
	public abstract List<IMetadata> getMetadataProperties(INamespace namespace);
	public abstract String getMetadataProperty(INamespace namespace, String propertyName);
}
 
