
package br.uniclima.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Main {

    @SerializedName("temp")
    @Expose
    private Double temp;
    @SerializedName("feels_like")
    @Expose
    private Double feelsLike;
    @SerializedName("temp_min")
    @Expose
    private Double tempMin;
    @SerializedName("temp_max")
    @Expose
    private Double tempMax;
    @SerializedName("pressure")
    @Expose
    private Integer pressure;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("sea_level")
    @Expose
    private Integer seaLevel;
    @SerializedName("grnd_level")
    @Expose
    private Integer grndLevel;

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(Integer seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Integer getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(Integer grndLevel) {
        this.grndLevel = grndLevel;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.feelsLike == null)? 0 :this.feelsLike.hashCode()));
        result = ((result* 31)+((this.tempMax == null)? 0 :this.tempMax.hashCode()));
        result = ((result* 31)+((this.temp == null)? 0 :this.temp.hashCode()));
        result = ((result* 31)+((this.seaLevel == null)? 0 :this.seaLevel.hashCode()));
        result = ((result* 31)+((this.humidity == null)? 0 :this.humidity.hashCode()));
        result = ((result* 31)+((this.pressure == null)? 0 :this.pressure.hashCode()));
        result = ((result* 31)+((this.grndLevel == null)? 0 :this.grndLevel.hashCode()));
        result = ((result* 31)+((this.tempMin == null)? 0 :this.tempMin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Main) == false) {
            return false;
        }
        Main rhs = ((Main) other);
        return (((((((((this.feelsLike == rhs.feelsLike)||((this.feelsLike!= null)&&this.feelsLike.equals(rhs.feelsLike)))&&((this.tempMax == rhs.tempMax)||((this.tempMax!= null)&&this.tempMax.equals(rhs.tempMax))))&&((this.temp == rhs.temp)||((this.temp!= null)&&this.temp.equals(rhs.temp))))&&((this.seaLevel == rhs.seaLevel)||((this.seaLevel!= null)&&this.seaLevel.equals(rhs.seaLevel))))&&((this.humidity == rhs.humidity)||((this.humidity!= null)&&this.humidity.equals(rhs.humidity))))&&((this.pressure == rhs.pressure)||((this.pressure!= null)&&this.pressure.equals(rhs.pressure))))&&((this.grndLevel == rhs.grndLevel)||((this.grndLevel!= null)&&this.grndLevel.equals(rhs.grndLevel))))&&((this.tempMin == rhs.tempMin)||((this.tempMin!= null)&&this.tempMin.equals(rhs.tempMin))));
    }

}
