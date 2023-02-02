//Разработать программу, имитирующую поведение коллекции HashSet. 
//В программе содать метод add добавляющий элемент, и метод позволяющий выводить 
//эллементы коллекции в консоль. Формат данных Integer. 

import java.util.ArrayList;
import java.util.Scanner;

public class homework {
    public static void main(String[] atgs) {
        information = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("\nВведите любой символ отличный от числа, чтобы остановиться!\n");
        while (scan.hasNextInt()) {
            int component = scan.nextInt();
            add(component);
        }
        System.out.print("\nРезультат: ");
        printElements();
        System.out.println();

        scan.close();
    }
      private static ArrayList<Integer> information;

        public static void add(Integer component) {
            if (!information.contains(component)) {
                information.add(component);
            }
        }

        public static void printElements() {
            for (Integer component : information) {
                System.out.print(component + " ");
            }
        }


}