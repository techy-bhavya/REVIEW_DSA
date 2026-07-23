import java.util.*;

public class maxOccuringChar
{
    public static char getMaxOccuringChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFre = 0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch) == false){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch) + 1);
            }
            maxFre = Math.max(maxFre, map.get(ch));
        }
        
        char ans ='\0';
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.get(ch) == maxFre){
                if(ans=='\0'){
                    ans = ch;
                }
                else if(ans>ch){
                    ans = ch;
                }
            }
        }
        return ans;
    }
    
    
	public static void main(String[] args) {
		String s = "treesss";
		System.out.println(getMaxOccuringChar(s));
	}
}



