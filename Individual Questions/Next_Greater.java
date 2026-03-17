import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class Next_Greater {

    public static int[] nextGreaterElement(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){

            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                ans[st.peek()] = nums[i];
                st.pop();
            }

            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int result[] = nextGreaterElement(nums);

        for(int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }
    }
}