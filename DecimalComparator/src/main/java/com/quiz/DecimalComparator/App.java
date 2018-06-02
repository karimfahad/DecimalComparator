package com.quiz.DecimalComparator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean result;
        result = areEqualByThreeDecimalPlaces(3.144, 3.147);
    	System.out.println( result );
    }
    
    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
    	if (one - two == two)
    		return true;
    	else return false;
    }
}
