| Method                   | Description                | Example                     |
| ------------------------ | -------------------------- | --------------------------- |
| `length()`               | Returns length of string   | `"Hello".length()` → `5`    |
| `isEmpty()`              | Checks if string is empty  | `"".isEmpty()` → `true`     |

| `charAt(int index)`      | Returns character at index | `"Java".charAt(2)` → `'v'`  |
| `codePointAt(int index)` | Unicode of character       | `"A".codePointAt(0)` → `65` |
| Method                          | Description                      | Example                                    |
| ------------------------------- | -------------------------------- | ------------------------------------------ |
| `equals(String s)`              | Checks equality (case-sensitive) | `"Java".equals("java")` → `false`          |
| `equalsIgnoreCase(String s)`    | Case-insensitive comparison      | `"Java".equalsIgnoreCase("java")` → `true` |
| `compareTo(String s)`           | Lexicographically compares       | `"a".compareTo("b")` → `-1`                |
| `compareToIgnoreCase(String s)` | Case-insensitive compare         | `"A".compareToIgnoreCase("a")` → `0`       |
| Method                      | Description              | Example                             |
| --------------------------- | ------------------------ | ----------------------------------- |
| `contains(CharSequence s)`  | Checks substring         | `"Hello".contains("ll")` → `true`   |
| `startsWith(String prefix)` | Checks beginning         | `"Hello".startsWith("He")` → `true` |
| `endsWith(String suffix)`   | Checks ending            | `"Hello".endsWith("lo")` → `true`   |
| `indexOf(String s)`         | First index of substring | `"Java".indexOf("a")` → `1`         |
| `lastIndexOf(String s)`     | Last index of substring  | `"Java".lastIndexOf("a")` → `3`     |
| Method                                  | Description                     | Example                                      |
| --------------------------------------- | ------------------------------- | -------------------------------------------- |
| `substring(int begin)`                  | From index to end               | `"Hello".substring(2)` → `"llo"`             |
| `substring(int begin, int end)`         | Between indexes                 | `"Hello".substring(1,4)` → `"ell"`           |
| `concat(String s)`                      | Joins strings                   | `"Hello".concat(" World")` → `"Hello World"` |
| `replace(char old, char new)`           | Replace character               | `"Java".replace('a','o')` → `"Jovo"`         |
| `replaceAll(String regex, String repl)` | Replace using regex             | `"aa11".replaceAll("\\d","*")` → `"aa**"`    |
| `trim()`                                | Removes leading/trailing spaces | `" Java ".trim()` → `"Java"`                 |
| Method          | Description           | Example                           |
| --------------- | --------------------- | --------------------------------- |
| `toLowerCase()` | Converts to lowercase | `"JAVA".toLowerCase()` → `"java"` |
| `toUpperCase()` | Converts to uppercase | `"java".toUpperCase()` → `"JAVA"` |
| Method                            | Description              | Example                                     |
| --------------------------------- | ------------------------ | ------------------------------------------- |
| `split(String regex)`             | Splits string into array | `"a,b,c".split(",")` → `["a","b","c"]`      |
| `join(CharSequence d, elements…)` | Joins with delimiter     | `String.join("-", "a","b","c")` → `"a-b-c"` |
| Method                     | Description               | Example                                        |
| -------------------------- | ------------------------- | ---------------------------------------------- |
| `toCharArray()`            | Converts to char array    | `"Java".toCharArray()` → `['J','a','v','a']`   |
| `valueOf(int x)`           | Converts number to string | `String.valueOf(123)` → `"123"`                |
| `format(String fmt, args)` | Formats string            | `String.format("Hi %s", "John")` → `"Hi John"` |
| Method                  | Description         | Example                          |
| ----------------------- | ------------------- | -------------------------------- |
| `matches(String regex)` | Matches regex       | `"123".matches("\\d+")` → `true` |
| `intern()`              | Adds to String pool | `"Java".intern()`                |
| `repeat(int n)`         | Repeats string      | `"Hi".repeat(3)` → `"HiHiHi"`    |
public class StringMethods {
    public static void main(String[] args) {
        String s = "  Java Programming  ";

        System.out.println(s.length());               // 19
        System.out.println(s.trim());                 // "Java Programming"
        System.out.println(s.toUpperCase());          // "  JAVA PROGRAMMING  "
        System.out.println(s.substring(2, 6));        // "Java"
        System.out.println(s.replace("Java", "C++")); // "  C++ Programming  "
        System.out.println(s.contains("Prog"));       // true
    }
}


📘 Basics

What is a String in Java?

Difference between String, StringBuilder, and StringBuffer.

How are Strings stored in memory (String pool concept)?

What is immutability in Strings?

How to create a String in two ways?

📘 String Methods – Theory

Difference between equals() and ==.

Difference between equals() and equalsIgnoreCase().

What does compareTo() return?

Use of length() method.

What does charAt(int index) return?

📘 String Searching

Find if a string contains a particular substring.

Check if a string starts with "Java".

Check if a string ends with "ing".

Find the first index of a character in a string.

Find the last index of "a" in a string.

📘 String Modification

Extract "Java" from "I love Java Programming".

Replace all "a" with "o" in "banana".

Remove all spaces from "Hello World".

Convert "java" to uppercase.

Convert "JAVA" to lowercase.

📘 Splitting & Joining

Split "apple,banana,grape" into an array.

Join ["a","b","c"] into "a-b-c".

Split a sentence into words.

Count words in "Hello Java World".

Convert "1234" into an array of characters.

📘 Reversing & Palindrome

Reverse "hello".

Check if "madam" is a palindrome.

Reverse words in "Java is fun".

Print characters of a string one by one.

Reverse string using recursion.

📘 Counting

Count vowels in "education".

Count consonants in "programming".

Count frequency of each character in a string.

Count digits in "Java123".

Count spaces in a sentence.

📘 Comparisons

Compare "java" and "Java" (case-sensitive).

Compare "java" and "Java" (ignore case).

Compare two strings lexicographically.

Find the largest string in an array.

Find the smallest string in an array.

📘 Conversions

Convert int 123 to string.

Convert string "456" to int.

Convert string to char[].

Convert char[] to string.

Format "My name is X and I am Y years old".

📘 Advanced Practice

Remove duplicate characters from "programming".

Find the first non-repeated character in "stress".

Check if two strings are anagrams (listen, silent).

Find substring without using substring() method.

Check if a string contains only digits.
