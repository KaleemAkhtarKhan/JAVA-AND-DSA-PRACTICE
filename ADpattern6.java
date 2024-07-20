public class ADpattern6 {
    
    public static void butterfly(int n){
        for(int i= 1; i<=n; i++){
            // to print one side star 
            for(int j=1; j<=i; j++){
                System.out.print("*");  
            }
            // to print space 
            for(int j= 1; j<=2*(n-i); j++){
                System.out.print(" ");

            }
            // to print second side star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();

         }

         // for inverce print of that buttery fly pattern 
                for(int i= n; i>=1; i--){
                    // same as uper code except the outer looop!! 
                    for(int j=1; j<=i; j++){
                        System.out.print("*");  
                    }
        
                    for(int j= 1; j<=2*(n-i); j++){
                        System.out.print(" ");
        
                    }
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                
                System.out.println();
            }
    

    }



    public static void main(String[] args) {
        butterfly(5);
    }

}
