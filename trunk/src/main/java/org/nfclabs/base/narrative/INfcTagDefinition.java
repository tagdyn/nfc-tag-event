package org.nfclabs.base.narrative;

import org.nfclabs.base.IMetadataCollection;
import org.nfclabs.base.context.INfcApplication;
import org.nfclabs.base.context.INfcTag;
import org.nfclabs.base.types.INfcTagTaxonomyType;

public interface INfcTagDefinition extends IMetadataCollection {
 
	public abstract INfcApplication getNfcApplication();
	public abstract INfcTag getNfcTag();
	public abstract INfcTagTaxonomyType getTagTaxonomyType();
}
 
