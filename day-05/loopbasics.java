import java.util.Scanner;
public class loopbasics {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter num");
        int num=input.nextInt();
        

        for(int i=num;i>=1;i--){
            System.out.println(i);
        }
       
    }
    
}
