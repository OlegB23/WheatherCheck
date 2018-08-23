package testDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;
import org.junit.Assert;

import java.math.BigDecimal;

public class WeatherStepDefs {

    private WeatherRequester weatherRequester = new WeatherRequester();
    private Response response;

    @When("we are getting weather from server")
    public void get_weather() {
        response = weatherRequester.getWeather();
    }

    @Then("lon is (.*)")
    public void check_lon(BigDecimal lon) {
        Assert.assertEquals("Wrong lon", lon, response.getCoodr().getLon());
    }

    @Then("lat is (.*)")
    public void check_lat(BigDecimal lat) {
        Assert.assertEquals("Wrong lat", lat, response.getCoodr().getLat());
    }


}
