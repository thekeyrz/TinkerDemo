package com.thekey.tinkerdemo;

import android.app.Application;
import android.content.Intent;

import com.tencent.tinker.entry.DefaultApplicationLike;

/**
 * File Description
 *
 * @author yang.ruize
 * @date 2018/12/29 15:33
 * @features
 * @introduce If you see this,  it means that you are now in charge of my previous projects. I feel very sorry. May god bless you.
 * @translate 如果你看到这个，那么说明你现在已经在负责我以前的项目了。我感到非常抱歉。愿上帝保佑你。
 */

public class SampleApplication extends DefaultApplicationLike{


    public SampleApplication(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
    }
}
