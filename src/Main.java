import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String scanner;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер операции или end для завершения:");
            System.out.println("\t 1. Добавить предмет покупки");
            System.out.println("\t 2. Показать список покупок");
            System.out.println("\t 3. Удалить предмет покупки");
            scanner = sc.nextLine();
            if (scanner.equalsIgnoreCase("end")) {
                break;
            } else {
                switch (scanner) {
                    case ("1"): {
                        System.out.println("Введите предмет покупки:");
                        scanner = sc.nextLine();
                        list.add(scanner);
                        System.out.println("Итого в списке покупок: " + list.size());
                        break;
                    }
                    case ("2"): {
                        show(list);
                        break;
                    }
                    case ("3"): {
                        System.out.println("Какой пункт покупок хотите удалить? Введите номер или название");
                        show(list);
                        scanner = sc.nextLine();
                        try {
                            list.remove(Integer.parseInt(scanner) - 1);
                        } catch (NumberFormatException e) {
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).equalsIgnoreCase(scanner)) {
                                    list.remove(i);
                                    System.out.println("Пункт покупки удален!");
                                } else {
                                    System.out.println("Такой элемент не найден!");
                                }
                            }

                        }
                        show(list);
                        break;
                    }

                }
            }
        }
    }

    public static void show(ArrayList<String> list) {
        for (String i : list) {
            System.out.println(list.indexOf(i) + 1 + ". " + i);
        }
    }
}
