package com.wipro.topgear;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String str= "TopGear-Standalone Maven"; // Reverse string
        String reversed = StringUtils.reverse(str);
        System.out.println("Reversed: " + reversed);


    }
}
