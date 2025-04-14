# 🌟 Longest Common Prefix - Java Implementation

## 📝 Problem Statement
Given an array of strings, find the **longest common prefix** among them.

---

## ⚙️ Algorithm

1. If the input array is empty, return `""`.
2. Initialize the prefix as the first string in the array.
3. Iterate over the rest of the strings:
   - While the current string does not start with the prefix, reduce the prefix length from the end.
   - If the prefix becomes empty, return `""`.
4. Return the final prefix.

---

## 💻 Java Program

```java
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                // Reduce prefix length
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + result);
    }
}
