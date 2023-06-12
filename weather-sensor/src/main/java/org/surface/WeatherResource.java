package org.surface;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;


@Path("/weather")
public class WeatherResource {
    

    @GET
    public WeatherData provideWeather(){
        return new WeatherData();
    }
}
