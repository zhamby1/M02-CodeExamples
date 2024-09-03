import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = myscanner.nextLine();
        System.out.print("Enter your age ");
        int age = myscanner.nextInt();
        System.out.print("Enter your starting balance ");
        double startingBalance = myscanner.nextDouble();

        Person me = new Person(name,age,startingBalance);
        System.out.print(me.name + " " + me.age + " " + me.checkingAcctBalance);

        //person


    }
}