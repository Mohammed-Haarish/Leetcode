class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",
        ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
        "..-","...-",".--","-..-","-.--","--.."};

        Set<String> unique=new HashSet<>();
        for(String w:words){
            StringBuilder res=new StringBuilder();
            for(char c:w.toCharArray()){
                res.append(morse[c-'a']);
            }
            unique.add(res.toString());
        }
        return unique.size();
    }
}