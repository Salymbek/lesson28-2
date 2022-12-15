import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);

        System.out.println("~~~~~~~SUMMA~~~~~~~~");
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


        System.out.println("~~~~~~~AVERAGE~~~~~~");
        double avg = getAverage(list);
        System.out.println(avg);


    }
    private static double getAverage(List<Integer>list) {
            return list.stream()
                    .mapToInt(a -> a)
                    .average().orElse(0);
    }


}