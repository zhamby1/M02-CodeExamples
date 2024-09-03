//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Honda", "Nissan", "Ford"};
        for(String car : cars){
            System.out.println(car);
        }

        //make an array and average numbers using for-each loop
        int[] ages = {22,55,33,44,88,21,10};
        float avg = 0;
        float sum = 0;
        int length = ages.length;

        //loop and sum
        for (int age: ages){
            sum = sum + age;
        }
        avg = sum / length;
        System.out.println(avg);


    }
}