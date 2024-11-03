public class App {
    public static void main(String[] args) {

        //Part 1: Variables

        String firstName = "Abdullah";
        String lastName = "Alhumaidhan";
        int age = 23;
        int amount = 178;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(amount);

        //Part 2: Boolean

        boolean married = false;

        //Part 3: String Interpolation

        double amount2 = 20;
        String deposit = "Deposit";
        String withdraw = "Withdraw";

        System.out.println("The amount is " + (int)amount2 + "KD");
        System.out.println("Would you like to " + deposit + " or " + withdraw + " the amount?");

        //Part 4: Arithmetic Spice

        int amount3 = 5;
        System.out.println(amount3 + " plus " + amount3 + " makes " + (amount3+amount3));

        //Part 5: String Methods

        String fullName = "Abdullah Alhumaidhan";

        System.out.println("My name is " + fullName.split(" ")[0].toUpperCase() + " and my last name length is " + fullName.split(" ")[1].length());

        //Part 6: Starts with d

        System.out.println(fullName.split(" ")[1].startsWith("d"));

    }
}