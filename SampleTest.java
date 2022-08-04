package Junit;

import org.junit.Test;

public class SampleTest {
Sample samp=new Sample();
@Test
public void addCase() {
	samp.add(4,2);
}
@Test
public void subtractCase() {
	samp.subtract(20,10);
}
@Test
public void multiplyCase() {
	samp.subtract(30,20);
}
@Test
public void divisionCase() {
	samp.division(10,5);
}

}
