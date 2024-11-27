/*
 * Copyright (C) 2016-2022 crDroid Android Project
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
 */

package org.blissroms.blissify.utils;

import android.os.SystemProperties;

import java.util.Arrays;

public class DeviceUtils {

    private static final String DEVICE = "ro.bliss.device";

    private static final String[] currentlySupportedPixels = {
            "rango",
            "mustang",
            "blazer",
            "frankel",
            "komodo",
            "caiman",
            "tokay",
            "comet",
            "akita",
            "husky",
            "shiba",
            "felix",
            "tangorpro",
            "lynx",
            "cheetah",
            "panther",
            "bluejay",
            "oriole",
            "raven",
            "barbet"
    };

    public static boolean isCurrentlySupportedPixel() {
        String deviceCodename = SystemProperties.get(DEVICE);
        return Arrays.asList(currentlySupportedPixels).contains(deviceCodename);
    }

}
