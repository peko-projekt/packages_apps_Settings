
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getPekoProjektVersion(){
        return SystemProperties.get("org.pekoprojekt.version.display","");
    }
}
