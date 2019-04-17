package com.ut.swe.spring2019.algorithms.shortestpath.util;

public class Haversine {

    //private static final double EARTH_RADIUS =  6378; //kms
    private static final double EARTH_RADIUS =  3963; //miles
    public static double haversine(double lat1, double lon1,
                            double lat2, double lon2)
    {
        // distance between latitudes and longitudes
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        // convert to radians
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // apply formulae
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.pow(Math.sin(dLon / 2), 2) *
                        Math.cos(lat1) *
                        Math.cos(lat2);
        //double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return EARTH_RADIUS * c;
    }
    public static double haversine(Coordinate source, Coordinate destination){

        double lat1 = 0;
        double lat2 = 0;
        // distance between latitudes and longitudes
        double dLat = Math.toRadians(destination.getLatitude() - source.getLatitude());
        double dLon = Math.toRadians(destination.getLongitude() - source.getLongitude());

        // convert to radians
        lat1 = Math.toRadians(source.getLatitude());
        lat2 = Math.toRadians(destination.getLatitude());

        // apply formulae
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.pow(Math.sin(dLon / 2), 2) *
                        Math.cos(lat1) *
                        Math.cos(lat2);
        //double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return EARTH_RADIUS * c;
    }

}
