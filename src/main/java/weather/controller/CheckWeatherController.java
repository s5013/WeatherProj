package weather.controller;
/**
 * Created by Marklin on 8/12/2015.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import weather.WeatherUtil;
import weather.form.Weather;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

@Controller
//@PropertySource("classpath*:weather.properties")
//@PropertySource("classpath:weather.properties")
public class CheckWeatherController {
    //    @Autowired
//    @Value("#{'${weather.cities}'.split(',')}")
    private List<String> cityList;

    @Resource(name = "weatherCities")
    private Properties weatherCities;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @RequestMapping("/check")
    public ModelAndView getWeather(@RequestParam(required = false) String city) {

        ModelAndView model = new ModelAndView("check");

        cityList = new ArrayList<String>(Arrays.asList(weatherCities.getProperty("weather.cities").split(",")));
        model.addObject("cityList", cityList);
        model.addObject("weather", new Weather());
        return model;
    }

    @RequestMapping("/result")
    public ModelAndView weatherResult(@RequestParam String city) {

        ModelAndView model = new ModelAndView("result");
        Weather result = WeatherUtil.getInstance().getWeatherWithCity(city);
        model.addObject("result", result);
        return model;
    }
}