package calculator;

public class calculator {
    static double firstNum=0,secondNum=0;
    static char operator='+';
    public calculator(double firstNum, double secondNum, char operator){
        this.firstNum=firstNum;
        this.secondNum=secondNum;
        this.operator=operator;

    }
    public static double calcul(){
        double results=0.0;
        switch (operator){
            case '+' :
                results=operartions.add(firstNum,secondNum);
                break;
            case '-':
                results=operartions.sub(firstNum,secondNum);
                break;
            case '*':
                results=operartions.mul(firstNum,secondNum);
                break;
            case '/':
                results=operartions.div(firstNum,secondNum);
                break;
        }


        return results;

    }
}
