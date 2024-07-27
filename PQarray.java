public class PQarray {
    
    public static int liniarsearch(String fruits[], String  key){
        for(int i=0; i<fruits.length; i++){
            if(fruits[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String fruits[]= {"coca", "samosha" , "chole bhature", "chips"};
        String key = "chips";
        int  index = liniarsearch(fruits,key);
        if(index==-1){
            System.out.print("the value is not found!!");
        }else{
            System.out.println("the value is at index :"+index);
        }
        System.out.println();
        System.out.println("the value is at index "+index+" is :"+key);
    }
}
