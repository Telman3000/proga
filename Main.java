/*
public class Main {
    public static void main(String[] args) {
        // У класса System вызываем переменную out,
        // и на нее вызываем println которая содержит ("...")
        System.out.println("Hello \n \t \" \\ World");
    }
}


byte -128...127 - 8 bit
short -32,768 ... 32,767 - 16 bit
int -2,147,483,648 ... 2,147,483,657 - 32 bita
long -9,223,372,036,854,775,808 ... 9,223,372,036,854,775,807 - 64 bita
float 1.4e-45f ... 3.4e+38f - 32 bita
double 4.9e-324 ... 1.7e+308 - 64 bita
boolean true/false - 1 bit
char 0 ... 65,535 - 16 bit
*/

/*
public class Main {
    public static void main(String[] args) {
        // У класса System вызываем переменную out,
        // и на нее вызываем println которая содержит ("...")
        System.out.println("Переменные и типы данных");
        byte a= 127;
        short b = 1244;
        int c = 5346;
        long d = 123456;

        float e = 32.34f;
        double f = 342.654f;

        char g = 'S';
        String everything = "A fed 234 &**";
        System.out.println(everything);

        boolean isCar = true;
        boolean isNotCar = false;
    }
} */




//package com.itproger;

import java.util.*;
/*S
public class Main {

    public static void main(String[] args) {

        // тип данных Scanner -> название = выделение памяти
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя:");
        String username = scan.nextLine();
        System.out.println("Привет," + username); */

        /*
        int num1 = scan.nextInt();
        byte num2 = scan.nextByte();
        boolean num3 = scan.nextBoolean();
        float num4 = scan.nextFloat();
        */

        /*
        short num1 = 50, num2 = 11;
        float res = num1 + num2;
        res += 10;
        res *= 1.2f;
        res++;
        System.out.println("Результат" + res);
         */
/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float num1 = scan.nextFloat();

        System.out.println("Введите первое число: ");
        float num2 = scan.nextFloat();

        float res = num1 % num2;
        float res2 = num1 + num2;
        float res3 = num1 - num2;
        float res4 = num1 / num2;
        float res5 = num1 * num2;

        System.out.println("Результат" );
        System.out.println(res + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n" + res5 + "\n");
    }
}
*/



//public class Main {
//    public static void main(String[] args) {
//    // Условные операторы
//        int a = 15, b = 10;
//        char symbol = 'A', symbol2 = 'A';
//        if(symbol == symbol2) {
//            System.out.println(symbol + " is equal to " + symbol2);
//        }
//        if(a > b || a < b && symbol == symbol2) {
//            System.out.println("Верно");
//
//        boolean IsHasCar = false;
//        if(IsHasCar) {
//            System.out.println("Верно");
//        } else if(a == b) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Верноs");
//        }
//
//        }
//    }
//}

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Введите роль:");
//        String role = scn.nextLine();
//        if(role.equals("admin"))
//            System.out.println("Все пользователи:");
//        else {
//            System.out.println("Как тебя зовут?");
//            String username = scn.nextLine();
//        }
//    }
//}


import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
            default: // эквивалентно --> else
                System.out.println("Default");
        }
    }
}
*/
/*
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int num1 = scan.nextInt();

        System.out.println("Введите второе целое число:");
        int num2 = scan.nextInt();

        // Очистка буфера
        scan.nextLine();

        System.out.println("Введите операцию (+, -, *, /):");
        String action = scan.nextLine();

        int res; // Переменная для результата

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (num2 != 0) {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                } else {
                    System.out.print("Ошибка: деление на ноль");
                }
                break;
            default:
                System.out.print("Ошибка: неверная операция");
        }

        scan.close(); // Закрываем сканер
    }
}*/



// Циклы

/*
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }*/

        /*
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
        }*/

        /*
        int i = 100;
        do{
            System.out.println(i);
            i *= 100;
        } while(i < 10);*/
/*
        for (int i = 5; i <= 20; i+= 2) {
            if(i % 3 == 0)
                continue;
            if (i >= 17)
                break;

            System.out.println(i);
        }

    }
}*/

/*
// Массивы

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[52];
        nums[0] = 50;
        nums[1] = 51;
        nums[2] = 52;
        nums[3] = 53;
        nums[4] = 54;
        nums[5] = 2;

        int res = nums[0] + nums[5];

        System.out.println(nums[0]);
        System.out.println(res);


        float[] nums2 = new float[] {5.0f, 4.34f, 89.234f};
        System.out.println(nums2[1]);

        for(int i = 0; i < nums2.length; i++){
            System.out.println(nums2[i]);
        }*/

        /*
        int[] arr = new int[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
        System.out.print("Введите число:");
        int value = scan.nextInt();
        arr[i] = value;
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        System.out.println("Минимум:" + min);
        }

         */

        /*
        // Многомерный массив
        char[][] symbols = new char[5][2];
        symbols[0][0] = 'A';
        System.out.println(symbols[0][0]);

        byte[][] nums = new byte[][]
        {
            {1,2},
            {3,4},
            {5,6},
            {7,8},
            {9,0}
        };
    }
}
*/


/*
// Коллекции

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(0, 40);
        numbers.add(1, 30);

        //System.out.println(numbers.size()); // количество елементов
        //System.out.println(numbers. get(2)); // поиск по индексу
        //numbers.remove(1); // удаляет элемент по индексу
        //numbers.clear(); // удаляет все элементы коллекции

        for(Integer element : numbers) {
            System.out.println(element);
        } */


        /*
        // Почти такой же как ArrayList только LinkedList быстрее справляется
        // с заменой индексов как на примере выше
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(1.2f);
        numbers.add(3.542f);
        numbers.add(5.678f);

        for (Float el : numbers) {
            System.out.println(el);
        }

    }
}
*/



// Функции, т.е. мотоды

public class Main {
    public static void main(String[] args) {
/*
//        info("Hello");
//        String java = "Java";
//        info(java);
//        info("");

        short num = 7;
        summa((short) 5, num);
        int result = summa((short) 5, num);

        short num2 = 8;
        summa((short) 4, num2);
        int result2 = summa((short) 4, num2);
        info(String.valueOf(result)); // переобразуем в String
    }

    // Не пинимает параметры
//    public static void info() {
//        System.out.println("Hello");
//    }

    // void - ничего не возвращает
    public static int summa(short a, short b) {
        int res = a + b;
        //System.out.println("Результат: " + res);
        String result = "Результат: " + res;
        info(result);
        return res;
    }

    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");

*/
        // Функция с массивами
        byte[] num1 = new byte[] {2,3,4};

        int sum1 = summaArray(num1);
        System.out.println("Сумма 1: " + sum1);

        byte[] num2 = new byte[] {2,3,4,34,43,22,1};

        int sum2 = summaArray(num2);
        System.out.println("Сумма 2: " + sum2);
    }

    public static int summaArray(byte[] arr) {
        int summa = 0;
        for (int i = 0; i < arr.length; i++)
            summa += arr[i];
        return summa;
    }
}























