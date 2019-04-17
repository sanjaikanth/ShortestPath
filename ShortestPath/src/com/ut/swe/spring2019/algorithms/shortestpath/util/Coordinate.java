package com.ut.swe.spring2019.algorithms.shortestpath.util;

public class Coordinate {
    private double longitude;
    private double latitude;

    public Coordinate(){
        this.longitude = 0;
        this.latitude = 0;
    }
    public Coordinate(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
}
