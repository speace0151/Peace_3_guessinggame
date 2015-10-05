/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peace_3_challenge0;

/**
 *
 * @author speace0151
 */
public class Peace_3_challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      for(int i = 0; i < 100;i++){
          if(isDavis(i) && isVidal(i) && isClaughton(i)){
              System.out.println(i +" Teambuilding");}
          else if (isDavis(i) && isClaughton(i)){
              System.out.println(i +" chasme");
          }
          else if(isClaughton(i) && isVidal(i)){
              System.out.println(i +" Oldschool");
          }
             else if(isDavis(i)){
               if(isNinja(i)){
       System.out.println(i +" Ninja");
               }else{
       System.out.println(i +" Davis");
               }
       }       
        
      else if(isClaughton(i)){
           if(isHerrdirektor(i)){
        System.out.println(i +" Herrdirektor");
    }else{
           System.out.println(i +" Claughton");
           }
      }
      
      else if(isVidal(i)){
          if(isAnimatethis(i)){
           System.out.println(i +" Animatethis");
          }else{
              System.out.println(i +" Vidal");
          }
    }
      
    
    }  
    }
    
    
    static boolean isDavis(int someNumber){
        return (someNumber % 2 == 0);
    }
    static boolean isNinja(int someNumber){
        return (someNumber % 22 == 0);
    }
    static boolean isClaughton(int someNumber){
        return (someNumber % 3 == 0);
    }
    static boolean isHerrdirektor(int someNumber){
        return (someNumber % 33 == 0);
    }
    static boolean isVidal(int someNumber){
        return (someNumber % 5 == 0);
    }
    static boolean isAnimatethis(int someNumber){
        return (someNumber % 55 == 0);
    }
   
    } 
