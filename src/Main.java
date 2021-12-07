import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> numExist = Optional.of(4);
        Optional<Integer> numNotExist = Optional.empty();

//        if(numExist.isPresent()) {
//            System.out.println(numExist.get());
//        }

        // Use method reference to replace lambda expression to make code more readable
//        numExist.ifPresent(System.out::println);
//        numNotExist.ifPresent(System.out::println);

        findNumberExist(new Integer[]{1,2,3}, 1).ifPresent(System.out::println);
        // Won't print since Optional is empty
        findNumberExist(new Integer[]{1,2,3}, 10).ifPresent(System.out::println);
    }

    // It might contain an Integer, or it may be empty. Instead of return Integer, use Optional instead!
    public static Optional<Integer> findNumberExist(Integer [] arr, int target) {
        return Arrays.stream(arr).filter(num -> num == target).findFirst();
//        for(Integer num : arr) {
//            if(num == target) {
//                return Optional.of(num);
//            }
//        }
//        return Optional.empty();
    }
}
