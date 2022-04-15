package com.SkyPro;

public class Main {

    public static void main(String[] args) {
        /* Task #1
        Написать программу, в которой можно работать с Ф.И.О. сотрудников.
        Выведите в консоль фразу: “ФИО сотрудника — ….” В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
         */
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Employee's full name: " + fullName);

        /* Task #2
        Напишите программу, которая изменит написание Ф.И.О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        В качестве строки с исходными данными используйте строку fullName.
        Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — ”
        */

        fullName = lastName.toUpperCase() + " " + firstName.toUpperCase() + " " + middleName.toUpperCase();
        System.out.println("Employee's full name data for filling out the report - " + fullName);

        /* Task #3
        Система, в которой мы работаем, не принимает символ “ё”.
        Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        */
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replaceAll("ё","е");
        System.out.println("Employee's full name data - " + fullName2);
        // IDEA не понимает кириллицу, в replit код работает: Иванов Семен Семенович

    }
}
