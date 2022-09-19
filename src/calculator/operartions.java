package calculator;

public class operartions {
    static double firstNum=0,secondNum=0;
    public static double add(double firstNum,double secondNum){

        return firstNum+secondNum;
    }
    public static double sub(double firstNum,double secondNum){
        return firstNum-secondNum;
    }
    public static double mul(double firstNum,double secondNum){

        return firstNum*secondNum;
    }
    public static double div(double firstNum,double secondNum){
        if(firstNum<0||secondNum<0){
            System.out.println("try other numbers");
            return 0.0;
        }
        return firstNum/secondNum;
    }
}
