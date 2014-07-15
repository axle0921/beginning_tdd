package beginning.tdd.exercise.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JunitCycleTest.class, BasicJunitTest.class })
public class SuiteClassesTest {

}