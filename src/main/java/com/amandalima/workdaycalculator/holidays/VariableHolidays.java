package com.amandalima.workdaycalculator.holidays;

import java.time.LocalDate;

public class VariableHolidays {

    public static LocalDate getPascoaForYear(int year) {

        // Excessões da regra de cálculo
        if(year == 2076) {
            return LocalDate.of(year, 4, 19);
        }
        if(year == 2049) {
            return LocalDate.of(year, 4, 18);
        }

        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int n = h + l - 7 * m + 114;
        int month = n / 31;
        int day = (n % 31) + 1;

        return LocalDate.of(year, month, day);
    }

    public static LocalDate getCarnavalForYear(int year) {
        return getPascoaForYear(year).minusDays(47);
    }

    public static LocalDate getCarnavalEveForYear(int year) {
        return getCarnavalForYear(year).minusDays(1);
    }

    public static LocalDate getCorpusChristiForYear(int year){
        return getPascoaForYear(year).plusDays(60);
    }

    public static LocalDate getSextaFeiraSantaForYear(int year) {
        return getPascoaForYear(year).minusDays(2);
    }

    public static boolean isHoliday(LocalDate date) {
        int year = date.getYear();
        return getPascoaForYear(year).isEqual(date) ||
                getCarnavalForYear(year).isEqual(date) ||
                getCarnavalEveForYear(year).isEqual(date) ||
                getCorpusChristiForYear(year).isEqual(date) ||
                getSextaFeiraSantaForYear(year).isEqual(date);

    }
}