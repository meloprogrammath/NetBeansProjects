
package br.uniclima.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Wind {

    @SerializedName("speed")
    @Expose
    private Double speed;
    @SerializedName("deg")
    @Expose
    private Integer deg;
    @SerializedName("gust")
    @Expose
    private Double gust;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    public Double getGust() {
        return gust;
    }

    public void setGust(Double gust) {
        this.gust = gust;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.speed == null)? 0 :this.speed.hashCode()));
        result = ((result* 31)+((this.deg == null)? 0 :this.deg.hashCode()));
        result = ((result* 31)+((this.gust == null)? 0 :this.gust.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Wind) == false) {
            return false;
        }
        Wind rhs = ((Wind) other);
        return ((((this.speed == rhs.speed)||((this.speed!= null)&&this.speed.equals(rhs.speed)))&&((this.deg == rhs.deg)||((this.deg!= null)&&this.deg.equals(rhs.deg))))&&((this.gust == rhs.gust)||((this.gust!= null)&&this.gust.equals(rhs.gust))));
    }

}
