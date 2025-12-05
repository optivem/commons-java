package com.optivem.commons.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    
    @Test
    void testAddIntegers() {
        assertEquals(5, MathUtils.add(2, 3));
        assertEquals(0, MathUtils.add(-1, 1));
        assertEquals(-5, MathUtils.add(-2, -3));
    }
    
    @Test
    void testAddLongs() {
        assertEquals(5L, MathUtils.add(2L, 3L));
        assertEquals(0L, MathUtils.add(-1L, 1L));
        assertEquals(-5L, MathUtils.add(-2L, -3L));
    }
    
    @Test
    void testAddDoubles() {
        assertEquals(5.5, MathUtils.add(2.2, 3.3), 0.0001);
        assertEquals(0.0, MathUtils.add(-1.5, 1.5), 0.0001);
        assertEquals(-5.5, MathUtils.add(-2.2, -3.3), 0.0001);
    }
}
