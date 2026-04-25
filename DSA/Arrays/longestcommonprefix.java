public class longestcommonprefix{
    
    public static String longestPrefix(String strs[]) {
        String answer ="";
        for(int i=0;i<strs[0].length();i++){
            char currchar=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
             if(i>=strs[j].length() || strs[j].charAt(i) != currchar){
                return answer;
             }
            }
            answer =answer +currchar;
        }
        return answer;

    }
    public static void main(String args[]){
        String strs[] = {"flower", "flow", "flight"};
        System.out.println(longestPrefix(strs));


    }
}
