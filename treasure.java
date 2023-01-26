/**
 * treasure
 */
public class treasure {

    public static void main(String[] args){
     String optionMove = "left";
     String optionMove2="Wait";
     String optionColor ="Yellow";
     if(optionMove == "left"){
        System.out.println("You came to a lake.");}
        else{
        System.out.println("Game ended");
    }
        if (optionMove2 == "Wait") {
            System.out.println("you arrived in the island unarmed");}
        else{
            System.out.println("you got attacked");
        }
      
        if (optionColor == "Yellow"){
        System.out.println("you win!");
       }else if (optionColor == "blue") {
        System.out.println("You entered a room full of beasts");
       }else if (optionColor == "red") {
        System.out.println("you entered a room full of fire");
       }
       else{
        System.out.println("game ended");
      }
    }}
     
       
    
   
