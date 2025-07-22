class Solution {
    public int countCharacters(String[] words, String chars) {



        Map<Character, Integer> charsMap = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charsMap.put(c, charsMap.getOrDefault(c, 0) + 1);
        }

        int totalLength = 0;

        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<>();
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);

                if (wordMap.get(c) > charsMap.getOrDefault(c, 0)) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                totalLength += word.length();
            }
        }

        return totalLength;
    
    }
}