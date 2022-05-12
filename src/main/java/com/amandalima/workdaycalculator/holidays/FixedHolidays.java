package com.amandalima.workdaycalculator.holidays;

import java.time.LocalDate;
import java.util.stream.Stream;

public enum FixedHolidays {

    ANO_NOVO(1, 1),
    TIRADENTES(21, 4),
    DIA_DO_TRABALHO(1, 5),
    INDEPENDENCIA(7, 9),
    PADROEIRA(12, 10),
    FINADOS(2, 11),
    PROC_REPUBLICA(15, 11),
    NATAL(25, 12);

    private int day;

    private int month;

    FixedHolidays(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public static boolean isHoliday(LocalDate date) {
        return Stream.of(FixedHolidays.values())
                .anyMatch(holiday -> holiday.getDay() == date.getDayOfMonth() && holiday.getMonth() == date.getMonthValue());
    }
}