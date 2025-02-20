import java.util.*;
import java.util.regex.*;

public class RegexS{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
            String line = in.nextLine();

            // Regex to match well-formed tags
            String regex = "<([^<>]+)>([^<>]*)</\\1>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while (matcher.find()) {
                String content = matcher.group(2).trim(); // Extract text inside matching tags
                if (!content.isEmpty()) {
                    System.out.println(content);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("None");
            }

            testCases--;
        }
        in.close();
	}
}



