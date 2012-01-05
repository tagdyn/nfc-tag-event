package org.nfclabs.base.types;

import org.nfclabs.base.ITypeObject;


/**
 * Domain specific taxonomy for a tag, for example, a smart poster tag, a WebCam tag, a Foo tag, etc.
 */
public interface INfcTagTaxonomyType extends ITypeObject {
 
	public abstract String getURN();
}
 
