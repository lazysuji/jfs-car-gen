package com.sa.car_gen;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Honda civic = new Honda("red", 2010, 10, false);

    @Test
    void testAccelerateSpeed() {
        assertEquals(5, civic.accelerateSpeed());
    }

    @Test
    void testDecelerateSpeed() {
        assertEquals(0, civic.decelerateSpeed());
    }

    @Test
    void testConvertToElectric() {
        assertEquals(true, civic.convertToElectric());
    }
}
