public class array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 60;
        arr[2] = 50;
        arr[3] = 80;
        arr[4] = 30;

        int sum = 5;

        for (int i : arr) {
            sum=sum+i;
        }
        System.out.println("sum = " + sum);

    }
}
