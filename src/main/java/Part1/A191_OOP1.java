package Part1;

/*
The class Atts holds a few attributes and has a method called asString.

the attributes are name and color -both are strings and amount which is an int.
their visibility is public.

asString returns a string showing all the Atts in a format.

for example:

   Atts a = new Atts();
   a.name = "table";
   a.color = "brown";
   a.amount = 1;

   System.out.println(a.asString());

 */
class Atts {
    public String name;
    public String color;
    public int amount;

    public String asString() {
        return "name: " + name + " color: " + color + " amount: " + amount;
    }

}

public class A191_OOP1 {

    public static void main(String[] args) {

        Atts a = new Atts();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;


        System.out.println(a.asString());
    }


}
