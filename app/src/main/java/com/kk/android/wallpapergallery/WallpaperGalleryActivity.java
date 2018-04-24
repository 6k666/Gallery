package com.kk.android.wallpapergallery;

import android.support.v4.app.Fragment;

public class WallpaperGalleryActivity extends SingleFragmentActivityOne {

    @Override
    protected Fragment createFragment(){
        return WallpaperGalleryFragment.newInstance();
    }
}
