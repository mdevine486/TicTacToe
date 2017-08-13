package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/* JUnit Test Suite of all JUnit test */
@RunWith(Suite.class)
@SuiteClasses({ AntiDiagonalTest.class, GameTest.class, GenericTest.class, HorizontalTest.class, MainDiagonalTest.class,
		VerticalTest.class })
public class AllTests {

}
