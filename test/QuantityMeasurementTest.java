import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality_SameValue() {
        QuantityMeasurementApp.Feet value1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet value2 = new QuantityMeasurementApp.Feet(1.0);

        assertEquals(value1, value2);
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        QuantityMeasurementApp.Feet value1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet value2 = new QuantityMeasurementApp.Feet(2.0);

        assertNotEquals(value1, value2);
    }

    @Test
    public void testFeetEquality_NullComparison() {
        QuantityMeasurementApp.Feet value = new QuantityMeasurementApp.Feet(1.0);

        assertNotEquals(null, value);
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        QuantityMeasurementApp.Feet value = new QuantityMeasurementApp.Feet(1.0);
        String other = "1.0";

        assertNotEquals(value, other);
    }

    @Test
    public void testFeetEquality_SameReference() {
        QuantityMeasurementApp.Feet value = new QuantityMeasurementApp.Feet(1.0);

        assertEquals(value, value);
    }
}