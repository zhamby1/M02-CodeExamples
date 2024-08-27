public class Person {
    //give my person a name that doesn't change
    //instance variable - does not change unless overidden
    String name = "Zach";
    int age = 39;
    double checkAcctBalance = 0;


    //methods
    public void deposit(double amount){
        checkAcctBalance = checkAcctBalance + amount;
    }
}
