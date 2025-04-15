public class string4 {
    public static float getshortestpath(String path){
        int x= 0; 
        int y =0;
        for(int i = 0; i<path.length(); i++){
            int direction = path.charAt(i);
            if(direction =='N'){
                y = y+1;
                
            } else if(direction =='S'){
                y = y-1;
            } else if(direction=='W'){
                x= x-1;
            }else{
                x= x+1;
            }  
        }
        int X2 = x*x;
        int Y2 = y*y;
        // formula for calculating direction 
        Float result =(float) Math.sqrt(X2+Y2);
        return result;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getshortestpath(path));
    }
}
