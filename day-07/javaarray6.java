import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class javaarray6 {
    public static void main(String[] args) {
        int[] arr = {8598989,56,100,78,56,98,78965};
        int chec=arr[0];
        int largest=0;
        for (int i=0;i<=arr.length-1;i++){
            // System.out.println(arr[i]);
            if(chec>=arr[i]){
                 largest=chec;
               
            }
            else{
                chec=arr[i];
                largest=arr[i];
               
            }

         

        }
        System.out.println("largest : "+largest);

        List<Integer> arrlist=new ArrayList<>(arr.length);
        for(int num: arr){
            arrlist.add(num);
        }
        System.out.println(arrlist);
        arrlist.remove(Integer.valueOf(largest));
        System.out.println(arrlist);
        int[] newarr=new int[arrlist.size()];
        for (int i=0;i<arrlist.size();i++){
            newarr[i]=arrlist.get(i);
        }
        int Schec=newarr[0];


       for (int i=0;i<=newarr.length-1;i++){
            // System.out.println(arr[i]);
            if(Schec>=newarr[i]){
                 largest=Schec;
               
            }
            else{
                Schec=newarr[i];
                largest=newarr[i];
               
            }

         

        }
        System.out.println("seconed largest : "+largest);

        

    }
    
}
