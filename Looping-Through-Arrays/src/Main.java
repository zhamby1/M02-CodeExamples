//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //we use for loops to access and display multiple items in an array
        //we use the iterable value (i) to determine the index we are accessing as well for other needs
        String[] cars = {"BMW","Ford","Chevy","Nissan"};
        System.out.println("This is a list of our cars we are selling: ");
        for(int i = 0; i < cars.length; i++){
            // i acts as our index. as we loop i increases in value and goes to the next item in the array.
            System.out.println((i + 1) + ". " + cars[i]);
        }

        //we can also use loops to change multiple values
        int [] test_scores = {85,55,65,75};
        //I was a bad teacher and I want to increase everyone's score by 10 pts
        for(int i = 0; i < test_scores.length; i++){
            test_scores[i] = test_scores[i] + 10;
            System.out.println((i + 1) + ". " + test_scores[i]);
        }


    }
}