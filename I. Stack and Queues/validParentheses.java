import java.util.*;

public class validParentheses
{
    public static boolean hasValidParentheses(String exp){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0 || st.peek()!='('){
                    return false;
                }
                st.pop();
            }
            else if(ch=='}'){
                if(st.size()==0 || st.peek()!='{'){
                    return false;
                }
                st.pop();
            }
            else if(ch==']'){
                if(st.size()==0 || st.peek()!='['){
                    return false;
                }
                st.pop();
            }
        }
        // if(st.size() != 0){
        //     return false;
        // }
        // return true;
        return st.isEmpty();
        //agar stack empty hai aur sara brackets over ho gya, mtlb
        //valid parentheses
        //agar sara brackets khatm hogya, fir bhi stack mein opening
        //brackets h, mtlb vo sab opening brackets ka koi closing 
        //brackets nhi h, and hence not valid parentheses
    }
    
    
	public static void main(String[] args) {
		String exp = "((a+b))";
		System.out.println(hasValidParentheses(exp));
	}
}



