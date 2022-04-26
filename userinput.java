import java.util.Scanner; // import

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(); // input
        System.out.println("You entered = " + n);
    }
}
