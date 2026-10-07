import java.util.Scanner;
public class markgrade {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter mark : ");
            int mark=input.nextInt();
            if(mark>=90 && mark<=100 ){
                System.out.println("Grade : A");
            }
            else  if(mark>=80 && mark<=89 ){
                System.out.println("Grade : B");
            }
            else  if(mark>=70 && mark<=79 ){
                System.out.println("Grade : c");
            }
             else  if(mark>=60 && mark<=69 ){
                System.out.println("Grade : D");
            }
            else  if(mark>=40 && mark<=59 ){
                System.out.println("Grade : E");
            }
            else{
                System.out.println("Grade : F");
            }

        
    }
    

    

    
}
