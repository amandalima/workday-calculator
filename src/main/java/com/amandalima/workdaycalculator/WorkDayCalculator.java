package com.amandalima.workdaycalculator;

import com.amandalima.workdaycalculator.holidays.FixedHolidays;
import com.amandalima.workdaycalculator.holidays.VariableHolidays;

import java.time.LocalDate;

public class WorkDayCalculator {

    public boolean isHoliday(LocalDate date) {
        return FixedHolidays.isHoliday(date) || VariableHolidays.isHoliday(date);
    }

}
