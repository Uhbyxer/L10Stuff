package com.danibuiza.javacodegeeks.jaxbannotations;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType( propOrder = { "brand", "model", "year", "km" } )
@XmlRootElement( name = "Car" )
class Car
{
    String brand;
    String model;
    int    year;
    int    km;

    @Override
    public String toString()
    {
        return brand + " " + model + " " + " " + year + " " + km;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand( String brand )
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel( String model )
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear( int year )
    {
        this.year = year;
    }

    public int getKm()
    {
        return km;
    }

    public void setKm( int km )
    {
        this.km = km;
    }

}
