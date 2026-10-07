public class arrayjava5 {
    public static void main(String[] args) {
        int arr[]={12,32,34,54,67,89,35};
        int counteven=0;
        int countodd=0;
        for(int i = 0;i<arr.length;i++){
            if(i%2==0){
                counteven=counteven+1;

            }
            else{
                countodd=countodd+1;
            }
            
        }
        System.out.println("even : "+counteven);
            System.out.println("odd  : "+countodd);

    }
    
}
