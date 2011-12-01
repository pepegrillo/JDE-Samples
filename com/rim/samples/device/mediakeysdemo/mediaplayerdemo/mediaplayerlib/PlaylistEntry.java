/*
 * PlayListEntry.java
 *
 * Copyright � 1998-2011 Research In Motion Limited
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Note: For the sake of simplicity, this sample application may not leverage
 * resource bundles and resource strings.  However, it is STRONGLY recommended
 * that application developers make use of the localization features available
 * within the BlackBerry development platform to ensure a seamless application
 * experience across a variety of languages and geographies.  For more information
 * on localizing your application, please refer to the BlackBerry Java Development
 * Environment Development Guide associated with this release.
 */

package com.rim.samples.device.mediakeysdemo.mediaplayerdemo.mediaplayerlib;

/**
 * This class defines the data type for the playlist entries
 */
public class PlaylistEntry {
    private final String _url;
    private final String _name;

    /**
     * Constructs a new PlayListEntry object
     * 
     * @param url
     *            Location of the file
     * @param name
     *            Name of the file
     */
    public PlaylistEntry(final String url, final String name) {
        if (url == null || name == null) {
            throw new NullPointerException();
        }
        _url = url;
        _name = name;
    }

    /**
     * Retrieves the name of the playlist entry
     * 
     * @return The name of the playlist entry
     */
    public String getName() {
        return _name;
    }

    /**
     * Retrieves the location of the playlist entry
     * 
     * @return The location of the playlist entry
     */
    public String getURL() {
        return _url;
    }
}
