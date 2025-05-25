 import java.util.*;

public class GroupAnagramsWithoutMap {
    public static List<List<String>> groupAnagrams(String[] words) {
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[words.length]; // Track used words

        for (int i = 0; i < words.length; i++) {
            if (used[i]) continue; // Skip if already grouped

            List<String> group = new ArrayList<>();
            group.add(words[i]);
            used[i] = true;

            char[] sortedWord = words[i].toCharArray();
            Arrays.sort(sortedWord);

            for (int j = i + 1; j < words.length; j++) {
                char[] sortedCompare = words[j].toCharArray();
                Arrays.sort(sortedCompare);

                if (Arrays.equals(sortedWord, sortedCompare)) { // Check if words match
                    group.add(words[j]);
                    used[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));
    }
} 
  