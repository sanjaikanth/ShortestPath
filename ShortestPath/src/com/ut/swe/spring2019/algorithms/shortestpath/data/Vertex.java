package com.ut.swe.spring2019.algorithms.shortestpath.data;

import java.util.Objects;

public class Vertex{

    private String code;
    private String name;
    private String country;
    private double latitude;
    private double longitude;
    public double G;
    public double F;
    public Vertex Parent; 

    public Vertex() {
        this.code = null;
        this.name = null;
        this.country = null;
        this.latitude = 0;
        this.longitude = 0;
    }

    public Vertex(String code, String name, String country, double latitude, double longitude) {
        this.code = code;
        this.name = name;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        //System.out.println("equals called");

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex node = (Vertex) o;
        boolean bRetVal = false;
        if (Double.compare(node.latitude, latitude) == 0 &&
                Double.compare(node.longitude, longitude) == 0 &&
                code.equals(node.code) &&
                name.equals(node.name) &&
                country.equals(node.country)) {
            bRetVal = true;
            //System.out.println(code + " retur val = " + bRetVal);
        }else{
            //System.out.println(code + " retur val = " + bRetVal);
        }

        return bRetVal;
    }

    @Override
    public int hashCode() {
       // System.out.println("hashcode called");

        return Objects.hash(this.code, this.name, this.country, this.latitude, this.longitude);
        //return Objects.hash(this.code, this.name, this.country);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "code=" + code +
                ", name=" + name +
                ", country=" + country +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

