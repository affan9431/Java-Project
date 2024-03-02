import java.util.Scanner;

class Currnecy {
    int currnecy;
    int currnecy_converter;
    int n;
    String[] curr = { "INR", "USD", "EUR" };

    public void show_currency() {
        System.out.println("Available  currency are:");
        for (int i = 0; i < curr.length; i++) {
            System.out.println(i + ". " + curr[i]);
        }

    }

    public void currnecy_converter() {
        show_currency();
        System.out.println("Converter  from which currency? ");
        System.err.println("1. INR to USD");
        System.err.println("2. USD to INR");
        System.err.println("3. USD to EUR");
        System.err.println("4. EUR to USD");
        System.err.println("5. INR to EUR");
        System.err.println("6. EUR to INR");
        System.out.println("Enter the no.::");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter the  amount of money in INR:");
                Scanner inp1 = new Scanner(System.in);
                currnecy = inp1.nextInt();
                System.out.println("You have entered INR. and want to convert in USD");
                System.out.println(currnecy * 0.012 + " USD is equal to your input amount.");
                break;
            case 2:
                System.out.println("Enter the  amount of money in USD:");
                Scanner inp2 = new Scanner(System.in);
                currnecy = inp2.nextInt();
                System.out.println("You have entered USD. and want to convert in INR");
                System.out.println(currnecy * 82.85 + " INR is equal to your input amount.");
                break;
            case 3:
                System.out.println("Enter the  amount of money in USD:");
                Scanner inp3 = new Scanner(System.in);
                currnecy = inp3.nextInt();
                System.out.println("You have entered INR. and want to convert in EUR");
                System.out.println(currnecy * 0.92 + " EUR is equal to your input amount.");
                break;
            case 4:
                System.out.println("Enter the  amount of money in EUR:");
                Scanner inp4 = new Scanner(System.in);
                currnecy = inp4.nextInt();
                System.out.println("You have entered EUR. and want to convert in USD");
                System.out.println(currnecy * 1.09 + " USD is equal to your input amount.");
                break;
            case 5:
                System.out.println("Enter the  amount of money in INR:");
                Scanner inp5 = new Scanner(System.in);
                currnecy = inp5.nextInt();
                System.out.println("You have entered INR. and want to convert in EUR");
                System.out.println(currnecy * 0.011 + " EUR is equal to your input amount.");
                break;
            case 6:
                System.out.println("Enter the  amount of money in EUR:");
                Scanner inp6 = new Scanner(System.in);
                currnecy = inp6.nextInt();
                System.out.println("You have entered EUR. and want to convert in INR");
                System.out.println(currnecy * 89.93 + " USD is equal to your input amount.");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}

public class Currency_converter {
    public static void main(String[] args) {
        Currnecy currnecy = new Currnecy();
        currnecy.currnecy_converter();
    }

}
