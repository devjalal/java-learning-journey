import java.util.Scanner;
public class multable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number : ");
        int num=input.nextInt();
        int res=0;
        for(int i=1;i<=10;i++){
            res=num*i;
            System.out.println(num +"*" +i +"="+res);
            
           
        }
    }
    
}
