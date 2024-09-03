//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //two dimensional or multi dimensional arrays use rows and columns
        //you use two brackets to represent multidimensional arrays
        int[][] myNumbers = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        //this looks like the following visually
        //  0 row -  1   2   3   4
        //  1 row -  5   6   7   8
        //  2 row -  9   10  11  12

        //to access number 7
        System.out.println(myNumbers[1][2]);
        //access value 10
        System.out.println(myNumbers[2][1]);

//        myNumbers[2][3] = 15;
//        System.out.println(myNumbers[2][3]);

        for(int[] row : myNumbers) {
            for(int num : row) {
                System.out.println(num);
            }
        }




    }
}