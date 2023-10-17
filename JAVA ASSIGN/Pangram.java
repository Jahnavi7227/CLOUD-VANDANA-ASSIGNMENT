public class Pangram{
    public static boolean isPangram(String s){
        boolean[] alpha=new boolean[26];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                    alpha[c-'a']=true;
            }
        }
        for(boolean isPresent:alpha){
            if(!isPresent){
                return false;
            }
        }
        return true;
            }
     public static void main(String args[]){
                String s="The quick brown fox jumps over the lazy dog";
                if(isPangram(s)){
                    System.out.println("Is a pangram");
                }
                else{
                    System.out.println("Not Pangram");
                }
    }
}
