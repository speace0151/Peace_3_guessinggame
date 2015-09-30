/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peace_3_primes;

/**
 *
 * @author speace0151
 */
public class Peace_3_primes {


     
    public static void main(String[] args) {
  int evens = 0;
        for(int i = 0; i < 100;i++) {
          if(i % 2 == 0){
              
              evens = evens + 1;
          }  
              }
        System.out.println("There are " + evens + " evens");
            }
    
          //What is a Method?
    //A method is a function.
    //It is a little program that communicates with other parts, e.g
    //like finding a square root, something that you want to find again and a  GNU nano 2.4.2             File: Peace_3_0928                                 

          
    
    
   static boolean isEven(int someNumber){
//A return value is the type of value you atre giving back to program
      return (someNumber % 2  == 0);
}   
   static boolean isOdd(int number){
       return (number % 2 != 0);
   }
   static boolean isPrime(int number){
       boolean prime = true;
        int divisors = 0;
        for(int i = 2; i < number/2; i++){
       if(number % i == 0){
           prime = false;
          
       }
       if( divisors > 0){
          return false; 
       } else{
        return true;
        
       }
      

     

