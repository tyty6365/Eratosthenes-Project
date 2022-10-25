package Eratosthenes_Project;

/**
 /**
 * A program to profile the Eratosthene's Sieve prime generator
 * and compare the exact value of the prime-counting function and
 * the n/ln(n) approximation.
 * @author Tyler Scott 
 * @see EratosthenesUtil
 * <pre>
 * Date: 08/30/2022
 * Course: csc 3102
 * Project # 0
 * Instructor: Dr. Duncan
 * </pre>
 */
 
import java.util.ArrayList;
import java.util.Scanner;
public class EratosthenesProfiler extends EratosthenesUtil
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer n to generate primes in [2,n]: ");
        long c = sc.nextLong();
        //System.out.println("P(" + c + ")= {" );
		long n = sc.nextLong();
        sieve(n);
		
	}
	public static ArrayList<Long> sieve(long n)
    {   
		ArrayList<Long> primes = new ArrayList<Long>(); //stores prime numbers 

		if(n < 2) {
			return primes;
		}
		else {
		boolean[] prime = new boolean [(int)n];
		
		for(int i = 0; i < n; i++ ) {
		prime[i] = true;
		}
		
		for(int p = 2; p * p <= n; p++ ) { //if p is true we have a another loop which increments p		
			if(prime[p] == true) {
				for(int i = p * p; i <= n; i+= p)
				prime[i] = false;
			}
		}
		for(int i = 2; i <= n; i++) {
			if(prime[i] == true)
				System.out.println(i + "");
	 }
		String list = primes.toString();

	}
		return primes;
    }
   
	
	public static String toString(ArrayList<Long> v) {
	 //stores prime numbers 
	//returning primes from arraylist and inserting comma in between 
        return ("{}" + list);
    }
	
}