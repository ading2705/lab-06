package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable{
    private String city;
    private String province;

    /**
     * This is a constructor for the City class.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This is a getter for the City name.
     */
    String getCityName(){
        return this.city;
    }
    /**
     * This is a getter for the City province.
     */
    String getProvinceName(){
        return this.province;
    }
    /**
     * This is a comparison that returns how two cities compare to one another.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * This is a equals that returns whether two cities are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        City city = (City) o;

        return Objects.equals(this.city, city.city) &&
                Objects.equals(this.province, city.province);
    }

    /**
     * This is a hashCode that returns a unique ID for each object
     * @return
     */
    @Override
    public int hashCode(){
        return Objects.hash(city, province);
    }

}
