package com.ut.swe.spring2019.algorithms.shortestpath.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Route {

    private long distance;
    private List<String> airports;
    public double F;
    public double H;
    
    public Route(){
        airports = new ArrayList<String>();
        this.distance = 0;
    }

    public Route(long distance, String s, String d,double F){
        this.distance = distance;
        this.F=F;
        airports = new ArrayList<String>();
        airports.add(s);
        airports.add(d);
    }
    public void addAirport(String code){
        airports.add(code);
    }
    public double  getH() {
        return F+ distance;// Double.parseDouble(distance+"");
    }
    public long getDistance() {
        return this.distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public List<String> getAirports(){
        return this.airports;
    }
    public void setAirports(List<String> lstAirports){
        this.airports=lstAirports;
    }
    public String getYetToVisitAirport(){
        return this.airports.get(airports.size()-1); // return the last item in the list which is not yet visited
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Route{ ");
       sb.append("distance = " + distance);
        sb.append(", FValue = " + F);
        sb.append(", airports = [");
        for(String s : airports){
            sb.append(s);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return (this.airports.equals(route.airports) && this.distance ==route.distance &&  this.F==route.F);
    }

    @Override
    public int hashCode() {
        //return airports.hashCode();
        return Objects.hash(this.distance,airports.hashCode());
    }
}
