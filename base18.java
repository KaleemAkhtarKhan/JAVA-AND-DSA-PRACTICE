public class base18 {
    public static int trapwater(int height[]){
        // calculating left max baundari
        int leftmax[] = new int [height.length];
        leftmax[0] = height[0];
        for(int i =1; i<height.length; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        // calculating rightmax baumdary
        int rightmax[] = new int [height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }
        // calculating water level
        int trapedwater = 0;
        for(int i =0; i<height.length; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
           
            trapedwater = trapedwater +waterlevel-height[i];
        }
        return trapedwater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapwater(height));
    }
}
