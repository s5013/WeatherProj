package weather;

import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;
import weather.form.Weather;

import java.io.IOException;

/**
 * Created by Marklin on 8/13/2015.
 */
public class WeatherUtil {
    private static final WeatherUtil INSTANCE = new WeatherUtil();
    OpenWeatherMap owm = new OpenWeatherMap("");

    private WeatherUtil() {

    }

    public static WeatherUtil getInstance() {
        return INSTANCE;
    }

    public Weather getWeatherWithCity(String city) {
        CurrentWeather cwd = null;
        Weather result = new Weather();
        try {
            cwd = owm.currentWeatherByCityName(city);
            result.setDate((cwd.getDateTime()));
            result.setCity(cwd.getCityName());
            result.setTemp(cwd.getMainInstance().getTemperature());
            result.setWind(owm.dailyForecastByCityName(city, (byte) 0).getForecastInstance(0).getWindSpeed());
            result.setDesc(owm.dailyForecastByCityName(city, (byte) 0).getForecastInstance(0).getWeatherInstance(0).getWeatherDescription());
        } catch (IOException e) {
            //TODO:Log and find out when/how.
        }
        return result;
    }
}