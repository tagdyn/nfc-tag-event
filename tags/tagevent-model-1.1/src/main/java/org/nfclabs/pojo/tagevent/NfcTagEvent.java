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

package org.nfclabs.pojo.tagevent;

import org.nfclabs.base.context.INfcApplication;
import org.nfclabs.base.context.INfcDevice;
import org.nfclabs.base.context.INfcTag;
import org.nfclabs.base.context.INfcUser;
import org.nfclabs.base.tagevent.IGeoLocation;
import org.nfclabs.base.tagevent.INfcTagEvent;
import org.nfclabs.base.types.INfcTagEventType;

public class NfcTagEvent implements INfcTagEvent
{
    protected String namespace;
    protected INfcUser user;
    protected INfcDevice device;
    protected INfcApplication application;
    protected INfcTag tag;
    protected IGeoLocation geoLocation;
    protected INfcTagEventType tagEventType;
    protected String eventData;
    protected long deviceTimestamp;
    protected long serverTimestamp;
    protected long uniqueId;

    @Override
    public INfcUser getNfcUser()
    {
        return user;
    }

    @Override
    public INfcDevice getNfcDevice()
    {
        return device;
    }

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
    public IGeoLocation getGeoLocation()
    {
        return geoLocation;
    }

    @Override
    public INfcTagEventType getEventType()
    {
        return tagEventType;
    }

    @Override
    public String getEventData()
    {
        return eventData;
    }

    @Override
    public long getDeviceTimestamp()
    {
        return deviceTimestamp;
    }

    @Override
    public long getServerTimestamp()
    {
        return serverTimestamp;
    }

    @Override
    public long getUniqueID()
    {
        return uniqueId;
    }

    @Override
    public String getNamespace()
    {
        return namespace;
    }

    @Override
    public boolean hasLocation()
    {
        return (geoLocation != null);
    }
}
