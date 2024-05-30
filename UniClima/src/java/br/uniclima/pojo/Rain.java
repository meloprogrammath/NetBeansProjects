
package br.uniclima.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Rain {

    @SerializedName("1h")
    @Expose
    private Double _1h;

    public Double get1h() {
        return _1h;
    }

    public void set1h(Double _1h) {
        this._1h = _1h;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this._1h == null)? 0 :this._1h.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rain) == false) {
            return false;
        }
        Rain rhs = ((Rain) other);
        return ((this._1h == rhs._1h)||((this._1h!= null)&&this._1h.equals(rhs._1h)));
    }

}
