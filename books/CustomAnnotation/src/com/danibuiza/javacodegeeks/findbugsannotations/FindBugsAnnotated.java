package com.danibuiza.javacodegeeks.findbugsannotations;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

// for a complete list of possible warnings http://findbugs.sourceforge.net/bugDescriptions.html
//@SuppressFBWarnings( "HE_EQUALS_USE_HASHCODE" )
public class FindBugsAnnotated
{

    @Override
    public boolean equals( Object arg0 )
    {
        return super.equals( arg0 );
    }

}
