import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        System.out.print(">Enter the number:");
        Scanner sc = new Scanner(System.in);
        int data=sc.nextInt();
        System.out.println(">The number is: "+data);
    }
}
