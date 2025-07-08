package s2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set; 
public class HasanAltin_20010310016_Soru3 {

	public static void main(String[] args) {
        int[] firstArray = {-2, 3, -4, 5, -7, 8, 9, -10};
        System.out.println(mystery(firstArray));

        int[] secondArray = {4, 7, -3, -4, 10, 6, -8, -9};
        System.out.println(mystery(secondArray));
    }

    public static int mystery(int[] array) {
        int x = Arrays.stream(array)
                      .filter(n -> n < 0)
                      .map(n -> n * 3)
                      .reduce(0, (n1, n2) -> n1 + n2);
        System.out.print("x: " + x + ", ");

        int y = Arrays.stream(array)
                      .filter(n -> n > 0 && n % 2 != 0)
                      .map(n -> n * n)
                      .sum();
        System.out.print("y: " + y + " --> ");

        return x + y;
    }

//    x: -69, y: 115 --> 46
//    x: -72, y: 49 --> -23
}
		
