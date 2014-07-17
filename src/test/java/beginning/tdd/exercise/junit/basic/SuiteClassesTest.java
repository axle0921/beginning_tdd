package beginning.tdd.exercise.junit.basic;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JunitCycleTest.class, CalculationTest.class })
public class SuiteClassesTest {

}