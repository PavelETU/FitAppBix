package lonelytripblog.wordpress.com.fitappbix.test

import cucumber.api.CucumberOptions
import cucumber.api.android.CucumberAndroidJUnitRunner
import android.os.Bundle
import java.io.File


@CucumberOptions(features = ["features"])
class AppTestRunner: CucumberAndroidJUnitRunner() {
    override fun onCreate(bundle: Bundle) {
        bundle.putString(
            "plugin",
            getPluginConfigurationString()
        ) // we programmatically create the plugin configuration
        super.onCreate(bundle)
    }

    /**
     * Since we want to checkout the external storage directory programmatically, we create the plugin configuration
     * here, instead of the [CucumberOptions] annotation.
     *
     * @return the plugin string for the configuration, which contains XML, HTML and JSON paths
     */
    private fun getPluginConfigurationString(): String {
        val cucumber = "cucumber"
        val separator = "--"
        return "junit:" + getAbsoluteFilesPath() + "/" + cucumber + ".xml" + separator +
                "html:" + getAbsoluteFilesPath() + "/" + cucumber + ".html" + separator +
                "json:" + getAbsoluteFilesPath() + "/" + cucumber + ".json"
    }

    /**
     * The path which is used for the report files.
     *
     * @return the absolute path for the report files
     */
    private fun getAbsoluteFilesPath(): String {

        //sdcard/Android/data/cucumber
        val directory = targetContext.getExternalFilesDir(null)
        return File(directory, "reports").absolutePath
    }
}