public class javaday9as1{
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50, 65};
        int find=50;
        int index=0;
        boolean found=false;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==find){
                found=true;
                index=i;

                break;
            }
            else{
                found=false;
            }



        
        }
        if(found){
            System.out.println(find+" found at index"+index);
        }
        else{
            System.out.println("not found");
        }
    }
}