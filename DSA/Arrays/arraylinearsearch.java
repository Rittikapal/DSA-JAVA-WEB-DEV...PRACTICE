public class arraylinearsearch {
    public static int linearsearch(int number[],int key){
    for(int i=0;i<number.length;i++) {
        if(number[i]==key){
            return 1;
        }
         }
         return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int  key=16;
        int index=linearsearch(number,key);
        if(index==-1){
            System.out.println("number not found");
        }
        else{
            System.out.print("found" +index);
        }
    }
    
}
