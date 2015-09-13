package com.danibuiza.javacodegeeks.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//this class is marked as auto-discoverable for the spring processor automatic to discover this as a bean
@Component
public class DependencyInjectionAnnotation
{

    private String description;

    public String getDescription()
    {
        return description;
    }

    // When Spring finds an @Autowired annotation used with setter methods, it tries to perform
    // byType autowiring on the method
    @Autowired
    public void setDescription( String description )
    {
        this.description = description;
    }

}
