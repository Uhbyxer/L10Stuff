package com.danibuiza.javacodegeeks.jaxbannotations;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxBAnnotated
{

    public static void main( String[] args )
    {

        try
        {

            /* init very simple data to marshal */
            Car car = new Car();
            car.setBrand( "Mercedes" );
            car.setModel( "SLK" );
            car.setYear( 2011 );
            car.setKm( 15000 );

            Car carVW = new Car();
            carVW.setBrand( "VW" );
            carVW.setModel( "Touran" );
            carVW.setYear( 2005 );
            carVW.setKm( 150000 );

            /* init jaxb marshaler */
            JAXBContext jaxbContext = JAXBContext.newInstance( Car.class );
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            /* set this flag to true to format the output */
            jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

            /* marshaling of java objects in xml (output to standard output) */
            jaxbMarshaller.marshal( car, System.out );
            jaxbMarshaller.marshal( carVW, System.out );

        }
        catch( JAXBException e )
        {
            e.printStackTrace();
        }
    }

}
