public class javaday10ass5 {
    static int findLargest(int a,int b){
        if(a>b){
            return a;

        }
        else{
            return b;
        }



    }
    public static void main(String[] args) {
        int result=findLargest(100, 200);
        System.out.println("Largest : "+result);
    }

    
}