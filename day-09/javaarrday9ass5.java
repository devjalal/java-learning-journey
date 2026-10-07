public class javaarrday9ass5 {

    public static void main(String[] args) {
        int[] numbers = {127,456,12, 45, 22, 67, 789,34, 10, 55};
        int largest=numbers[0];
        int index=0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
                index=i;
            }
          
        }
        System.out.println("Largest : "+largest);
        System.out.println("at :"+index);
       
    }
}