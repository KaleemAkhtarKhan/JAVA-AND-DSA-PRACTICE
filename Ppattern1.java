public class Ppattern1 {
    public static void main (String[] args){
        for ( int line = 1; line <=4; line++){
            for ( int j = 1; j<=(4 - line+1) ; j++){
               System.out.print("*");
            }System.out.println();
        }
    }

}
