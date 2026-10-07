public  class javaday9ass3 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 10, 40, 50};
        int target=10;
        int counter=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                counter++;
            }
        }
        System.out.println(target+" reapted "+counter+" times ");
    }
}