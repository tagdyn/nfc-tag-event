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

package org.nfclabs.pojo.narrative;

import org.nfclabs.base.IMetadata;
import org.nfclabs.base.INamespace;
import org.nfclabs.base.context.INfcApplication;
import org.nfclabs.base.context.INfcTag;
import org.nfclabs.base.narrative.INfcTagDefinition;
import org.nfclabs.base.types.INfcTagTaxonomyType;
import org.nfclabs.pojo.MetadataCollection;

import java.util.List;
import java.util.Set;

public class NfcTagDefinition implements INfcTagDefinition
{
    protected INfcApplication application;
    protected INfcTag tag;
    protected INfcTagTaxonomyType taxonomyType;

    private MetadataCollection metadataCollection = new MetadataCollection();

    @Override
    public INfcApplication getNfcApplication()
    {
        return application;
    }

    @Override
    public INfcTag getNfcTag()
    {
        return tag;
    }

    @Override
    public INfcTagTaxonomyType getTagTaxonomyType()
    {
        return taxonomyType;
    }

    @Override
    public Set<INamespace> getMetadataNamespaces()
    {
        return metadataCollection.getMetadataNamespaces();
    }

    @Override
    public List<IMetadata> getMetadataProperties(INamespace namespace)
    {
        return metadataCollection.getMetadataProperties(namespace);
    }

    @Override
    public String getMetadataProperty(INamespace namespace, String propertyName)
    {
        return metadataCollection.getMetadataProperty(namespace, propertyName);
    }
}
