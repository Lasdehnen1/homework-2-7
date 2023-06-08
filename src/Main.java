import java.util.*;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(11, 20, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задание 2");
        List<Integer> nums = new ArrayList<>(List.of(10, 6, 8, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        int firstNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if( num % 2 == 0 && firstNum != num) {
                System.out.print(num + " ");
                firstNum = num;
            }
        }
        /*
        Set<Integer> set = new HashSet<>(nums);
        for (Integer s : set) {
            if (s % 2 == 0) {
                System.out.print(s + " ");
            }
        }

         */
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание 3");
        List<String> wordList = new ArrayList<>(List.of("eeny", "meeny", "miny", "moe", "eeny", "meeny", "miny", "moe"));
        Set<String> set = new HashSet<>(wordList);
        System.out.println(set);

    }
    public static void task4() {
        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> set = new HashSet<>(strings);
        System.out.println(strings.size() - set.size());

    }

}