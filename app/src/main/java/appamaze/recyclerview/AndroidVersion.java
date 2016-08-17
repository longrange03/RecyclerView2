package appamaze.recyclerview;

/**
 * Created by yuriana on 10/08/2016.
 */
public class AndroidVersion {

    //This file can be named what we want, but make sure it's  changed throughout the app
    //This is where we would put something like, user name...user image...user description...
    //   and have the getters and setters retrieving that information.

    private String android_version_name;
    private String android_image_url;

    public String getAndroid_version_name() {
        return android_version_name;
    }

    public void setAndroid_version_name(String android_version_name) {
        this.android_version_name = android_version_name;
    }

    public String getAndroid_image_url() {
        return android_image_url;
    }

    public void setAndroid_image_url(String android_image_url) {
        this.android_image_url = android_image_url;
    }
}

