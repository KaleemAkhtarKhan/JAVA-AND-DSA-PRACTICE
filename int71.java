public class int71 {
    
    public static void main (String [] args){
        int num[] = {10, 15, 24, 78, 54};
        int key = 24;
        for(int i = 0; i<num.length; i++){
            if(num[i] ==key){
                System.out.print("the number "+key+ " is at index "+i);
             }else{
                System.out.print("the number" +key+ "is not available in the givent array ");
                
             }  
             
            
        }
    }
}
