package com.danibuiza.javacodegeeks.hibernateannotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "hibernate_annotated" )
public class HibernateAnnotated
{

    @Id
    @GeneratedValue
    @Column( name = "id" )
    private int    id;

    @Column( name = "description" )
    private String description;

    
    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }
}
