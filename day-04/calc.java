import java.util.Scanner;
public class calc {

public static void main(String[] args) {
    System.out.println("please enter 2 numbers");
    Scanner input=new Scanner(System.in);
     double num1=input.nextDouble();
    double num2=input.nextDouble();
    System.out.println("please enter method\n+ \t- \t *\t /");
    String symobol=input.next();
    switch (symobol) {
        case "+":
            double res=num1+num2;
            System.out.println("sum: "+res);
        break;
        case "-":
            res=num1-num2;
            System.out.println("sub: "+res);
        break;
        case "*":
            res=num1*num2;
            System.out.println("mul: "+res);
        break;
        case "/":
            res=num1/num2;
            System.out.println("div: "+res);
        break;



    
        default:
            System.out.println("invalid symbol");
            break;
    }
    
}
}