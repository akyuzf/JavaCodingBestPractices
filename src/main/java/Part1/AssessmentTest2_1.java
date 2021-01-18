package Part1;

/*
Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.
 */
public class AssessmentTest2_1 {
    public static void main(String[] args) {

        //WRITE YOUR CODE HERE
        for (int i = 11; i <= 121; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
