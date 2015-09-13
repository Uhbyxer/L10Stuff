package com.danibuiza.javacodegeeks.builtinannotations;

import java.util.ArrayList;
import java.util.List;

public class ClassAnnotatedBuiltIn implements Runnable
{

    @Override
    public void run()
    {
        return;

    }

    @Deprecated
    public String doNotUse()
    {
        return null;
    }

    @SuppressWarnings( "rawtypes" )
    public List getAList()
    {
        return new ArrayList();
    }

    // List is a raw type. References to generic type List<E> should be parameterized
    // ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
    public List getAListNoSuppress()
    {
        return new ArrayList();
    }

}
