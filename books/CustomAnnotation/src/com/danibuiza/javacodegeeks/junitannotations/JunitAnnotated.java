package com.danibuiza.javacodegeeks.junitannotations;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//this is not recommended and unit test methods should be completely independent from each other and stateless
@FixMethodOrder( MethodSorters.NAME_ASCENDING )
public class JunitAnnotated
{

    private int count;

    // will be executed before every test
    @Before
    public void setUp()
    {
        count = 0;
        System.out.println( "setUp(): " + count );

    }

    // it is a test to be executed
    @Test
    public void testMe()
    {
        System.out.println( "testMe(): " + count++ );
    }

    // it is a test to be executed
    @Test
    public void testMeAsWell()
    {
        System.out.println( "testMeAsWell(): " + count++ );
    }

    // will be executed after every test
    @After
    public void destroy()
    {
        System.out.println( "destroy(): " + count );
    }

    // will not be executed
    @Ignore
    @Test
    public void donotTestMe()
    {
        count = -22;
        System.out.println( "donotTestMe(): " + count );
    }

}
