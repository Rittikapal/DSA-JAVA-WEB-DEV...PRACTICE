public class maxsubarraysum {
    public static void maxsum(int n[]){
        /*BRUTE FORCE = TIME COMPLEXITY -O(n^3) */
    int crrsum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<n.length;i++){
        int start=i;
        for(int j=i;j<n.length;j++){
            int end=j;
            crrsum=0;
            for(int k=start;k<=end;k++){
                crrsum+=n[k];}

                System.out.print(crrsum);
                if(maxsum<crrsum){
                    maxsum=crrsum;
                }
            }
        
    }
    System.out.println("maxsum="+maxsum);
    }
    public static void main(String args[]){
        int n[]={1,-2,6,-1,3};
        maxsum(n);
    }
}
