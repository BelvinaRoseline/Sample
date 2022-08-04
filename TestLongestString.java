package Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestLongestString {
LongestString a=new LongestString();
@Test
public void max() {
	String[] vals={"Bel","Rose","Melvin"};
	String val="MELVIN";
	assertEquals(a.maxLength(vals),val);
	assertNotNull(a.maxLength(vals));
	}
}
