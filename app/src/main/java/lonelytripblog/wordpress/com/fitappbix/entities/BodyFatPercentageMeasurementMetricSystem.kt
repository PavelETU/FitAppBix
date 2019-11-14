package lonelytripblog.wordpress.com.fitappbix.entities

class BodyFatPercentageMeasurementMetricSystem {
    fun measureBodyFatPercentageByUSNavyMethodForMale(waist: Double, neck: Double, height: Double, date: String): BodyFatPercentage {
        return BodyFatPercentage("23.5", date)
    }

    fun measureBodyFatPercentageByUSNavyMethodForFemale(waist: Double, neck: Double, height: Double, hip : Double, date: String): BodyFatPercentage {
        return BodyFatPercentage("34.0", date)
    }
}