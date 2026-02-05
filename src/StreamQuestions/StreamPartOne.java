package StreamQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPartOne {
    public static void main(String[] args) {
        //1️⃣ Filter even numbers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> evens = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

//        2️⃣ Find numbers greater than 50
        List<Integer> greaterlist = Arrays.asList(100, 20, 30, 40, 50, 60, 77);

        greaterlist.stream()
                .filter(n -> n > 50)
                .forEach(System.out::println);


//        3️⃣ Square all numbers
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> squares = list1.stream()
                .map(n -> n * n)
                .toList();

//        4️⃣ Convert list of strings to uppercase
        List<String> names = Arrays.asList("shubham", "runita", "sada", "sam");

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .toList();

//        5️⃣ Count elements
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        long count = list2.stream().count();

//        6️⃣ Remove null values
        List<String> list3 = Arrays.asList( "runita", null, "sam");

        List<String> nonNulls = list3.stream()
                .filter(Objects::nonNull)
                .toList();

//        7️⃣ Sort numbers (ascending)
        List<Integer> list4 = Arrays.asList(1, 2, 7, 3, 4, 5, 6);

        list4.stream()
                .sorted()
                .toList()
                .forEach(System.out::println);

//        8️⃣ Sort in descending order
        List<Integer> list5 = Arrays.asList(1, 2, 7, 3, 4, 5, 6);
        list5.stream()
                .sorted(Comparator.reverseOrder())
                .toList()
                .forEach(System.out::println);

//        9️⃣ Limit first 5 elements
       List<Integer> list6 = Arrays.asList(1, 2, 7, 3, 4, 5, 6);
        List<Integer> firstFive = list6.stream().limit(5).toList();
        System.out.println(firstFive);

//        🔟 Skip first 3 elements
        List<Integer> list7 = Arrays.asList(1, 2, 7, 3, 4, 5, 6);

        List<Integer> afterThree = list7.stream()
                .skip(3)
                .toList();
        System.out.println(afterThree);

//        1️⃣1️⃣ Find first element
      List<Integer> list8 = Arrays.asList( 2, 7, 3, 4, 5, 6);
        Optional<Integer> first = list8.stream().findFirst();

//        1️⃣2️⃣ Find any element
        List<Integer> list9 = Arrays.asList( 2, 7, 3, 4, 5, 6);
        Optional<Integer> any = list9.stream().findAny();

//        1️⃣3️⃣ Check if any match (any even number)
        List<Integer> list11 = Arrays.asList( 2, 7, 3, 4, 5, 6);
        boolean hasEven = list11.stream().anyMatch(n -> n % 2 == 0);

//        1️⃣4️⃣ Check all match
        List<Integer> list12 = Arrays.asList( 2, 7, 3, 4, 5, 6);
        boolean allPositive = list12.stream().allMatch(n -> n > 0);

//        1️⃣5️⃣ Check none match (no negative numbers)
        List<Integer> list13 = Arrays.asList( 2, 7, 3, 4, 5, 6);
        boolean noneNegative = list13.stream().noneMatch(n -> n < 0);

//        1️⃣6️⃣ Sum of all numbers
        List<Integer> list14 = Arrays.asList( 2, 7, 3, 4, 5, 6);

        int sum = list14.stream()
                .mapToInt(Integer::intValue)
                .sum();

//        1️⃣7️⃣ Max number
        List<Integer> list15 = Arrays.asList( 2, 7, 3, 4, 5, 6);
        int max = list15.stream()
                .max(Integer::compare)
                .get();

//        1️⃣8️⃣ Min number
        List<Integer> list16 = Arrays.asList( 2, 7, 3, 4, 5, 6);

        int min = list16.stream()
                .min(Integer::compare)
                .get();

//        1️⃣9️⃣ Average
        List<Integer> list17 = Arrays.asList(2, 7, 3, 4, 5, 6);

        double avg = list17.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

//        2️⃣0️⃣ Remove duplicates
        List<Integer> list18 = Arrays.asList(2, 2, 7, 3, 4, 5, 5, 6);
        list18.stream().sorted().distinct().toList().forEach(System.out::println);

//        2️⃣1️⃣ Convert list to set
        List<Integer> list19 = Arrays.asList(2, 2, 7, 3, 4, 5, 5, 6);
        Set<Integer> set = list19.stream().collect(Collectors.toSet());

//        2️⃣2️⃣ Join strings with comma
        List<String> names1 = Arrays.asList("runita", "will", "scam", "you");
        String result = names1.stream()
                .collect(Collectors.joining(", "));


//        2️⃣3️⃣ Group numbers by even / odd
        List<Integer> list21 = Arrays.asList(1, 2, 7, 3, 4, 8, 5, 6);

        Map<Boolean, List<Integer>> map =
                list21.stream()
                        .collect(Collectors.groupingBy(n -> n % 2 == 0));

//        2️⃣4️⃣ Count frequency of characters
        List<String> str = Arrays.asList("runita", "will", "scam", "you");

        Map<Character, Long> freq =
                str.stream()                    // Stream<String>
                        .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                        .collect(Collectors.groupingBy(
                                c -> c, Collectors.counting()));

//        2️⃣5️⃣ Partition by condition (> 50)
        List<Integer> list22 = Arrays.asList(10, 200, 70, 3, 40, 80, 5, 6);
        Map<Boolean, List<Integer>> map1 =
                list22.stream()
                        .collect(Collectors.partitioningBy(n -> n > 50));


    }
}

