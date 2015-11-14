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

package com.spectralogic.ds3client;

import com.spectralogic.ds3client.networking.Headers;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class HeadersImpl_Test {

    @Test
    public void findHeader() {
        final Headers headers = genHeaders(new BasicHeader("content-md5", "Q2hlY2sgSW50ZWdyaXR5IQ=="));
        final String value = headers.get("content-md5").get(0);
        assertThat(value, is("Q2hlY2sgSW50ZWdyaXR5IQ=="));
    }

    @Test
    public void unknownHeader() {
        final Headers headers = genHeaders();
        final List<String> value = headers.get("content-md5");
        assertTrue(value.isEmpty());
    }

    public Headers genHeaders(final Header... headers) {
        return new HeadersImpl(headers);
    }
}
