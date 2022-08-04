package Junit;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertSample {

String name1="Belvina";
String name2="Belvina";
String name3="Roseline";
String name4=null;
boolean name5=true;
boolean name6=false;
int[] name7= {1,2,6};
int[] name8= {1,2,6};
@Test
public void equals() {
	assertEquals(name1, name2);
}
@Test
public void checkNotEquals() {
	assertNotEquals(name1, name3);
}
@Test
public void checkNull() {
	assertNull(name4);
}
@Test
public void checkNotNull() {
	assertNotNull(name1);
}
@Test
public void same() {
	assertSame(name1, name2);
}
@Test
public void notSame() {
	assertNotSame(name2, name3);
}
@Test
public void checkTrue() {
	assertTrue(name5);
}
@Test
public void checkFalse() {
	assertFalse(name6);
}
@Test
public void checkArrayEquals() {
	assertArrayEquals(name7, name8);
}


}





