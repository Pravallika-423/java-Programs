package practiceprgms;

public class RemoveDuplicates {
public static String remove(String str) {
	char[] ch=charArray(str);
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;)
	}
	return res;
}
public static char[] charArray(String str) {
	char[] ch=new char[str.length()];
	for(int i=0;i<str.length();i++) {
		ch[i]=str.charAt(i);
	}
	return ch;
}
}
