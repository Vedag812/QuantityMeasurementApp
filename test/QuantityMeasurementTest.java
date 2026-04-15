package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Length;
import com.apps.quantitymeasurement.QuantityMeasurementApp.LengthUnit;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality() {
        assertEquals(
                new Length(1.0, LengthUnit.FEET),
                new Length(1.0, LengthUnit.FEET)
        );
    }

    @Test
    public void testInchesEquality() {
        assertEquals(
                new Length(1.0, LengthUnit.INCHES),
                new Length(1.0, LengthUnit.INCHES)
        );
    }

    @Test
    public void testFeetInchesComparison() {
        assertEquals(
                new Length(1.0, LengthUnit.FEET),
                new Length(12.0, LengthUnit.INCHES)
        );
    }

    @Test
    public void testFeetInequality() {
        assertNotEquals(
                new Length(1.0, LengthUnit.FEET),
                new Length(2.0, LengthUnit.FEET)
        );
    }

    @Test
    public void testInchesInequality() {
        assertNotEquals(
                new Length(1.0, LengthUnit.INCHES),
                new Length(2.0, LengthUnit.INCHES)
        );
    }

    @Test
    public void testNullComparison() {
        assertNotEquals(
                new Length(1.0, LengthUnit.FEET),
                null
        );
    }

    @Test
    public void testSameReference() {
        Length l = new Length(1.0, LengthUnit.FEET);
        assertEquals(l, l);
    }

    @Test
    public void testNullUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Length(1.0, null);
        });
    }
}