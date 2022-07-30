package regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("HElloWorld", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("HelloWorld");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}
