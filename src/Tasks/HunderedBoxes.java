package Tasks;

public class HunderedBoxes {
    public static void main(String[] args) {

        boolean[] boxes = new boolean[101]; 

        
        for (int student = 1; student <= 100; student++) {
            for (int box = student; box <= 100; box += student) {
                boxes[box] = !boxes[box]; 
            }
        }

        int count = 0;
        System.out.println("Open boxes are:");

        for (int i = 1; i <= 100; i++) {
            if (boxes[i]) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\n\nTotal open boxes: " + count);
    }
}

