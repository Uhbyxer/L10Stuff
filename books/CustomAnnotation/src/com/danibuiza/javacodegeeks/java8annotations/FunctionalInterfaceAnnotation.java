package com.danibuiza.javacodegeeks.java8annotations;

public class FunctionalInterfaceAnnotation
{

    public static void main( String[] args )
    {

        // implementing its methods
        @SuppressWarnings( "unused" )
        MyCustomInterface myFuncInterface = new MyCustomInterface()
        {

            @Override
            public int doSomething( int param )
            {
                return param * 10;
            }
        };

        // using lambdas
        @SuppressWarnings( "unused" )
        MyCustomInterface myFuncInterfaceLambdas = ( x ) -> ( x * 10 );
    }

    @FunctionalInterface
    interface MyCustomInterface
    {
        /*
         * more abstract methods will cause the interface not to be a valid functional interface and
         * the compiler will thrown an error:Invalid '@FunctionalInterface' annotation;
         * FunctionalInterfaceAnnotation.MyCustomInterface is not a functional interface
         */
        // boolean isFunctionalInterface();

        int doSomething( int param );
    }

}
