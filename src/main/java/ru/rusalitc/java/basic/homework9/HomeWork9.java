package ru.rusalitc.java.basic.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class HomeWork9 {
    public static void main(String[] args) {
        System.out.println("Работа метода №1:");
        miniMax(-20, 20);// Вызов метода №1

        ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Имеется список целых чисел:");
        System.out.println(listInt);

        System.out.println("Работа метода №2:");
        System.out.println("Сумма элементов списка больше 5 :" + sumMore5(listInt)); // Вызов метода №2
        int a = 5;
        System.out.println("Работа метода №3: замена значений элементов на число:" + a);
        override(a, listInt);// Вызов метода №3
        System.out.println("Работа метода №4: добавление к каждому элементу списка числа: " + a);
        plusInt(a, listInt);// Вызов метода №4

        ArrayList<Emploee> listEmp = new ArrayList<>();
        listEmp.add(new Emploee("Василий", 45));
        listEmp.add(new Emploee("Сергей", 36));
        listEmp.add(new Emploee("Николай", 37));
        listEmp.add(new Emploee("Владислав", 22));
        listEmp.add(new Emploee("Лев", 30));
        listEmp.add(new Emploee("Антон", 30));
        System.out.println("Перечень сотрудников:");
        for (int i = 0; i < listEmp.size(); i++) {
            System.out.println(listEmp.get(i).name + " " + listEmp.get(i).age);
        }
        System.out.println("Работа метода №5: получение и вывовд списка только из имен сотрудников");
        System.out.println(listEmpName(listEmp)); // Вызов метода №5
        int minAge = 25;
        System.out.println("Работа метода №6:вывод списка имен сотрудников старше: " + minAge);
        System.out.println(listEmpAge(listEmp, minAge)); // Вызов метода №6
        System.out.println("Работа метода №7: проверка среднего возраста сотрудников");
        if (listEmpMiddleAge(listEmp, minAge)) { // Получение true от метода №7
            System.out.println("Средний возраст сотрудников выше минимального: " + minAge);
        } else System.out.println("Средний возраст сотрудников не превышает минимальный: " + minAge);
        System.out.println("Работа метода №8: поиск самого молодого сотрудника");
        empAgeMin(listEmp); // Вызов метода №8

    }

    public static void empAgeMin(ArrayList<Emploee> listEmp) {// Метод №8
        int index = 0;
        for (int i = 1; i < listEmp.size(); i++) {
            if (listEmp.get(i).age < listEmp.get(i - 1).age) {
                index = i;
            }

        }
        System.out.println("Самый молодой сотрудник: " + listEmp.get(index).name);
    }

    public static boolean listEmpMiddleAge(ArrayList<Emploee> listEmp, int age) {// Метод №7
        int sumAge = 0;
        for (int i = 0; i < listEmp.size(); i++) {
            sumAge += listEmp.get(i).age;
        }
        if (sumAge / listEmp.size() > age) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> listEmpAge(ArrayList<Emploee> listEmp, int age) {// Метод №6
        ArrayList<String> listEmpAge = new ArrayList<>();
        for (int i = 0; i < listEmp.size(); i++) {
            if (listEmp.get(i).age >= age) {
                listEmpAge.add(listEmp.get(i).name);
            }
        }
        return listEmpAge;
    }

    public static ArrayList<String> listEmpName(ArrayList<Emploee> listEmp) {// Метод №5
        ArrayList<String> listEmpName = new ArrayList<>();
        for (int i = 0; i < listEmp.size(); i++) {
            listEmpName.add(listEmp.get(i).name);
        }
        return listEmpName;
    }

    public static void plusInt(int a, ArrayList<Integer> listInt2) {// Метод №4
        for (int i = 0; i < listInt2.size(); i++) {

            listInt2.set(i, listInt2.get(i) + a);
        }
        System.out.println(listInt2);
    }

    public static void override(int a, ArrayList<Integer> listInt2) {// Метод №3
        for (Integer i : listInt2) {
            listInt2.set(i, a);
        }
        System.out.println(listInt2);
    }

    public static Integer sumMore5(ArrayList<Integer> listInt2) {// Метод №2
        int sum = 0;
        for (Integer i : listInt2) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }

    public static void miniMax(int min, int max) { // Метод №1
        int length = max - min + 1;
        ArrayList<Integer> stairs = new ArrayList<>(length);
        stairs.add(min);
        for (int i = 1; i < length; i++) {
            stairs.add(min + i);
        }
        System.out.println(stairs);
    }

}

