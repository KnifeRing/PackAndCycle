package ru.netology.jQA;


public class IncomeExpenseService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { //если денег на счету больше, чем порог
                count++; //отдыхаем
                money -= expenses;
                money /= 3;//необходимые траты
            } else {
                money += income;// если нет, работаем
                money -= expenses;
            }
        }
        return count;
    }
}


