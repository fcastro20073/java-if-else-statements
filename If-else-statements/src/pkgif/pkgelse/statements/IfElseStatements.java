
package pkgif.pkgelse.statements;
import java.util.Scanner;
// Import Scanner Here



/**
 *
 * Name:
 * Period:
 * Project Name:
 * 
 * 
 */
public class IfElseStatements {
    static Scanner kb = new Scanner(System.in);

    // Create Scanner Object here So it may be used in all methods
    
    
    
    public static void main(String[] args) {
        // Happy Coding!
        
        
        //Invoke the methods here 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        
        
        
    }
    
    
    public static void question1(){
        System.out.println ("Please enter your grade.");
        int score = kb.nextInt();
        if (score > 70){
            System.out.println ("PASSING");
        }
        else {
        System.out.println ("NOT PASSING");
                
        }
        
    }
    
    public static void question2(){
        System.out.println ("Please enter a speed.");
        int speed = kb.nextInt();
        if (speed <= 50){
            System.out.println("GO");
        }
        else {
            System.out.println("STOP");
        }
        
        
    }
    
    public static void question3(){
        System.out.println("Please provide an integer.");
        int num = kb.nextInt();
        if (num %2 == 0 ){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
    
    public static void question4(){
        System.out.println("Please provide an integer.");
        int num4 = kb.nextInt();
        if (num4 %5 == 0){
            System.out.println("MULTIPLE OF 5");
        }
        else{
            System.out.println("NOT A MULTIPLE OF 5");
        }
    }
    
    public static void question5(){
        System.out.println("Please provide a number.");
        int num5 = kb.nextInt();
        if (num5 <10){
            System.out.println("ONE DIGIT");
        }
        else if (num5 >=100){
            System.out.println("THREE DIGITS");
    }
        else{
            System.out.println ("TWO DIGITS");
        }
        
    }
    
    public static void question6(){
        System.out.println("Please provide a jeresy number.");
        int jeresyNum = kb.nextInt();
        if (jeresyNum == 12|| jeresyNum ==71 ||jeresyNum ==80){
            System.out.println("That number is retired from the Seattle Seahawks.");
        }
        else {
        
    }
    }
    
    public static void question7(){
        System.out.println("Please provide a state.");
        String state = kb.nextLine();
        if (state.equals("Washington")|| state.equals("Oregon")|| state.equals("Idaho")){
            System.out.println("This state is in hte PNW.");
        }
        else{
            System.out.println("You should move to the PNW, it's great here.");
        }
    }
        
    
    public static void question8(){
        System.out.println("Please say whether you want SMALL, TALL, GRANDE, or VENTI.");
        String drinkSize = kb.nextLine();
        if (drinkSize.equals("SMALL")){
            System.out.println("That is 8 ounces.");
        }
        else if (drinkSize.equals("TALL")){
            System.out.println("That is 12 ounces.");
        }
        else if (drinkSize.equals("GRANDE")){
            System.out.println("That is 16 ounces.");
        }
        else if (drinkSize.equals("VENTI")){
            System.out.println("That is 20 ounces.");
        }
        else {
            System.out.println("Please enter one of the options given.");
        }
}

        

    
    public static void question9(){
        System.out.println("Please enter your hours worked and then rate of pay.");
        int hoursWorked = kb.nextInt();
        int rateOfPay = kb.nextInt();
        System.out.println("Please enter your time and a half for any hours worked beyond 40 hours and the amount of overtime you worked.");
        int timeAndHalf = kb.nextInt();
        int overTime = kb.nextInt();
        if (hoursWorked <=40){
            System.out.println( "Your gross income for those hours would be: " + hoursWorked * rateOfPay);
            
        }
        else if (hoursWorked >40){
            System.out.println("Your gross income for those hours would be: " + 40 * rateOfPay + (overTime-40)*timeAndHalf);
        }
        
    }
    
    public static void question10(){
         System.out.println("Please enter your hours worked and then rate of pay.");
         int hours = kb.nextInt();
         int pay = kb.nextInt();
         System.out.println("Please enter your time and a half for any hours worked beyond 40 hours and the amount of overtime you worked.");
         int timeAndHalf2 = kb.nextInt();
         int overTime2 = kb.nextInt();
         if (hours < 40){
             System.out.println( "Your gross income for those hours would be: " + hours * pay);
             
         }
         else if (hours > 40 || hours < 60){
             System.out.println("Your gross income for those hours would be: " + 40 * pay + (overTime2-40)*timeAndHalf2);
             
         }
         else {
             System.out.println("Please see manage.");
         }
        
        
    }
    
}
