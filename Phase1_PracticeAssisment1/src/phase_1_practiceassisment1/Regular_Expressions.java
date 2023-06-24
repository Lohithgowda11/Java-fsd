package phase_1_practiceassisment1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("lohith", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("ajitk");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }

	}
}


