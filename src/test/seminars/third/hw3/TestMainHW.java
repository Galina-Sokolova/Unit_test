package seminars.third.hw3;
import Seminar.third.hw.MainHW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMainHW {
    @Test
    public void testOddNumber(){
        assertTrue(MainHW.isNumberEven(2));
    }

    @Test
    public void testEvenNumber() {
        assertFalse(MainHW.isNumberEven(1));
    }

    @Test
    public void testLowNumberInInterval(){
        assertFalse(MainHW.isNumInInterval(-1));
    }
    @Test
    public void testNormalNumberInInterval(){
        assertTrue(MainHW.isNumInInterval(77));
    }
    @Test
    public void testBigNumberInInterval(){
        assertFalse(MainHW.isNumInInterval(101));
    }
}
