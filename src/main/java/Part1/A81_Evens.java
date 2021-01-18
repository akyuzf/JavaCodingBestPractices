package Part1;

/*
Write a program that will print out even numbers from 2 to 100 through the comma.
 */
public class A81_Evens {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        for (int i = 2; i<=100; i++){
            if(i%2==0){
                System.out.print(i+", ");
            }
        }


/*
 for (int i = 2; i<=100; i +=2){

           System.out.print(i + ",");
       }
 */

    }
}
