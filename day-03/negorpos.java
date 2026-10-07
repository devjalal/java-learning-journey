import java.util.Scanner;
public class negorpos{
    public static void main(String[] args) {
        System.out.println("please enter a num : ");
        Scanner input=new Scanner(System.in);
        double num=input.nextDouble();
        if(num<0){
            System.out.println("-ve");
        }
        else if(num>0){
            System.out.println("+ve");

        }
        else{
            System.out.println("zero");
        }
        
    }
}