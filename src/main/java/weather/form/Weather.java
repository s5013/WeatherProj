package weather.form;

import java.util.Date;

/**
 * Created by Marklin on 8/13/2015.
 */
public class Weather {
    private String city;
    private Date date;
    private String desc;
    private float temp;
    //    private float maxTemp;
//    private float minTemp;
    private float wind;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getTempInF() {
        return getTemp();
    }

    public float getTempInC() {
        return (getTemp() - 32f) / 1.8f;
    }

    public float getWind() {
        return wind;
    }

    public void setWind(float wind) {
        this.wind = wind;
    }
}
