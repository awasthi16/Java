// Java String Questions & Answers (50 Examples)
// Run: javac StringPractice.java && java StringPractice

import java.util.*;

public class StringPractice {

    public static void main(String[] args) {
        // Uncomment whichever question you want to test
        q1(); q2(); q3(); q4(); q5();
        q6(); q7(); q8(); q9(); q10();
        q11(); q12(); q13(); q14(); q15();
        q16(); q17(); q18(); q19(); q20();
        q21(); q22(); q23(); q24(); q25();
        q26(); q27(); q28(); q29(); q30();
        q31(); q32(); q33(); q34(); q35();
        q36(); q37(); q38(); q39(); q40();
        q41(); q42(); q43(); q44(); q45();
        q46(); q47(); q48(); q49(); q50();
    }

    // 1. String basics
    static void q1() {
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println("Q1: " + s1 + " | " + s2);
    }

    // 2. StringBuilder
    static void q2() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("Q2: " + sb);
    }

    // 3. String Pool
    static void q3() {
        String a = "Java";
        String b = "Java";
        System.out.println("Q3: " + (a == b));
    }

    // 4. Immutability
    static void q4() {
        String s = "Java";
        s.concat(" World");
        System.out.println("Q4: " + s);
    }

    // 5. Two ways
    static void q5() {
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println("Q5: " + s1 + " | " + s2);
    }

    // 6. equals vs ==
    static void q6() {
        String a = new String("Java");
        String b = new String("Java");
        System.out.println("Q6: " + (a == b) + " | " + a.equals(b));
    }

    // 7. equalsIgnoreCase
    static void q7() {
        System.out.println("Q7: " + "Java".equalsIgnoreCase("java"));
    }

    // 8. compareTo
    static void q8() {
        System.out.println("Q8: " + "a".compareTo("b"));
    }

    // 9. length
    static void q9() {
        System.out.println("Q9: " + "Hello".length());
    }

    // 10. charAt
    static void q10() {
        System.out.println("Q10: " + "Java".charAt(2));
    }

    // 11. contains
    static void q11() {
        System.out.println("Q11: " + "Hello Java".contains("Java"));
    }

    // 12. startsWith
    static void q12() {
        System.out.println("Q12: " + "Java World".startsWith("Java"));
    }

    // 13. endsWith
    static void q13() {
        System.out.println("Q13: " + "Programming".endsWith("ing"));
    }

    // 14. indexOf
    static void q14() {
        System.out.println("Q14: " + "banana".indexOf('a'));
    }

    // 15. lastIndexOf
    static void q15() {
        System.out.println("Q15: " + "banana".lastIndexOf('a'));
    }

    // 16. substring
    static void q16() {
        String s = "I love Java Programming";
        System.out.println("Q16: " + s.substring(7, 11));
    }

    // 17. replace
    static void q17() {
        System.out.println("Q17: " + "banana".replace('a', 'o'));
    }

    // 18. remove spaces
    static void q18() {
        System.out.println("Q18: " + "Hello World".replace(" ", ""));
    }

    // 19. uppercase
    static void q19() {
        System.out.println("Q19: " + "java".toUpperCase());
    }

    // 20. lowercase
    static void q20() {
        System.out.println("Q20: " + "JAVA".toLowerCase());
    }

    // 21. split
    static void q21() {
        String[] arr = "apple,banana,grape".split(",");
        System.out.print("Q21: ");
        for (String s : arr) System.out.print(s + " ");
        System.out.println();
    }

    // 22. join
    static void q22() {
        System.out.println("Q22: " + String.join("-", "a", "b", "c"));
    }

    // 23. split words
    static void q23() {
        String[] words = "Hello Java World".split(" ");
        System.out.print("Q23: ");
        for (String w : words) System.out.print(w + " ");
        System.out.println();
    }

    // 24. count words
    static void q24() {
        String[] words = "Hello Java World".split(" ");
        System.out.println("Q24: " + words.length);
    }

    // 25. toCharArray
    static void q25() {
        char[] ch = "1234".toCharArray();
        System.out.print("Q25: ");
        for (char c : ch) System.out.print(c + " ");
        System.out.println();
    }

    // 26. reverse
    static void q26() {
        String s = "hello";
        System.out.println("Q26: " + new StringBuilder(s).reverse());
    }

    // 27. palindrome
    static void q27() {
        String s = "madam";
        System.out.println("Q27: " + s.equals(new StringBuilder(s).reverse().toString()));
    }

    // 28. reverse words
    static void q28() {
        String s = "Java is fun";
        String[] arr = s.split(" ");
        System.out.print("Q28: ");
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // 29. print characters
    static void q29() {
        String s = "hello";
        System.out.print("Q29: ");
        for (int i = 0; i < s.length(); i++) System.out.print(s.charAt(i) + " ");
        System.out.println();
    }

    // 30. reverse recursion
    static void q30() {
        System.out.println("Q30: " + reverse("hello"));
    }
    static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    // 31. count vowels
    static void q31() {
        String s = "education";
        int count = 0;
        for (char c : s.toCharArray()) if ("aeiou".indexOf(c) >= 0) count++;
        System.out.println("Q31: " + count);
    }

    // 32. count consonants
    static void q32() {
        String s = "programming";
        int count = 0;
        for (char c : s.toCharArray())
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) count++;
        System.out.println("Q32: " + count);
    }

    // 33. frequency
    static void q33() {
        String s = "programming";
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        System.out.print("Q33: ");
        for (int i = 0; i < freq.length; i++) if (freq[i] > 0)
            System.out.print((char) i + "=" + freq[i] + " ");
        System.out.println();
    }

    // 34. count digits
    static void q34() {
        String s = "Java123";
        int count = 0;
        for (char c : s.toCharArray()) if (Character.isDigit(c)) count++;
        System.out.println("Q34: " + count);
    }

    // 35. count spaces
    static void q35() {
        String s = "Hello World Java";
        int count = 0;
        for (char c : s.toCharArray()) if (c == ' ') count++;
        System.out.println("Q35: " + count);
    }

    // 36. compare case-sensitive
    static void q36() {
        System.out.println("Q36: " + "java".equals("Java"));
    }

    // 37. compare ignore case
    static void q37() {
        System.out.println("Q37: " + "java".equalsIgnoreCase("Java"));
    }

    // 38. lexicographic
    static void q38() {
        System.out.println("Q38: " + "apple".compareTo("banana"));
    }

    // 39. largest string
    static void q39() {
        String[] arr = {"cat", "zebra", "apple"};
        String max = arr[0];
        for (String s : arr) if (s.compareTo(max) > 0) max = s;
        System.out.println("Q39: " + max);
    }

    // 40. smallest string
    static void q40() {
        String[] arr = {"cat", "zebra", "apple"};
        String min = arr[0];
        for (String s : arr) if (s.compareTo(min) < 0) min = s;
        System.out.println("Q40: " + min);
    }

    // 41. int to string
    static void q41() {
        int x = 123;
        String s = String.valueOf(x);
        System.out.println("Q41: " + s);
    }

    // 42. string to int
    static void q42() {
        int x = Integer.parseInt("456");
        System.out.println("Q42: " + (x + 10));
    }

    // 43. string to char[]
    static void q43() {
        char[] arr = "hello".toCharArray();
        System.out.println("Q43: " + Arrays.toString(arr));
    }

    // 44. char[] to string
    static void q44() {
        char[] arr = {'h', 'i'};
        String s = new String(arr);
        System.out.println("Q44: " + s);
    }

    // 45. format
    static void q45() {
        String s = String.format("My name is %s and I am %d years old", "John", 25);
        System.out.println("Q45: " + s);
    }

    // 46. remove duplicates
    static void q46() {
        String s = "programming";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (sb.indexOf(String.valueOf(s.charAt(i))) == -1) sb.append(s.charAt(i));
        System.out.println("Q46: " + sb);
    }

    // 47. first non-repeated
    static void q47() {
        String s = "stress";
        for (char c : s.toCharArray())
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println("Q47: " + c);
                break;
            }
    }

    // 48. anagram
    static void q48() {
        String a = "listen", b = "silent";
        char[] ca = a.toCharArray(), cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        System.out.println("Q48: " + Arrays.equals(ca, cb));
    }

    // 49. substring without substring()
    static void q49() {
        String s = "Hello";
        int start = 1, end = 4;
        String result = "";
        for (int i = start; i < end; i++) result += s.charAt(i);
        System.out.println("Q49: " + result);
    }

    // 50. only digits
    static void q50() {
        String s = "12345";
        System.out.println("Q50: " + s.matches("\\d+"));
    }
}
