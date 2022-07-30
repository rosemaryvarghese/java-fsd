package strings;

public class stringsExample {

	public static void main(String[] args) {
		//methods of strings
		System.out.println("STRINGS");
		
		String string=new String("Java Program");
		System.out.println(string.length());

		System.out.println("Substring");	
		String substr=new String("FSD");
		System.out.println(substr.substring(1));

		System.out.println("String Comparison");
		
		String str1="Welcome";
		String str2="Melcome";
		System.out.println(str1.compareTo(str2));
		System.out.println("Empty Check");
		
		String str3="";
		System.out.println(str3.isEmpty());
		
		System.out.println("Replace");
		String str4="MElcome";
				String replace=str4.replace('M', 'W');
				System.out.println(replace);

				System.out.println("Lowercase");
		String str5="ABCDEF";
		System.out.println(str5.toLowerCase());
		
		

		System.out.println("Equality");
		String str6="JAVA Program";
		String str7="java pRogrAM";
		System.out.println(str6.equals(str7));
		System.out.println("---------STRING BUFFER---------------");
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("This is Java Program");
		s.append("Full stack development");
		System.out.println(s);

		System.out.println("Insert");
		s.insert(2, 'h');
		System.out.println(s);

		System.out.println("Replace");
		StringBuffer s2=new StringBuffer("Welcome");
		s2.replace(0, 2, "weL");
		System.out.println(s2);

		System.out.println("Delete");
		s2.delete(1, 4);
		System.out.println(s2);
		
		
		System.out.println("---------STRING BUILDER---------------");
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder s3=new StringBuilder("Java");
		s3.append("Programming");
		System.out.println(s3);

		System.out.println(s3.delete(0, 3));

		System.out.println(s3.insert(3, "Java"));

		System.out.println(s3.reverse());
				
		System.out.println("---------CONVERSION---------------");
		System.out.println("\n");
		
		
		String str = "WELCOME"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sb = new StringBuffer(str); 
        sb.reverse(); 
        System.out.println("Conversion of String to StringBuffer");
        System.out.println(sb); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("welcome"); 
        System.out.println("Conversion of String to StringBuilder");
        System.out.println(sbl);              		
	}
}
