package GroupExercise2;

public class MarksTest {
    public static void main(String[] args) {
        A studentA = new A(69.0, 81.0, 93.0);
        System.out.println("Student A percentage: " + studentA.getPercentage());

        B studentB = new B(77.0, 88.0, 69.0, 97.0);
        System.out.println("Student B percentage: " + studentB.getPercentage());
    }
}
