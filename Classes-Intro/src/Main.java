//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //make instance of Person
        Person myPerson = new Person();
        //to access data inside of a class instance, you have to say varname.property/variable
        System.out.println(myPerson.name);
        System.out.println(myPerson.age);

        Person myPerson2 = new Person();
        System.out.println(myPerson2.name);

        // change/modify attributes/data/variables
        myPerson.name = "Tim";
        System.out.println(myPerson.name);
        System.out.println(myPerson2.name);

        //how to use methods in an instance
        //nameofinstancevar.methodname(argument/value)
        myPerson.deposit(100.00);
        System.out.println(myPerson.checkAcctBalance);


    }
}