
import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            
            if( c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if ( c == ')' || c =='}' || c ==']'){
                
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != ']'))
                     {
                     return false;
                     }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

  public static void main(String[] args){
    String t1 = "[{()}]";
    String t2 = "[(])";
    String t3 = "((()))";
    String t4 = "()[]{}";

    System.out.println(t1+ " is balanced: " + isBalanced(t1));
    System.out.println(t2+ " is balanced: " + isBalanced(t2));
    System.out.println(t3+ " is balanced: " + isBalanced(t3));
    System.out.println(t4+ " is balanced: " + isBalanced(t4));

  }
}
