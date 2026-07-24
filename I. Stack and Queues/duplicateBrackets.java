import java.util.*;

public class duplicateBrackets
{
    public static boolean hasDuplicateBrackets(String exp){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    return true;
                }
                else{
                    while(!st.isEmpty() && st.peek()!='('){
                        st.pop();
                    }
                    if(!st.isEmpty()){
                        st.pop();
                    }
                    
                }
            }
            else{
                st.push(ch);
            }
        }
        return false;
    }
    
    
	public static void main(String[] args) {
		String exp = "((a+b))";
		System.out.println(hasDuplicateBrackets(exp));
	}
}



