package com.amandalima.workdaycalculator.holidays;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VariableHolidaysTest {

    @Test
    void shouldCheckIfDateIsPascoa() {
        assertEquals(VariableHolidays.getPascoaForYear(2025), LocalDate.of(2025, 4, 20));
        assertNotEquals(VariableHolidays.getPascoaForYear(2021), LocalDate.of(2021, 1, 3));
    }

    @Test
    void shouldCheckIfDateIsCarnavalEve() {
        assertEquals(VariableHolidays.getCarnavalEveForYear(2023), LocalDate.of(2023, 2, 20));
        assertNotEquals(VariableHolidays.getCarnavalEveForYear(2021), LocalDate.of(2023, 2, 20));
    }

    @Test
    void shouldCheckIfDateIsCarnaval() {
        assertEquals(VariableHolidays.getCarnavalForYear(2023), LocalDate.of(2023, 2, 21));
        assertNotEquals(VariableHolidays.getCarnavalForYear(2023), LocalDate.of(2023, 2, 20));
    }

    @Test
    void shouldCheckIfDateIsCorpusChristi() {
        assertEquals(VariableHolidays.getCorpusChristiForYear(2028), LocalDate.of(2028, 6, 15));
        assertNotEquals(VariableHolidays.getCorpusChristiForYear(2028), LocalDate.of(2028, 7, 15));
    }

    @Test
    void shouldCheckIfDateIsSextaFeiraSanta() {
        assertEquals(VariableHolidays.getSextaFeiraSantaForYear(1985), LocalDate.of(1985, 4,5));
        assertNotEquals(VariableHolidays.getSextaFeiraSantaForYear(2002), LocalDate.of(2002, 4,5));
    }

    @Test
    void shouldCheckIfDateIsHoliday() {
        assertTrue(VariableHolidays.isHoliday(LocalDate.of(2022, 4, 17)));
        assertFalse(VariableHolidays.isHoliday(LocalDate.of(2022, 5, 17)));
    }

}