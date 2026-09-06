import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        
        //if opening bracket comes then push into the stack and if closing bracket are come and peek of the stack is same of that bracket(but in opening one) then pop both of the bracket

        
    }

    static boolean isBalanced(String s){
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else{
                if(st.size()==0){
                    return false;
                }
                char top = st.peek();
                if(sameStyle(top, ch)) st.pop();
                else return false;
            }
        }
        return (st.size()==0);
    }

    private static boolean sameStyle(char a, char b) {
       if(a=='[' && b==']') return true;
       if(a=='{' && b=='}') return true;
       if(a=='(' && b==')') return true;
       return false;
    }
}
