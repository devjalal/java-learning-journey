import java.util.Scanner;
public class evenorodd {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please  enter a number");
        double num=input.nextDouble();
        if(num%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
        
    }
    
}
