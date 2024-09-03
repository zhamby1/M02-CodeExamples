
public class Main {
    public static void main(String[] args) {

        //arrays are fixed size and data type.  They can be accessed by their index (position)
        //each item inside an array is called an element
        //arrays can be looped through or accessed by the index (starts at 0)

        //array without data
        int [] myValues = new int[10]; //inside the brackets you determine size.
        //to assign value say varname[index] = whatever value
        myValues[0] = 10;
        myValues[1] = 20;
        myValues[2] = 30;
        myValues[3] = 40;

        System.out.println(myValues[3]);

        //we can also create a list that has values inside without just declaring.  ie initializing
        double[] myNumbers = {19.2,12.5,5.5,8.8};
        System.out.println(myNumbers[3]);

        //access array's length
        System.out.println(myNumbers.length);
    }
}