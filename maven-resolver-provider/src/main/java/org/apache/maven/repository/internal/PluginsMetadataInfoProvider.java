package org.apache.maven.repository.internal;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.eclipse.aether.artifact.Artifact;

/**
 * Plugin G level metadata provider.
 */
public interface PluginsMetadataInfoProvider
{
    interface PluginInfo
    {
        String getPluginGroupId();

        String getPluginArtifactId();

        String getPluginPrefix();

        String getPluginName();
    }

    /**
     * Returns {@link PluginInfo} corresponding for passed in {@link Artifact}, or {@code null}.
     *
     * @param artifact the artifact
     * @return the plugin info
     */
    PluginInfo getPluginInfo( Artifact artifact );
}
