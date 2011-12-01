/*
 * HorizontalVerticalCenteredScreen.java
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

package com.rim.samples.device.ui.wireframelayoutdemo;

import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.HorizontalFieldManager;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.container.VerticalFieldManager;

/**
 * A screen to demonstrate centering fields using a VerticalFieldManager and a
 * HorizontalField manager
 */
public class HorizontalVerticalCenteredScreen extends MainScreen {
    /**
     * Creates a new HorizontalVerticalCenteredScreen object
     */
    public HorizontalVerticalCenteredScreen() {
        super(NO_VERTICAL_SCROLL);

        setTitle("Horizontal Vertical Centered Screen");

        // Center a field on the screen using managers
        final HorizontalFieldManager hfm =
                new HorizontalFieldManager(USE_ALL_HEIGHT);
        final VerticalFieldManager vfm =
                new VerticalFieldManager(USE_ALL_WIDTH | FIELD_VCENTER);
        vfm.add(new LabelField("Centered text", FIELD_HCENTER));
        hfm.add(vfm);
        add(hfm);
    }
}
