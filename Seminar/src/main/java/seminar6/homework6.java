package seminar6;

import java.util.*;
import java.util.regex.Pattern;

    /**
     * Подумать над структурой класса Ноутбук для магазина техники
     * - выделить поля и методы. Реализовать в java.
     * Создать множество ноутбуков (ArrayList).
     * Отфильтровать ноутбуки их первоначального множества
     * и вывести проходящие по условиям.
     * Например, спросить у пользователя минимальный размер оперативной памяти
     * или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию**/
public class homework6 {
    public static void main(String[] args) {
        int laptopGenerateLength = 10; // Сколько записей нужно сгенерировать
        List<Laptop> laptopList = laptopGenerator(laptopGenerateLength);
//        showLaptops(laptopList);

        showMenu();

        while (true){
            String userImput = getStringFromUser().trim();

            if (userImput.isBlank()) {
                System.out.println("Пустая строка, введите команду.");
                continue;
            } else if (userImput.equalsIgnoreCase("print")){
                showLaptops(laptopList);
            } else if (userImput.startsWith("minram")){
                commandHandlerMinram(laptopList, userImput);
            } else if (userImput.startsWith("color")){
                commandHandlerColor(laptopList, userImput);
            }
        }
    }

    private static void commandHandlerColor(List<Laptop> laptopList, String userImput) {
        userImput = userImput.replace("color", "").trim();
        if(!userImput.isBlank()) {
            showLaptops(laptopList, "color", userImput);
        } else {
            System.out.printf("Параметр %s не распознан.%n", userImput);
        }
    }

    private static void commandHandlerMinram(List<Laptop> laptopList, String userImput) {
        userImput = userImput.replace("minram", "").trim();
        if(!userImput.isBlank() && Pattern.matches("\\d+", userImput)) {
            showLaptops(laptopList, "minram", Integer.parseInt(userImput));
        } else {
            System.out.printf("Параметр %s не распознан.%n", userImput);
        }
    }


    private static void showMenu() {
        System.out.println("print - вывести весь список ноутбуков");
        System.out.println("minram X - вывести список ноутбуков с памятью не меньше X");
        System.out.println("color X - вывести список ноутбуков c цветом X");
    }


    private static void showLaptops(List<Laptop> laptopList) {
        for (var lptp: laptopList) {
            lptp.show();
        }
    }

    private static void showLaptops(List<Laptop> laptopList, String compareParam, int value) {
        int count = 0;
        for (var lptp: laptopList) {
            switch (compareParam) {
                case ("minram"):
                    if (lptp.getRamValue() > value){
                        lptp.show();
                        count++;
                    }
                    break;
            }

        }
        System.out.printf("Результат поиска %s %d - %d%n ", compareParam, value, count);
    }

    private static void showLaptops(List<Laptop> laptopList, String compareParam, String value) {
        System.out.println(value);
        int count = 0;
        for (var lptp: laptopList) {
            switch (compareParam) {
                case ("color"):
                    if (lptp.getColor().equalsIgnoreCase(value)){
                        lptp.show();
                        count++;
                    }
                    break;
            }
        }
        System.out.printf("Результат поиска %s %s - %d%n ", compareParam, value, count);
    }

    private static List<Laptop> laptopGenerator(int laptopCount) {
        List<Laptop> laptopList = new ArrayList<>();

        for (int i = 0; i < laptopCount; i++) {
            laptopList.add(
                    new Laptop(
                            getRandomVendor(),
                            getRandomModel(),
                            getRandomPrice(),
                            getRandomColor(),
                            getRandomMatrix(),
                            getRandomDisplayDiagonal(),
                            getRandomProcessorVendor(),
                            getRandomRamType(),
                            getRandomRamValue(),
                            getRandomGraphicCard()
                            )
            );
        }
        return laptopList;
    }

    private static double getRandomPrice() {
        Random random = new Random();
        return random.nextInt(20000, 300000);
    }

    private static String getRandomProcessorVendor() {
        Random random = new Random();
        String[] stringArray = new String[]{
                "INTEL",
                "AMD",
        };
        return stringArray[random.nextInt(stringArray.length)];
    }

    private static String getRandomRamType() {
        Random random = new Random();
        String[] stringArray = new String[]{
                "DDR3",
                "DDR4",
                "DDR5",
                "DDR6",
        };
        return stringArray[random.nextInt(stringArray.length)];
    }

    private static int getRandomRamValue() {
        Random random = new Random();
        int[] stringInt = new int[]{
                1024,
                2048,
                4096,
                8192,
        };
        return stringInt[random.nextInt(stringInt.length)];
    }

    private static String getRandomGraphicCard() {
        Random random = new Random();
        String[] stringArray = new String[]{
                "RTX 1080",
                "MX 2050",
                "FX 3080",
                "GRFX 3000",
                "XSW 200",
                "GEFORCE 2",
                "FAMD 22",
                "ASCGY 1000",
                "ULTRA HD 100500",
        };
        return stringArray[random.nextInt(stringArray.length)];
    }

    private static double getRandomDisplayDiagonal() {
        Random random = new Random();
        double[] doubleArray = new double[]{
                16.5,
                17,
                19,
                19.5,
                24,
                27,
                34,
        };
        return doubleArray[random.nextInt(doubleArray.length)];
    }

    private static String getRandomMatrix() {
        Random random = new Random();
        String[] stringArray = new String[]{
                "IPS",
                "OLED",
                "TN",
        };
        return stringArray[random.nextInt(stringArray.length)];
    }

    private static String getRandomModel() {
        Random random = new Random();
        String[] stringArray = new String[]{
                "NB77",
                "AC2",
                "NBVCXZ",
                "HGFDSA",
                "YTREWQ",
                "XVBBNBV",
                "QWERTY",
                "ASDFG",
                "ZXCVB",
        };
        return stringArray[random.nextInt(stringArray.length)];
    }

    private static String getRandomColor() {
        Random random = new Random();
        String[] stringArray = new String[]{
                "Red",
                "Black",
                "Green",
                "Blue",
                "Yellow",
                "Orange",
                "Gray",
        };
        return stringArray[random.nextInt(stringArray.length)];
    }

    private static String getRandomVendor() {
        Random random = new Random();
        String[] stringArray = new String[]{
                "Samsung",
                "Acer",
                "Xiaomi",
                "Lenovo",
                "Sony",
                "Asus",
                "Huawei",
                "MSI",
                "Apple",
        };
        return stringArray[random.nextInt(stringArray.length)];
    }

    private static String getStringFromUser() {
        System.out.println("Введите команду");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
