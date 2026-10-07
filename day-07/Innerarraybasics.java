
    public class Innerarraybasics {
        
          public static void main(String[] args) {
             int[] numbers={10,20,89,45,78,36};
             int check=numbers[0];
             int smallest = numbers[0];
             
            for(int i=0;i<numbers.length;i++){
      
                if(check<=numbers[i]){
                    smallest=check;
                 

                }
                else{
                    check=numbers[i];
                    smallest=numbers[i];
                }
                
              
              
                
  

                

            }
            System.out.println("smallest : "+smallest);

            
            
          }
           
        }
    
    
        

