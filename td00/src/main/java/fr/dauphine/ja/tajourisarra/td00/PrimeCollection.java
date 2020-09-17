package fr.dauphine.ja.tajourisarra.td00;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 *
 */
public class PrimeCollection {
	ArrayList<Integer> numbers;

	public PrimeCollection () {
		numbers = new ArrayList<>();
	}
	public void initRandom (int n, int m) {
		Random rand = new Random();
		
		for (int i= 0; i<n; i++) {
			numbers.add(rand.nextInt(m));
		}
	}
	public boolean isPrime (int p) {
		
		for (int i=2; i< Math.sqrt(p); i++) {
			if (p%i == 0) {
				return false;
			}
		}
		return true;
	}
	public void printPrimes() {
		System.out.println("Les nombres suivants sont premiers ");
		for (Integer i : numbers) {
			if (isPrime(i)){
				System.out.println(i);
			}
		}
	}
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        PrimeCollection collection = new PrimeCollection();
        collection.initRandom(100,999);
        collection.printPrimes();
        
    }
}
