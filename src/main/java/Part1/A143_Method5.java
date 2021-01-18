package Part1;

/*
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:


*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that, and an if that checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
 */
public class A143_Method5 {

    public static void printHollowRect(){
        // write your code here:
        System.out.println("*****");
        for(int i=0;i<=2;i++){
            System.out.println("*   *");
        }
        System.out.println("*****");

    }// end your code

/*
  for (int i = 1; i <= 5; i++) {

                    for (int j = 1; j <= 5; j++) {
                        if (i== 1 || i==5 ||
                                j==1 || j== 5)  {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
            System.out.println();
        }

  }
 */


    public static void main(String[] args) {

        printHollowRect();
    }
}
