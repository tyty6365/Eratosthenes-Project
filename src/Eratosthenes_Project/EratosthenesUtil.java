package Eratosthenes_Project;

/**
 * Provides an implementation for the Eratosthene's sieve generator
 * @author Tyler Scott 
 * <pre>
 * Date: 08/30/2022
 * Course: csc 3102
 * Project # 0
 * Instructor: Dr. Duncan
 * </pre>
 */

import java.util.ArrayList;

class EratosthenesUtil
{
    /**
     * Generates a sequence of all primes less than the specified parameter
     * @param n the upperbound on the prime sequence
     * @return an array list containing all primes in [2,n] or an empty array
	 * list if n < 2.
     */
    public static ArrayList<Long> sieve(long n)
    {   
		//Implement this method
		return new ArrayList<Long>();
    }
    /**
     * Gives a string representation of the specified array list of longs
     * enclosed in a pair of curly brackets and each adjacent pair of primes 
     * separated by a comma followed by a space.
     * @param v an array list of longs
     * @return a string representation of an array list of longs
     */
    public static String toString(ArrayList<Long> v)
    {
		//Implement this method
        return "{}";
    }
}
