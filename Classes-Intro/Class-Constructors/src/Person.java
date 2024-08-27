public class Person {
    //list the variables you want to use
    String name;
    int age;
    double checkingAcctBalance;

    // I do not know the data each time I create an instance of this class.  I need to know the data upon creation.
    //we use constructors to create this.
    //constructors are special methods
    public Person(String name, int age, double checkingAcctBalance) {
        this.name = name;
        this.age = age;
        this.checkingAcctBalance = checkingAcctBalance;

    }
}
