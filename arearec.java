import java.util.Scanner;
class Main{
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter width:  ");
        int Width = input.nextInt();
        System.out.println("Enter Height:  ");

        int Height = input.nextInt();
        int res=Width*Height;
 
        System.out.println("width  : "+Width);
        System.out.println("Height : "+Height);
        System.out.println("area rec: "+res);




    }
}