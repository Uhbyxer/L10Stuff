package com.danibuiza.javacodegeeks.customannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Method {@link ElementType} indicates the annotations can be used in method scope
 * 
 * @author dgutierrez-diez
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.METHOD )
public @interface CustomAnnotationMethod
{

    /**
     * Method declarations must not have any parameters or a throws clause. Return types are
     * restricted to primitives, String, Class, enums, annotations, and arrays of the preceding
     * types.
     * 
     * @return default danibuiza
     */
    public String author() default "danibuiza";

    public String date();

    public String description();

}
