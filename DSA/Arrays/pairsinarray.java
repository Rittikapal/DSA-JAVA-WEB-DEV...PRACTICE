public class pairsinarray {
    public static void pairs(int n[]){
   for(int i=0;i<n.length;i++){
    int current=n[i];
    for(int j=i+1;j<n.length;j++){
        System.out.print("("+current+" , "+n[j]+")");
    }
    System.out.println();
   }
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        pairs(n);
    }
}
