package emailValidation;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class emailValidation
{
	public static boolean isValid(String mail)
	{
		String er = "^[a-zA-Z0-9_+&*-]+(?:\\."+
							"[a-zA-Z0-9_+&*-]+)*@" +
							"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
							"A-Z]{2,7}$";
							
		Pattern pattern = Pattern.compile(er);
		if (mail == null)
			return false;
		return pattern.matcher(mail).matches();
	}

	public static void main(String[] args)
	{
		ArrayList<String> addr = new ArrayList<>();
			
		addr.add("adjabdih@gmail.com");
		addr.add("jasb.adas.org");
			
		for(String i : addr){
			if (isValid(i))
				System.out.println(i + " - Is a valid email address");
			else
				System.out.println(i + " - Not a valid email address");
		}
	}
}
