import java.util.Scanner;
public class counter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter num : ");
        int num=input.nextInt();
        int counter = 0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
            counter++;
            }


        }
        System.out.println("Count : "+counter);
    }
    
}
