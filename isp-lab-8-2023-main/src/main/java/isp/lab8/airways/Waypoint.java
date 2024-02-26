package isp.lab8.airways;

import java.util.Objects;
import java.io.Serializable;

/**
 * Example waypoint class which can be extended to be used in implementation of the exercise. Add constructor, getters, setters, etc.
 */
public class Waypoint implements Serializable,Comparable<Waypoint>{
    private int index;
    private String name;
    private double latitude;
    private double longitude;
    private int altitude;

    //constructor

    public Waypoint(int index, String name, double latitude, double longitude, int altitude) {
        this.index = index;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }
    //getters

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getAltitude() {
        return altitude;
    }
    //setters


    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Waypoint{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Waypoint waypoint = (Waypoint) o;
        return index == waypoint.index && Double.compare(waypoint.latitude, latitude) == 0 && Double.compare(waypoint.longitude, longitude) == 0 && altitude == waypoint.altitude && Objects.equals(name, waypoint.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name, latitude, longitude, altitude);
    }

    @Override
    public int compareTo(Waypoint o){
        return index - o.index;
    }
}
