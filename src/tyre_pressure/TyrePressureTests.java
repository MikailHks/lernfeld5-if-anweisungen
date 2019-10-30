package tyre_pressure;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Es soll eine Klasse zur Berechnung des Reifendrucks eines Wagens erstellt werden. Dabei gelten folgende Anforderungen:
- Die beiden Vorderreifen müssen innerhalb einer Toleranz von 3 PSI den gleichen Druck haben
- Die beiden Hinterreifen müssen innerhalb einer Toleranz von 3 PSI den gleichen Druck haben
- Jeder Reifen muss einen Druck im Bereich von 35 bis 45 PSI haben
 */

public class TyrePressureTests {

    @Test
    public void test_calc() {
        TyrePressureCalculator calculator=new TyrePressureCalculator();
        assertEquals(false, calculator.calc(34, 37, 46, 47));
        assertEquals(false, calculator.calc(38, 43, 45, 45));
        assertEquals(false, calculator.calc(34, 37, 46, 42));
        assertEquals(true, calculator.calc(38, 41, 39, 39));
        assertEquals(true, calculator.calc(41, 42, 37, 35));
        assertEquals(false, calculator.calc(38, 32, 46, 47));
        assertEquals(false, calculator.calc(35, 39, 37, 42));
        assertEquals(true, calculator.calc(45, 44, 35, 36));
    }

    @Test
    public void test_checkTyre() {
        TyrePressureCalculator calculator=new TyrePressureCalculator();
        assertEquals(false, calculator.checkTyre(-12));
        assertEquals(false, calculator.checkTyre(0));
        assertEquals(false, calculator.checkTyre(34));
        assertEquals(true, calculator.checkTyre(35));
        assertEquals(true, calculator.checkTyre(45));
        assertEquals(true, calculator.checkTyre(40));
        assertEquals(false, calculator.checkTyre(46));
    }
}