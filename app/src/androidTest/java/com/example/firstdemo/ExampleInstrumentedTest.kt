package com.example.firstdemo

import android.text.Html
import android.text.Html.FROM_HTML_MODE_LEGACY
import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.firstdemo", appContext.packageName)

        val htl =
            "活动对象使用ALiPay:&lt;br&gt;大甩买,清仓处理,错过这,你将后悔一生.&lt;br&gt;1、都市果园，美味新鲜.&lt;br&gt; 2、爽口的记忆，从这里开始&lt;br&gt;3、品味鲜果滋味，让畅享淋漓尽致.&lt;br&gt;4、美味想不到，果品买得到&lt;br&gt;5、美味果品，品悦人生。"
        Log.d("aaa", Html.fromHtml(htl, FROM_HTML_MODE_LEGACY).toString())

        println(Html.fromHtml(htl, FROM_HTML_MODE_LEGACY))
    }
}
