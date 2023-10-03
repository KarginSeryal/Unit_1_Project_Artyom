import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Number of people in the party: ");
        double people = Double.parseDouble(s.nextLine());
        System.out.println();
        System.out.print("What percent of the bill are you going to tip: ");
        double tipPercent = (Double.parseDouble(String.format("%,.2f" , Double.parseDouble(s.nextLine()))))/100;
        System.out.println();
        System.out.print("What is the bill: ");
        double bill = Double.parseDouble(s.nextLine());
        double billPerPerson =Double.parseDouble(String.format("%,.2f",  (bill/people)));
        double totalTip = Double.parseDouble(String.format("%,.2f",  (tipPercent * bill)));
        double tipPerPerson = Double.parseDouble(String.format("%,.2f",  (totalTip/people)));
        double totalPerPerson = billPerPerson + tipPerPerson;
        double totalBillWithTip = Double.parseDouble(String.format("%,.2f",  (bill + totalTip)));
        System.out.println();
        System.out.println("Total bill including tip: $" + totalBillWithTip);
        System.out.println("Total bill with tip per person: $" + totalPerPerson);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total tip amount: $" + totalTip);

    }
}