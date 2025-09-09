import java.util.*;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Find length of a string without using length()
        String str1 = "Hello";
        int count = 0;
        for (char c : str1.toCharArray()) {
            count++;
        }
        System.out.println("Length of \"" + str1 + "\" = " + count);

        // 2. Check whether a given string is empty or not using isEmpty()
        String str2 = "";
        System.out.println("Is string empty? " + str2.isEmpty());

        // 3. Find the character at the middle index of a string using charAt()
        String str3 = "Programming";
        int midIndex = str3.length() / 2;
        System.out.println("Middle character of \"" + str3 + "\" = " + str3.charAt(midIndex));

        // 4. Print the Unicode value of each character in "Java" using codePointAt()
        String str4 = "Java";
        for (int i = 0; i < str4.length(); i++) {
            System.out.println(str4.charAt(i) + " : " + str4.codePointAt(i));
        }

        // 5. Compare "Hello" and "hello" using equals() and equalsIgnoreCase()
        String s1 = "Hello", s2 = "hello";
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("EqualsIgnoreCase: " + s1.equalsIgnoreCase(s2));

        // 6. Check if "programming" contains "gram"
        String s3 = "programming";
        System.out.println("Contains 'gram'? " + s3.contains("gram"));

        // 7. Check if "www.example.com" starts with "www" and ends with "com"
        String s4 = "www.example.com";
        System.out.println("Starts with www? " + s4.startsWith("www"));
        System.out.println("Ends with com? " + s4.endsWith("com"));

        // 8. Find the first and last index of 'a' in "Banana"
        String s5 = "Banana";
        System.out.println("First index of 'a': " + s5.indexOf('a'));
        System.out.println("Last index of 'a': " + s5.lastIndexOf('a'));

        // 9. Count how many times "the" occurs in "the cat in the hat"
        String sentence = "the cat in the hat";
        String word = "the";
        int index = 0, countThe = 0;
        while ((index = sentence.indexOf(word, index)) != -1) {
            countThe++;
            index += word.length();
        }
        System.out.println("Occurrences of 'the' = " + countThe);

        // 10. Extract domain from "https://openai.com"
        String url = "https://openai.com";
        String domain = url.substring(url.indexOf("//") + 2);
        System.out.println("Domain: " + domain);

        // 11. Replace all 'a' with '@' in "Java"
        String s6 = "Java";
        System.out.println("Replace a with @: " + s6.replace('a', '@'));

        // 12. Replace all digits in "abc123xyz456" with *
        String s7 = "abc123xyz456";
        System.out.println("Replace digits: " + s7.replaceAll("\\d", "*"));

        // 13. Trim spaces from " Hello World "
        String s8 = " Hello World ";
        System.out.println("Trimmed: \"" + s8.trim() + "\"");

        // 14. Convert "Hello World" to uppercase and lowercase
        String s9 = "Hello World";
        System.out.println("Uppercase: " + s9.toUpperCase());
        System.out.println("Lowercase: " + s9.toLowerCase());

        // 15. Reverse a string (without using StringBuilder)
        String s10 = "ReverseMe";
        char[] arr = s10.toCharArray();
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev += arr[i];
        }
        System.out.println("Reversed: " + rev);

        // 16. Split "apple,banana,grapes" by comma
        String s11 = "apple,banana,grapes";
        String[] fruits = s11.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 17. Join ["I","love","Java"] with space
        String[] words = {"I", "love", "Java"};
        String joined = String.join(" ", words);
        System.out.println("Joined: " + joined);

        // 18. Count number of words in a sentence entered by user
        System.out.print("Enter a sentence: ");
        String userInput = sc.nextLine();
        String[] tokens = userInput.trim().split("\\s+");
        System.out.println("Word count = " + tokens.length);

        sc.close();
    }
}
