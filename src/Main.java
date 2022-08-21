import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(findUniq(new double[]{ 1, 89, 1, 1, 1, 1 }));

    }
    /*
    Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
    Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
    */

    public static double findUniq(double arr[]) {

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[0]) return arr[i];
            }

        if (arr[0] == arr[2]) return arr[1];

        return arr[0];
    }
}



