import java.util.Scanner;
public class findlarge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter 2 numbers : ");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        if(num1<num2){
            System.out.println("largest num : "+num2);

        }
        else if(num2<num1){
            System.out.println("largest num : "+num1);
        }
        else{
            System.out.println("both are equal");
        }

        
    }
}
