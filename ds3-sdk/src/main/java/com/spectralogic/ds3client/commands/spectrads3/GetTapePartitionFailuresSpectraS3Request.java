/*
 * ******************************************************************************
 *   Copyright 2014-2015 Spectra Logic Corporation. All Rights Reserved.
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
import com.spectralogic.ds3client.commands.AbstractRequest;
import com.google.common.net.UrlEscapers;
import java.util.UUID;
import com.spectralogic.ds3client.models.TapePartitionFailureType;

public class GetTapePartitionFailuresSpectraS3Request extends AbstractRequest {

    // Variables
    
    private String errorMessage;

    private boolean lastPage;

    private int pageLength;

    private int pageOffset;

    private String pageStartMarker;

    private String partitionId;

    private TapePartitionFailureType type;

    // Constructor
    
    public GetTapePartitionFailuresSpectraS3Request() {
            }

    public GetTapePartitionFailuresSpectraS3Request withErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
        this.updateQueryParam("error_message", errorMessage);
        return this;
    }

    public GetTapePartitionFailuresSpectraS3Request withLastPage(final boolean lastPage) {
        this.lastPage = lastPage;
        if (this.lastPage) {
            this.getQueryParams().put("last_page", null);
        } else {
            this.getQueryParams().remove("last_page");
        }
        return this;
    }

    public GetTapePartitionFailuresSpectraS3Request withPageLength(final int pageLength) {
        this.pageLength = pageLength;
        this.updateQueryParam("page_length", pageLength);
        return this;
    }

    public GetTapePartitionFailuresSpectraS3Request withPageOffset(final int pageOffset) {
        this.pageOffset = pageOffset;
        this.updateQueryParam("page_offset", pageOffset);
        return this;
    }

    public GetTapePartitionFailuresSpectraS3Request withPageStartMarker(final UUID pageStartMarker) {
        this.pageStartMarker = pageStartMarker.toString();
        this.updateQueryParam("page_start_marker", pageStartMarker);
        return this;
    }

    public GetTapePartitionFailuresSpectraS3Request withPageStartMarker(final String pageStartMarker) {
        this.pageStartMarker = pageStartMarker;
        this.updateQueryParam("page_start_marker", pageStartMarker);
        return this;
    }

    public GetTapePartitionFailuresSpectraS3Request withPartitionId(final UUID partitionId) {
        this.partitionId = partitionId.toString();
        this.updateQueryParam("partition_id", partitionId);
        return this;
    }

    public GetTapePartitionFailuresSpectraS3Request withPartitionId(final String partitionId) {
        this.partitionId = partitionId;
        this.updateQueryParam("partition_id", partitionId);
        return this;
    }

    public GetTapePartitionFailuresSpectraS3Request withType(final TapePartitionFailureType type) {
        this.type = type;
        this.updateQueryParam("type", type);
        return this;
    }


    @Override
    public HttpVerb getVerb() {
        return HttpVerb.GET;
    }

    @Override
    public String getPath() {
        return "/_rest_/tape_partition_failure";
    }
    
    public String getErrorMessage() {
        return this.errorMessage;
    }


    public boolean getLastPage() {
        return this.lastPage;
    }


    public int getPageLength() {
        return this.pageLength;
    }


    public int getPageOffset() {
        return this.pageOffset;
    }


    public String getPageStartMarker() {
        return this.pageStartMarker;
    }


    public String getPartitionId() {
        return this.partitionId;
    }


    public TapePartitionFailureType getType() {
        return this.type;
    }

}