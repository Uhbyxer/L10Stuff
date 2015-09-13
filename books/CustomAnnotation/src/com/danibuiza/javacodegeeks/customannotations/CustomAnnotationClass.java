package com.danibuiza.javacodegeeks.customannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Target {@link ElementType} Type indicates the context where the annotation takes place, in this
 * case class scope
 * 
 * @author dgutierrez-diez
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.TYPE )
public @interface CustomAnnotationClass
{

    public String author() default "danibuiza";

    public String date();

    String getInfo() default "Info";

}
