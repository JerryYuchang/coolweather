package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by panyuchang on 2017/3/2.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
