package com.colaweathert.android.db;

import org.litepal.crud.DataSupport;


/**
 * Created by Administrator on 2018/3/9.
 */

public class county extends DataSupport {

    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(){
        this.id=id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(){
        this.countyName=countyName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(){
        this.weatherId=weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(){
        this.cityId=cityId;
    }
}
