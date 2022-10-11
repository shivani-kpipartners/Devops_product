package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test; 

public class TestPrime {
	
	public class PrimeTest {
	     @Test
	     public void evaluatesExpression() 
	     {
	        Prime n=new Prime();
	        boolean s=n.isPrime(2);
	         assertEquals(false,s);
	        
	     }
	     }}    