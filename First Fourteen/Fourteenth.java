import java.util.Scanner;

public class Fourteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        if(str == null){
            System.out.println("Empty");
        }
        else{
            System.out.println("Non-Empty");
        }
        sc.close();
    }
}
