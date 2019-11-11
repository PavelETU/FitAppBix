package lonelytripblog.wordpress.com.fitappbix.test


import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import lonelytripblog.wordpress.com.fitappbix.MainActivity
import org.junit.Rule

class BodyFatMeasurementsSteps {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Given("I am on body fat percentage measurement screen")
    fun i_am_on_body_fat_percentage_measurement_screen() {
        activityRule.launchActivity(null)
    }

    @When("I click Age field")
    fun iClickAgeField() {
        onView(withHint("Age")).perform(click())
    }

    @And("I type age {string}")
    fun iTypeAge(age: String) {
        onView(withHint("Age")).perform(typeText(age))
    }

    @When("I click Weight field")
    fun iClickWeightField() {
        onView(withHint("Weight")).perform(click())
    }

    @And("I type weight {string}")
    fun iTypeWeight(weight: String) {
        onView(withHint("Weight")).perform(typeText(weight))
    }

    @When("I click Height field")
    fun iClickHeightField() {
        onView(withHint("Height")).perform(click())
    }

    @And("I type height {string}")
    fun iTypeHeight(height: String) {
        onView(withHint("Height")).perform(typeText(height))
    }

    @When("I click Neck field")
    fun iClickNeckField() {
        onView(withHint("Neck")).perform(click())
    }

    @And("I type neck {string}")
    fun iTypeNeck(neck: String) {
        onView(withHint("Neck")).perform(typeText(neck))
    }

    @When("I click Waist field")
    fun iClickWaistField() {
        onView(withHint("Waist")).perform(click())
    }

    @And("I type waist {string}")
    fun iTypeWaist(waist: String) {
        onView(withHint("Height")).perform(typeText(waist))
    }

    @When("I click Hip field")
    fun iClickHipField() {
        onView(withHint("Hip")).perform(click())
    }

    @And("I type hip {string}")
    fun iTypeHip(hip: String) {
        onView(withHint("Hip")).perform(typeText(hip))
    }

    @And("I close keyboard")
    fun iCloseKeyboard() {
        Espresso.closeSoftKeyboard()
    }

    @And("I hit calculate")
    fun iHitCalulate() {
        onView(withText("Calculate")).perform(click())
    }

    @Then("I expect to see {string}% on the screen")
    fun iExpectToSeeOnTheScreen(bodyFatPercentage: String) {
        onView(withText(bodyFatPercentage)).check(matches(isCompletelyDisplayed()))
    }
}