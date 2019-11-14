package lonelytripblog.wordpress.com.fitappbix

import lonelytripblog.wordpress.com.fitappbix.entities.BodyFatPercentageMeasurementMetricSystem
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BodyFatPercentageMeasurementMetricSystemTest {
    private lateinit var bodyFatPercentageMeasurementMetricSystem: BodyFatPercentageMeasurementMetricSystem

    @Before
    fun setUp() {
        bodyFatPercentageMeasurementMetricSystem = BodyFatPercentageMeasurementMetricSystem()
    }

    @Test
    fun `Verify measurement for man is correct`() {
        val result = bodyFatPercentageMeasurementMetricSystem.measureBodyFatPercentageByUSNavyMethodForMale(97.0, 39.0, 182.0, "13 November 2019")

        Assert.assertEquals("13 November 2019", result.dateOfMeasurement)
        Assert.assertEquals("23.5", result.bodyFatPercentage)
    }

    @Test
    fun `Verify measurement for woman is correct`() {
        val result = bodyFatPercentageMeasurementMetricSystem.measureBodyFatPercentageByUSNavyMethodForFemale(97.0, 39.0, 182.0, 103.0, "13 November 2019")

        Assert.assertEquals("13 November 2019", result.dateOfMeasurement)
        Assert.assertEquals("34.0", result.bodyFatPercentage)
    }
}