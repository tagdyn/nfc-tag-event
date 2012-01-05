package org.nfclabs.base.narrative;

import org.nfclabs.base.context.INfcTag;

public interface INfcTagGenealogy {
 
	public abstract INfcTag getNfcTag();
	public abstract long getInServiceDate();
	/**
	 * Identifies the defective or missing RFID tag that this RFID tag replaced.
	 */
	public abstract INfcTag getReplacedNfcTag();
	public abstract long getExpirationDate();
	/**
	 * Identifies the new and functional RFID tag that was used to replace this defective or missing RFID tag.
	 */
	public abstract INfcTag getReplacedByNfcTag();
}
 
