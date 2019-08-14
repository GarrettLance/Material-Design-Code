package com.glong.common.base

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.glong.common.utils.ScreenAdaptiveUtil

/**
 * @author guolong
 * @since 2019/7/7
 */
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        app = this
        initScreenAdaptive()
    }

    /**
     * 屏幕适配
     */
    protected fun initScreenAdaptive() {
        ScreenAdaptiveUtil.adaptive(this)
    }

    override fun attachBaseContext(context: Context) {
        super.attachBaseContext(context)
        MultiDex.install(this)
    }

    companion object {

        /**
         * Application的context
         */
        lateinit var app: Application
    }
}
