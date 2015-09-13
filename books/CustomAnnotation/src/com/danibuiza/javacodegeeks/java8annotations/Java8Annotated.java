package com.danibuiza.javacodegeeks.java8annotations;

import java.util.ArrayList;
import java.util.List;

public class Java8Annotated
{

    @SuppressWarnings( "unused" )
    public static void main( String[] args )
    {
        // type def
        @TypeAnnotated
        String cannotBeEmpty = null;

        // type
        List<@TypeAnnotated String> myList = new ArrayList<String>();

        // values
        String myString = new @TypeAnnotated String( "this is annotated in java 8" );

    }

    // in method params
    public void methodAnnotated( @TypeAnnotated int parameter )
    {
        System.out.println( "do nothing" );
    }
}
