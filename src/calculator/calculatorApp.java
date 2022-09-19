package calculator;

import calculator.calculator;

import java.util.*;

public class calculatorApp {

 public static Scanner scanner = new Scanner(System.in);
 public static void main (String[] args){
     System.out.println("please enter two numbers and operators +, /, -, * : ");
     char operator ='0';
     double firstNum=0;
     double secondNum=0;

     try{
         firstNum= scanner.nextDouble();
         operator=scanner.next().charAt(0);
         secondNum=scanner.nextDouble();


     }
     catch(InputMismatchException exp){
         System.out.println("invalid input");
     }
     finally {
         if(operator !='*' && operator != '+' && operator != '/' && operator != '-'){
             System.out.println(operator);
             throw new InputMismatchException();
         }
         calculator calculator = new calculator(firstNum,secondNum,operator);
         System.out.println(calculator.calcul());
     }
 }
}
