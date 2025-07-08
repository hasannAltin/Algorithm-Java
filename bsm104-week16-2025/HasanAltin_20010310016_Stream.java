import java.util.Arrays;
import java.util.stream.IntStream;

public class HasanAltin_20010310016_Stream {

    public static void main(String[] args) {

        int[] array = { 5, -1, -3, 20, 47, -10, -6, -4, 0, -6, -6 };
        System.out.println("sum abs value");
        System.out.println(sumAbsValue(array));
        System.out.println();

        System.out.println("count negatives");
        System.out.println(countNegatives(array));
        System.out.println();

        System.out.println("largest even");
        System.out.println(largestEven(array));
        System.out.println();

        System.out.println("multOf10");
        multOf10();
        System.out.println();

        System.out.println("toSortedForm");
        System.out.println(toSortedForm("abcadabccab"));
    }

    public static void multOf10() {
        int largest = IntStream.of(55, 20, 19, 34, 40, -2, 62, 30)
            .filter(sayi -> sayi % 10 == 0)
            .max()
            .getAsInt();

        System.out.println(largest);
    }

    public static int sumAbsValue(int[] array) {
        int sonuc = Arrays.stream(array)
            .map(n -> Math.abs(n))
            .sum();

        return sonuc;
    }

    public static int countNegatives(int[] array) {
        int sonuc = (int) Arrays.stream(array)
            .filter(n -> n < 0)
            .map(n -> 1)
            .sum();

        int sonuc2 = (int) Arrays.stream(array)
            .filter(n -> n < 0)
            .count();

        int sonuc3 = Arrays.stream(array)
            .filter(n -> n < 0)
            .map(n -> 1)
            .reduce(0, (sayi1, sayi2) -> sayi1 + sayi2);

        return sonuc3;
    }

    public static int largestEven(int[] array) {
        return Arrays.stream(array)
            .filter(n -> n % 2 == 0)
            .max()
            .getAsInt();
    }

    public static String toSortedForm(String str) {
        String sonuc = str.chars()
            .sorted()
            .mapToObj(ch -> String.valueOf((char) ch))
            .reduce("", (s1, s2) -> s1 + s2);

        return sonuc;
    }
}
