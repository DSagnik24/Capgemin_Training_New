package Tasks;

public class PerfectSquareCount {
    public static void main(String[] args) {

        int n = 100;
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            count++;
        }

        System.out.println("Total open boxes: " + count);
    }
}

