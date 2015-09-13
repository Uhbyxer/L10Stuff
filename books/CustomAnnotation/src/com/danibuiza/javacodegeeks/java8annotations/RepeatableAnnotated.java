package com.danibuiza.javacodegeeks.java8annotations;

/**
 * The annotation {@link CanBeRepeated} can be used more than once
 * 
 * @author dgutierrez-diez
 */
@CanBeRepeated( "the color is green" )
@CanBeRepeated( "the color is red" )
@CanBeRepeated( "the color is blue" )
public class RepeatableAnnotated
{

}
