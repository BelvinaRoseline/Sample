package Junit;

public class LongestString {
public String maxLength(String[] val) {
	int max=0;
	String maxString="";
	for(int i=0;i<val.length;i++) {
		if(val[i].length()>max) {
			max=val[i].length();
			maxString=val[i];
		}
	}
	return maxString.toUpperCase();
}
}
