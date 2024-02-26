import entity.Student;
import interfaces.Calulator;
import interfaces.Printer;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

       /* Function<Integer, Double> addLambda = x-> (double) (x+x);

        System.out.println(addLambda.apply(2));

        Consumer<String> printString = System.out::println;

        printString.accept("Horrorcore Music");

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(3));

        Supplier<Double> returnRandom = () -> Math.random();

        System.out.println(returnRandom.get());

        Printer<String> printer = System.out::println;
        printer.print("Hello");
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(7);
        arr.add(2);
        arr.add(9);
        System.out.println(Arrays.toString(arr.stream().filter(x -> x % 2 != 0).toArray()));

        List<String> strings = new ArrayList<>();
        strings.add("Billy");
        strings.add("Bob");
        strings.add("Joe");
        strings.add("Larry");
        strings.add("Isa");
        System.out.println(strings.stream().filter(x -> x.startsWith("B")).toList());
        System.out.println(arr.stream().collect(Collectors.summarizingInt(Integer::intValue)));

        List<Student> students = Arrays.asList(
                new Student(10l, "Billy", 8),
                new Student(11l, "Jeshua", 10),
                new Student(12l, "Kelly", 9),
                new Student(13l, "Johnny", 13)
        );

        System.out.println(students.stream().max(Comparator.comparing(Student::getGrade)).get());

        //Optional<Student> student = Optional.of(students.stream().filter(x -> x.getName().equals("Matt")).findAny().orElseThrow());

        Map<Long, Student> studentMap = students.stream().collect(Collectors.toMap(x-> x.getId(), x-> x));

        studentMap.forEach((x, y) -> {
            System.out.println(x+ " " + y);
        });

        LocalDateTime dateTime;
        printer.print(String.valueOf(dateTime = LocalDateTime.now()));*/

        List<String> names = List.of("Billy", "Joe", "Joey", "Kistra", "Tess");
        List<String> upperCaseName = names.stream().map(String::toUpperCase).toList();
        List<String> names2 = names;
        List<String> namesWithJ = names.stream().filter(x->x.startsWith("J")).map(String::toLowerCase).toList();
        List<Double> bills = List.of(150.00, 900.00, 50.00, 250.00);
        System.out.println(bills.stream().collect(Collectors.summarizingDouble(Double::doubleValue)).getSum());
        System.out.println(names);
        System.out.println(upperCaseName);
        System.out.println(names2);
        System.out.println(namesWithJ);

        Supplier<Double> returnRandom = () -> Math.random();

        System.out.println(returnRandom.get());

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(LocalDateTime.MAX);
        System.out.println(LocalDateTime.MIN);
        Predicate<String> isEqual = x -> x.equals("Hello");

        System.out.println(isEqual.test("Joe"));

        Supplier<String> helloWorld = () -> "Hello World";
        System.out.println(helloWorld.get());

        Function<Double, Integer> doubleToInt = Double::intValue;

        System.out.println(doubleToInt.apply(55.4646546510651));


        Consumer<String> print = System.out::println;

        print.accept(helloWorld.get());

        Calulator<Integer, Integer> add = (x,y) -> x+y;

        System.out.println(add.printResult(5, 4));
    }
    public static void filter(List<String> e, String c) {
        for (int i = 0; i < e.size(); i++) {
            if(e.get(i).startsWith(c)) {
                System.out.println(e.get(i));
            }
        }
    }
}
