/**
 * Created by Marklin on 8/12/2015.
 */

import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.json.JSONException;

import java.io.IOException;
//import java.net.MalformedURLException;

public class HelloWeather {

    public static void main(String[] args)
            throws IOException, JSONException { //MalformedURLException

        // declaring object of "OpenWeatherMap" class
        OpenWeatherMap owm = new OpenWeatherMap("");

        // getting current weather data for the "London" city
//        CurrentWeather cwd = owm.currentWeatherByCityName ("Sydney");
//        CurrentWeather cwd = owm.currentWeatherByCityName ("Melbourne");
        CurrentWeather cwd = owm.currentWeatherByCityName("Wollongong");

        //printing city name from the retrieved data
        System.out.println("City: " + cwd.getCityName());

        // printing the max./min. temperature
        System.out.println("Temperature Max/Min: " + cwd.getMainInstance().getMaxTemperature()
                + "/" + cwd.getMainInstance().getMinTemperature() + "\'F");
        System.out.println("Temperature: " + cwd.getMainInstance().getTemperature() + "\'F");

        System.out.println("Description:" + owm.dailyForecastByCityName("Sydney", (byte) 0).getForecastInstance(0).getWeatherInstance(0).getWeatherDescription());
        System.out.println("WindSpeed:" + owm.dailyForecastByCityName("Sydney", (byte) 0).getForecastInstance(0).getWindSpeed());
    }
}
