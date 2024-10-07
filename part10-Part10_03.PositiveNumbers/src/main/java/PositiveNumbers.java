
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Integer> positive(List<Integer> numbers){
        return numbers.stream() //starts the stream
                .filter(n -> n > 0) //filters any value (integer) that is larger than zero
                .collect(Collectors.toList()); //returns the stream as a new list
    }

}
