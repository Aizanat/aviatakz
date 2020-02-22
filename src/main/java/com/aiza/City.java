package com.aiza;

public enum City {
    ALMATY("//div[2]//div[1]//div[1]//span[2]//a[1]"),
    NUR_SULTAN("//div[@class='searchdetails__triptypeblock -mod-oneway -mod-active-triptype']//a[@class='ux-pop-dest'][contains(text(),'-')]"),
    SHYMKENT("//div[2]//div[1]//div[1]//span[2]//a[3]"),
    AKTAU("//div[2]//div[1]//div[2]//span[2]//a[3]");

    private String location;

    City(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
