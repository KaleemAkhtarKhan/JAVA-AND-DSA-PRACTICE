public class tcs1 {
    public static void main(String[] args) {
        //the number is prime number or not
        int num =3;
        for(int i =2; i<num; i++){
            if(num%i==0){
                System.out.println("NOT prime number !!");
                break;
            }else if(num%i!=0){
                System.out.println("prime number !!");
                break;
                
            }

        }
    }

}
