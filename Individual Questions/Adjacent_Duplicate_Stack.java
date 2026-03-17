import java.util.Scanner;
import java.util.Stack;

public class Adjacent_Duplicate_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // user input
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            } else {
                st.push(ch);
            }
        }

        // build result
        String result = "";
        for(char c : st){
            result += c;
        }

        System.out.println(result);
    }
}