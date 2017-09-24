package webdriver;

public class StringOps {
	public static void main(String[] args){
		String str  = "selenium-tutorial";
		String str2 = new String ("selenium");
		String str3 = "selenium";
		if(str.equalsIgnoreCase(str2))
			System.out.println("both strings are equal");
		else
			System.out.println("String are not equal.");
		//equal
		//equalsIgnoreCase
		//toUpperCase
		/*
		str = str.concat(str2);
		str = str.toUpperCase();
		System.out.println("Uppercase string "+str);
		
		System.out.println("Lowercase string "+str.toLowerCase());
		
		String[] stringArray = str.split("-");
		System.out.println("string array : "+ stringArray[0]+"#"+stringArray[1]);
		System.out.println("Length of the string "+str2.length());
		*/
		
		
		if(str.contains(str3))
			System.out.println("contains");
		else
			System.out.println("not contains");
	}
}
