import java.util.*;
import java.util.regex.*;

public class RegexS{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            String regex = "<([^>]+)>(.*?)</\\1>"; // Capture valid HTML-like tags
        Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2)); // Extract content between matching tags
                found = true;
            }

            if (!found) {
                System.out.println("None"); // Print "None" if no valid content found
            }
			
			testCases--;
		}
	}
}



