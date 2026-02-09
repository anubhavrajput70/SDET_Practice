package practicee;
//Need to find all the group of anagram from the given input 
//input: words = {"eat", "tea", "tan", "ate", "nat", "bat"};
//output: [eat, tea, ate]
//        [bat]
//        [tan, nat]

import java.util.*;
public class ArrayOfAnagram {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
