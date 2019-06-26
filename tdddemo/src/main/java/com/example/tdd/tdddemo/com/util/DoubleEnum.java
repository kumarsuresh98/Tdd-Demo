package com.example.tdd.tdddemo.com.util;

public enum DoubleEnum {
    UNKNOWN(""),SECURE("https://"),INSECURE("http://");
    private String value;
    DoubleEnum(String value){
        this.value=value;
    }
    @Override
    public String toString(){
        return value;
    }
}
