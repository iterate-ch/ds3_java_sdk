/*
 * ******************************************************************************
 *   Copyright 2014-2019 Spectra Logic Corporation. All Rights Reserved.
 *   Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 *   this file except in compliance with the License. A copy of the License is located at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file.
 *   This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *   CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *   specific language governing permissions and limitations under the License.
 * ****************************************************************************
 */

// This code is auto-generated, do not modify
package com.spectralogic.ds3client.commands.spectrads3;

import com.spectralogic.ds3client.networking.HttpVerb;
import com.spectralogic.ds3client.commands.interfaces.AbstractRequest;
import java.lang.Integer;
import com.spectralogic.ds3client.models.StorageDomainMemberState;
import com.spectralogic.ds3client.models.WritePreferenceLevel;

public class ModifyStorageDomainMemberSpectraS3Request extends AbstractRequest {

    // Variables
    
    private final String storageDomainMember;

    private Integer autoCompactionThreshold;

    private StorageDomainMemberState state;

    private WritePreferenceLevel writePreference;

    // Constructor
    
    
    public ModifyStorageDomainMemberSpectraS3Request(final String storageDomainMember) {
        this.storageDomainMember = storageDomainMember;
        
    }

    public ModifyStorageDomainMemberSpectraS3Request withAutoCompactionThreshold(final Integer autoCompactionThreshold) {
        this.autoCompactionThreshold = autoCompactionThreshold;
        this.updateQueryParam("auto_compaction_threshold", autoCompactionThreshold);
        return this;
    }


    public ModifyStorageDomainMemberSpectraS3Request withState(final StorageDomainMemberState state) {
        this.state = state;
        this.updateQueryParam("state", state);
        return this;
    }


    public ModifyStorageDomainMemberSpectraS3Request withWritePreference(final WritePreferenceLevel writePreference) {
        this.writePreference = writePreference;
        this.updateQueryParam("write_preference", writePreference);
        return this;
    }



    @Override
    public HttpVerb getVerb() {
        return HttpVerb.PUT;
    }

    @Override
    public String getPath() {
        return "/_rest_/storage_domain_member/" + storageDomainMember;
    }
    
    public String getStorageDomainMember() {
        return this.storageDomainMember;
    }


    public Integer getAutoCompactionThreshold() {
        return this.autoCompactionThreshold;
    }


    public StorageDomainMemberState getState() {
        return this.state;
    }


    public WritePreferenceLevel getWritePreference() {
        return this.writePreference;
    }

}