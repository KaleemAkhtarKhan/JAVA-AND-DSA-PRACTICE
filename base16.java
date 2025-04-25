public class base16 {
    public static int trapedwater(int height[]){
        
        // calculating the leftmax baundari 
        int leftmax[]= new int [height.length];
        leftmax[0] = height[0];
        for(int i =1; i<height.length; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        // calculation of the right Max baumdary 
        int rightmax[] = new int [height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i =height.length-2 ;i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);

        }
        // calculation  of water levels 
        int trapedwater= 0;
        for(int i =0; i<height.length; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapedwater = trapedwater+ waterlevel-height[i];
        }
        return trapedwater;
        
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
       
        System.out.println(trapedwater(height));
    }
}
