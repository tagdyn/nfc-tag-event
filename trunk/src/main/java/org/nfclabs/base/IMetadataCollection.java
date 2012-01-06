package org.nfclabs.base;

import java.util.Set;
import java.util.List;

public interface IMetadataCollection {
 
	public abstract Set<INamespace> getMetadataNamespaces();
	public abstract List<IMetadata> getMetadataProperties(INamespace namespace);
	public abstract String getMetadataProperty(INamespace namespace, String propertyName);
}
 
