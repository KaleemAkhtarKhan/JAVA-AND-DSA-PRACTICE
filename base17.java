public class base17 {
    // trapimg rain water problem 
    public static int trapedwater(int height[]){
        // calsulating the left max baundary
        int leftmax[] = new int [height.length];
        for(int i =1; i<height.length; i++){
            leftmax[0] = height[0];
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        // calculation of rightmax baundary
        int rightmax[] = new int [height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i =height.length-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }
        // calculation  of water levels 
        
        int trapedWter =0;
        for(int i=0; i<height.length; i++){
           int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapedWter = trapedWter+ waterlevel-height[i];
        }
        return trapedWter;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapedwater(height));
    }
    
}
