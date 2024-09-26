import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Примітивні типи даних:");

        System.out.println("Типи даних Java:");
        System.out.println("Тип\tРозмір\tМін. значення\tМакс. значення");
        System.out.println("byte\t1\t\t" + Byte.MIN_VALUE + "\t\t\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t2\t\t" + Short.MIN_VALUE + "\t\t\t\t" + Short.MAX_VALUE);
        System.out.println("int\t\t4\t\t" + Integer.MIN_VALUE + "\t\t\t" + Integer.MAX_VALUE);
        System.out.println("long\t8\t\t" + Long.MIN_VALUE + " " + Long.MAX_VALUE);
        System.out.println("char\t2");
        System.out.println("boolean\t1\t\tFalse\t\t\t\tTrue");
        System.out.println("float\t4\t\t" + Float.MIN_VALUE + "\t\t\t\t" + Float.MAX_VALUE);
        System.out.println("double\t8\t\t" + Double.MIN_VALUE + "\t\t\t" + Double.MAX_VALUE);


        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введіть ціле число (int):");
            String intInput = scanner.nextLine();
            try {
                int intValue = Integer.parseInt(intInput.trim());
                System.out.println("Перетворене значення: " + intValue);
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введене значення не є цілим числом.");
                System.out.println("Код помилки ФЄЙХОА");
            }

            System.out.println("Введіть дробове число (double):");
            String doubleInput = scanner.nextLine();
            try {
                double doubleValue = Double.parseDouble(doubleInput.trim());
                System.out.println("Перетворене значення: " + doubleValue);
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введене значення не є дробовим числом.");
                System.out.println("Код помилки КОКОС");
            }

            System.out.println("Введіть коротке ціле число (short):");
            String shortInput = scanner.nextLine();
            try {
                short shortValue = Short.parseShort(shortInput.trim());
                System.out.println("Перетворене значення: " + shortValue);
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введене значення не є коротким цілим числом.");
                System.out.println("Код помилки БАНАН");
            }

            System.out.println("Введіть велике ціле число (long):");
            String longInput = scanner.nextLine();
            try {
                long longValue = Long.parseLong(longInput.trim());
                System.out.println("Перетворене значення: " + longValue);
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введене значення не є великим цілим числом.");
                System.out.println("Код помилки ОГІРОК");
            }

            System.out.println("Введіть число з плаваючою точкою (float):");
            String floatInput = scanner.nextLine();
            try {
                float floatValue = Float.parseFloat(floatInput.trim());
                System.out.println("Перетворене значення: " + floatValue);
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введене значення не є числом з плаваючою точкою.");
                System.out.println("Код помилки ПОМІДОР");
            }

            System.out.println("Введіть символ (char):");
            String charInput = scanner.nextLine();
            try {
                char charValue = charInput.trim().charAt(0);
                System.out.println("Перетворене значення: " + charValue);
            } catch (Exception e) {
                System.out.println("Помилка: введене значення не є символом.");
                System.out.println("Код помилки КУКУРУДЗА");
            }

            System.out.println("Введіть логічне значення (true/false):");
            String booleanInput = scanner.nextLine();
            try {
                boolean booleanValue = Boolean.parseBoolean(booleanInput.trim());
                System.out.println("Перетворене значення: " + booleanValue);
            } catch (Exception e) {
                System.out.println("Помилка: введене значення не є логічним значенням.");
                System.out.println("Код помилки АНАНАС");
            }

        } catch (Exception e) {
            System.out.println("Сталася непередбачена помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
