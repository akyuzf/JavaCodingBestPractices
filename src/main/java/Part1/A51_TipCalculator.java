package Part1;

/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */
import java.util.Scanner;

public class A51_TipCalculator {

    public static void main(String[] args) {

        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Split:");
        String spilt =input.nextLine();
        System.out.println("Number of people:");
        int ppl = input.nextInt();
        System.out.println("Check amount:");
        double ca = input.nextDouble();
        System.out.println("Service Quality:");
        String Quality=input.next();;
        String r=(ppl==1)?"&":(ppl==2)?"&&":(ppl==3)?"&&&"
                :(ppl==4)?"&&&&":"&&&&&";

        System.out.println("Number of people entered: "+r);
        double totaltip=0;
        if (Quality.equalsIgnoreCase("Poor")){
            totaltip=ca*0.05;
        }else if (Quality.equalsIgnoreCase("Fair")){
            totaltip=ca*0.10;
        }else if (Quality.equalsIgnoreCase("Good")){
            totaltip=ca*0.15;
        }else if(Quality.equalsIgnoreCase("Great")){
            totaltip=ca*0.20;
        }else{
            totaltip=ca*0.25;
        }

        System.out.println("Total to pay: "+(ca+totaltip));
        System.out.println("Total tip: "+totaltip);
        System.out.println("Total per person: "+(ca+totaltip)/ppl);
        System.out.println("Tip per person: "+totaltip/ppl);

    }

}
