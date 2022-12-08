/*
 * ******************************************************************************
 *   Copyright 2002 Spectra Logic Corporation. All Rights Reserved.
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

plugins {
    id("ds3-java-sdk-internal-convention")
    id("ds3-java-sdk-version")
    `java-library`
    `maven-publish`
    id("org.owasp.dependencycheck")
}

group = "com.spectralogic.ds3"
version = "5.4.1"

publishing {
    publications {
        create<MavenPublication>("ProjectPublication") {
            from(components["java"])
        }
    }
}

dependencyCheck {
    // fail the build if any vulnerable dependencies are identified (CVSS score > 0)
    failBuildOnCVSS = 0f;
    suppressionFile = "project_files/owasp/dependency-check-suppression.xml"
}
