public class Exam_4 {
    public static void main(String[] args) {
        char c = 'Z';
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(c + " ");
                c--;
            }
            System.out.println(" ");
        }
    }
}
