package com.example.vv.test;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("qq")
    @Expose
    private List<Qq> qq = null;

    public List<Qq> getQq() {
        return qq;
    }

    public void setQq(List<Qq> qq) {
        this.qq = qq;
    }

    public Example withQq(List<Qq> qq) {
        this.qq = qq;
        return this;
    }

}



