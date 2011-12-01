/*
 * InvokeLocationDocumentScreen.java
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

package com.rim.samples.device.blackberrymapsdemo;

import net.rim.blackberry.api.invoke.Invoke;
import net.rim.blackberry.api.invoke.MapsArguments;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.MenuItem;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.ui.container.MainScreen;

/**
 * A location document allows the application to specify a specific point or
 * multiple points. A location document is simply a string which contains a set
 * of XML tags with attributes that specify a location or route. See the GPS and
 * BlackBerry Maps Development Guide for a full explanation of the Location
 * Document.
 */
public final class InvokeLocationDocumentScreen extends MainScreen {
    // Constructor
    InvokeLocationDocumentScreen() {
        setTitle("Invoke Location Document");

        final RichTextField instructions =
                new RichTextField(
                        "From the menu:\n\nSelect 'View Single Location' to invoke BlackBerry Maps using a single location tag.\n\nSelect 'View Multiple Locations' to invoke BlackBerry Maps using multiple location tags.",
                        Field.READONLY | Field.FOCUSABLE);
        add(instructions);

        addMenuItem(viewSingleItem);
        addMenuItem(viewMultipleItem);
    }

    /**
     * Displays a single location on a map
     */
    private final MenuItem viewSingleItem = new MenuItem(
            "View Single Location", 1000, 10) {
        public void run() {
            final String document =
                    "<lbs clear='ALL'><location lon='-7938675' lat='4367022' label='Toronto, ON' description='Go Leafs Go!' zoom='10'/></lbs>";
            Invoke.invokeApplication(Invoke.APP_TYPE_MAPS, new MapsArguments(
                    MapsArguments.ARG_LOCATION_DOCUMENT, document));
        }
    };

    /**
     * Displays multiple locations on a map
     */
    private final MenuItem viewMultipleItem = new MenuItem(
            "View Multiple Locations", 2000, 10) {
        public void run() {
            final StringBuffer stringBuffer =
                    new StringBuffer("<lbs clear='ALL'>");
            stringBuffer
                    .append("<location lon='-8030000' lat='4326000' label='Kitchener, ON' description='Kitchener, Ontario, Canada' />");
            stringBuffer
                    .append("<location lon='-7569792' lat='4542349' label='Ottawa, ON' description='Ottawa, Ontario, Canada' />");
            stringBuffer.append("</lbs>");

            Invoke.invokeApplication(Invoke.APP_TYPE_MAPS, new MapsArguments(
                    MapsArguments.ARG_LOCATION_DOCUMENT, stringBuffer
                            .toString()));
        }
    };
}
