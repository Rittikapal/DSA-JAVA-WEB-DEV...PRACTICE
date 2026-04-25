public class removeelement {
    public static int remove(int arr[] , int val){
       
       int k=0;
       for(int i=0;i<arr.length;i++){
        while(arr[i] != val) {
            arr[k]=arr[i];
           i++;
        }

       }
       return k;
       
    }
    public static void main(String[] args) {
        int arr[]= {3,2,2,3};
        int val =3;
        int result =remove(arr , val);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        
        
        
    }
}
