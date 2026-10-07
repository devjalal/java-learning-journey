public class javaarr8 {
    public static void main(String[] args) {
         int[][] arr={
    {10,20,30},
    {40,50,60},
    {70,80,90}

 };
 int largest=0;
 int Check=arr[0][0];
 for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        if(Check<=arr[i][j]){
            System.out.println("if part");
            largest=arr[i][j];
        }
        else{
            System.out.println("else");
            Check=arr[i][j];





        }


    }
    System.out.println(largest);
 }

    }
    
}
