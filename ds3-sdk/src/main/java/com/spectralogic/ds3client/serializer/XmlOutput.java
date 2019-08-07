/*
 * ******************************************************************************
 *   Copyright 2014-2017 Spectra Logic Corporation. All Rights Reserved.
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

package com.spectralogic.ds3client.serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.spectralogic.ds3client.models.bulk.Ds3ObjectList;

import java.io.IOException;
import java.io.InputStream;


public final class XmlOutput {
    private static final XmlMapper mapper;

    static {
        final JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        mapper = new XmlMapper(module);
        final SimpleFilterProvider filterProvider = new SimpleFilterProvider().setFailOnUnknownId(false);
        mapper.setFilterProvider(filterProvider);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String toXml(final Object object) {
        return toXml(object, null);
    }

    private static String toXml(final Object object, final Class view) {
        try {
            if (view == null) {
                return mapper.writeValueAsString(object);
            }
            else {
                return mapper.writerWithView(view).writeValueAsString(object);
            }
        }
        catch(final JsonProcessingException e) {
            throw new XmlProcessingException(e);
        }
    }

    public static String toXml(final Ds3ObjectList objects, final boolean isBulkPut) {
        if (isBulkPut) {
            return XmlOutput.toXml(objects, Views.PutObject.class);
        }
        return XmlOutput.toXml(objects, Views.GetObject.class);
    }

    public static<T> T fromXml(final String xmlString, final Class<T> type) throws IOException {
        return mapper.readValue(xmlString, type);
    }

    public static<T> T fromXml(final InputStream stream, final Class<T> type) throws IOException {
        return mapper.readValue(stream, type);
    }
}
