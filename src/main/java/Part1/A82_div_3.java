package Part1;

/*
Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
Expected Output:  3 6 9 12 15 18
 */
public class A82_div_3 {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }

/*
 int j = 1;
        while (j <= 20){
            if (j % 3 == 0) {
                System.out.print(j +" ");
            }
            j++;
        }
 */


    }
}
