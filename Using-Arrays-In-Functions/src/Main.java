//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //arrays can be used as parameters in functions
    public static void printArray(int[] myarray){
        for(int i = 0; i < myarray.length; i++){
            System.out.println(myarray[i]);
        }
    }
    public static void printArray(double[] myarray){
        for(int i = 0; i < myarray.length; i++){
            System.out.println(myarray[i]);
        }
    }
    public static double[] timeTwo(double[] myarray){
        for(int i = 0; i < myarray.length; i++){
            myarray[i] = myarray[i] * 2;
        }
        return myarray;
    }
    public static void main(String[] args) {
        int[] coolArray = {10,20,30,40};
        printArray(coolArray);
        int[] superCoolArray = {50,60,70,80};
        printArray(superCoolArray);
        double[] doublearray = {10.2,5.5,6.4,3.2};
        printArray(doublearray);

        double[] arrayneedsdoubled = {10.4,88.5,66.5,874.2};

        printArray(timeTwo(arrayneedsdoubled));

    }
}