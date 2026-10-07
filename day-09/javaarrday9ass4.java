import java.util.Scanner;
public class javaarrday9ass4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10, 40};
        Scanner inp=new Scanner(System.in);
        System.out.println("please enter target");
        int target=inp.nextInt();
        inp.close();

        int counter=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                counter++;
                
            }
        }
        System.out.println(target+" appears "+counter+" times ");

    }
    
}
