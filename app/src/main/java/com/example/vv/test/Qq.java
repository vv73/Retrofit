package com.example.vv.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Qq {

    @SerializedName("question")
    @Expose
    private String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Qq withQuestion(String question) {
        this.question = question;
        return this;
    }

}
