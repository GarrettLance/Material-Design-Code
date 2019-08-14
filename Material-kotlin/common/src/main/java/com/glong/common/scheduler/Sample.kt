package com.glong.common.scheduler

import com.glong.common.scheduler.RxScheduler
import com.glong.common.scheduler.task.IOTask
import com.glong.common.scheduler.task.UITask

/**
 * @author guolong
 * @since 2019/7/7
 */
object Sample {

    @JvmStatic
    fun main(args: Array<String>) {
        RxScheduler.doOnIoThread(object : IOTask<Unit>() {
            override fun doOnIoThread() {
                // 耗时任务
            }

            override fun onComplete(t: Unit) {
                //返回值
            }

            override fun onFail(e: Throwable) {
                //错误之后的回调
            }
        })

        RxScheduler.doOnUIThread(object : UITask<String>() {
            override fun doOnUIThread(): String {
                // 在UI线程执行
                return ""
            }
        })
    }
}
