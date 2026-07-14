class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();

        for(String word:strs){
            char[] letters=word.toCharArray();
            Arrays.sort(letters);
            String newString=new String(letters);

            if(!map.containsKey(newString)){
                map.put(newString, new ArrayList<>());
            }
            map.get(newString).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
