package com.danibuiza.javacodegeeks.java8annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Repeatable annotation, needs a container {@link RepeatedValues}
 * 
 * @author dgutierrez-diez
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.TYPE_USE )
@Repeatable( RepeatedValues.class )
public @interface CanBeRepeated
{

    String value();
}
