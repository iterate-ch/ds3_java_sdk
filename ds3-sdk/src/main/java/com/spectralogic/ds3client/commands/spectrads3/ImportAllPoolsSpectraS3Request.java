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
import java.util.UUID;
import com.spectralogic.ds3client.models.Priority;

public class ImportAllPoolsSpectraS3Request extends AbstractRequest {

    // Variables
    
    private String dataPolicyId;

    private Priority priority;

    private String storageDomainId;

    private String userId;

    private Priority verifyDataAfterImport;

    private boolean verifyDataPriorToImport;

    // Constructor
    
    
    public ImportAllPoolsSpectraS3Request() {
        
        this.getQueryParams().put("operation", "import");

    }

    public ImportAllPoolsSpectraS3Request withDataPolicyId(final UUID dataPolicyId) {
        this.dataPolicyId = dataPolicyId.toString();
        this.updateQueryParam("data_policy_id", dataPolicyId);
        return this;
    }


    public ImportAllPoolsSpectraS3Request withDataPolicyId(final String dataPolicyId) {
        this.dataPolicyId = dataPolicyId;
        this.updateQueryParam("data_policy_id", dataPolicyId);
        return this;
    }


    public ImportAllPoolsSpectraS3Request withPriority(final Priority priority) {
        this.priority = priority;
        this.updateQueryParam("priority", priority);
        return this;
    }


    public ImportAllPoolsSpectraS3Request withStorageDomainId(final UUID storageDomainId) {
        this.storageDomainId = storageDomainId.toString();
        this.updateQueryParam("storage_domain_id", storageDomainId);
        return this;
    }


    public ImportAllPoolsSpectraS3Request withStorageDomainId(final String storageDomainId) {
        this.storageDomainId = storageDomainId;
        this.updateQueryParam("storage_domain_id", storageDomainId);
        return this;
    }


    public ImportAllPoolsSpectraS3Request withUserId(final UUID userId) {
        this.userId = userId.toString();
        this.updateQueryParam("user_id", userId);
        return this;
    }


    public ImportAllPoolsSpectraS3Request withUserId(final String userId) {
        this.userId = userId;
        this.updateQueryParam("user_id", userId);
        return this;
    }


    public ImportAllPoolsSpectraS3Request withVerifyDataAfterImport(final Priority verifyDataAfterImport) {
        this.verifyDataAfterImport = verifyDataAfterImport;
        this.updateQueryParam("verify_data_after_import", verifyDataAfterImport);
        return this;
    }


    public ImportAllPoolsSpectraS3Request withVerifyDataPriorToImport(final boolean verifyDataPriorToImport) {
        this.verifyDataPriorToImport = verifyDataPriorToImport;
        this.updateQueryParam("verify_data_prior_to_import", verifyDataPriorToImport);
        return this;
    }



    @Override
    public HttpVerb getVerb() {
        return HttpVerb.PUT;
    }

    @Override
    public String getPath() {
        return "/_rest_/pool";
    }
    
    public String getDataPolicyId() {
        return this.dataPolicyId;
    }


    public Priority getPriority() {
        return this.priority;
    }


    public String getStorageDomainId() {
        return this.storageDomainId;
    }


    public String getUserId() {
        return this.userId;
    }


    public Priority getVerifyDataAfterImport() {
        return this.verifyDataAfterImport;
    }


    public boolean getVerifyDataPriorToImport() {
        return this.verifyDataPriorToImport;
    }

}