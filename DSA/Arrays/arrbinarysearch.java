public class arrbinarysearch {
    public static int binarysrch(int n[],int key){
    int start=0;
    int end=n.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(n[mid]==key){
            return mid;
        }
        if(n[mid]<key){
            start=mid+1;
        } else{
            end=mid-1;
        }
       }
        return -1;

    }
    
    public static void main(String[] args) {
        int n[]={2,4,6,8,10,12,14,16,18,20};
        int key=21;
               System.out.println("binary search of given key is:"+ binarysrch(n,key));
    }
}
