package com.ut.swe.spring2019.algorithms.shortestpath.data;

import java.util.Objects;

import com.ut.swe.spring2019.algorithms.shortestpath.util.Coordinate;
import com.ut.swe.spring2019.algorithms.shortestpath.util.Haversine;

public class Flight {
    private String origin;
    private String destination;
    private int nstops;
    private double distance=Double.POSITIVE_INFINITY;

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getNstops() {
        return nstops;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance=distance;
    }
    public Flight() {
        this.origin = null;
        this.destination = null;
        this.nstops = 0;
    }

    public Flight(String origin, String destination, int nstops) { //,double distance
        this.origin = origin;
        this.destination = destination;
        this.nstops = nstops;
      //  this.distance=distance;
    }
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        //return nstops == flight.nstops &&
          //      Objects.equals(origin, flight.origin) &&
            //    Objects.equals(destination, flight.destination);
        return (nstops == flight.nstops && origin.equals(flight.origin) && destination.equals(flight.destination) && distance==flight.distance );
    }

    @Override
    public String toString() {
        return "Flight{" +
                "origin=" + origin +
                ", destination=" + destination +
                ", nstops=" + nstops +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, destination, nstops);
    }
}
