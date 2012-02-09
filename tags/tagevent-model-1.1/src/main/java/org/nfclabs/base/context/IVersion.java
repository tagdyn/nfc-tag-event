/*
 * Copyright 2011-2012 NFC Labs
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.nfclabs.base.context;


/**
 *  Standardized versioning used to define extension and mobile application versions.
 *   <p/>
 *   A normal version number MUST take the form X.Y.Z where X, Y, and Z are integers.
 *   <p/>
 *   <ul>
 *   <li>X is the major version</li>
 *   <li>Y is the minor version</li>
 *   <li>Z is the patch version</li>
 *   </ul>
 *   <p/>
 *   Each element MUST increase numerically. For instance: 1.9.0 < 1.10.0 < 1.11.0.
 *   
 *  @see <a href="http://semver.org/">Semantic Versioning</a>
 * 
 */
public interface IVersion {
 
	/**
	 *  Major version.
	 *  <p/>
	 *  Major version X (X.y.z | X > 0) MUST be incremented if any <b>backwards <i>incompatible</i> public API</b>
	 *  functionality is introduced. It MAY include minor and patch level changes.
	 *  @return Major version
	 *  
	 * 
	 */
	public abstract int getMajor();
	/**
	 *  Minor version.
	 *  <p/>
	 *  Minor version Y (x.Y.z | x > 0) MUST be incremented if new, <b>backwards compatible public API</b> functionality
	 *  is introduced. It MAY be incremented if substantial new functionality or improvements are introduced within the
	 *  private code. It MAY include patch level changes.
	 *  @return Minor version
	 * 
	 */
	public abstract int getMinor();
	/**
	 *  Patch level.
	 *  <p/>
	 *  Patch version Z (x.y.Z | x > 0) MUST be incremented if only <b>backwards compatible bug fixes</b> are
	 *  introduced. A bug fix is defined as an internal change that fixes incorrect behavior.
	 *  <p/>
	 *  A special version number MAY be denoted by appending an arbitrary string immediately following the patch version.
	 *  The string MUST be comprised of only alphanumerics plus dash [0-9A-Za-z-] and MUST begin with an alpha character
	 *  [A-Za-z]. Special versions satisfy but have a lower precedence than the associated normal version. Precedence
	 *  SHOULD be determined by lexicographic ASCII sort order. For instance: 1.0.0beta1 < 1.0.0beta2 < 1.0.0.
	 *  @return Patch level
	 * 
	 */
	public abstract String getPatch();
}
 
