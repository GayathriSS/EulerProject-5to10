package com.getingoogle;

/*
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/

public class Smallestmuliple {
	public static void main(String args[]){
		int i=232792560,j;
		
			outerloop:
			for (j=1;j<=20;j=j++){
				//System.out.println(j+" *I*"+i);
				if(i%j!=0){		
					
					break outerloop;}
					else{
						if(j==20){
							System.out.println("Value of I is "+i+" Value of J is "+j);

						
						
					}
					
				}
				
			}
		}
	}

