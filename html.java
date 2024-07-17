public class html {
}
package org.example;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class DateDataTest {
    DateData dd;

    DateDataTest() {
        dd = new DateData();
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void setDateData() {
        dd.setDateData(null);
        assertNull(dd.getDateData());
    }

    @org.junit.jupiter.api.Test
    void getDateData() {
        dd.setDateData("20200916");
        assertEquals("20200916", dd.getDateData());
    }

    @org.junit.jupiter.api.Test void getToday() {
        Calendar cal = Calendar.getInstance();