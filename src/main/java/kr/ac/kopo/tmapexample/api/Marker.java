package kr.ac.kopo.tmapexample.api;


import lombok.Getter;
import lombok.Setter;


public class Marker {
    private double lat;
    private double lng;

    public Marker() {
    }

    public Marker(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}