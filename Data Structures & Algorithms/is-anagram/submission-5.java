class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] ch1=s.toCharArray();
        // char[] ch2=t.toCharArray();

        // Arrays.sort(ch1);
        // Arrays.sort(ch2);

        // if(ch1.length!=ch2.length)
        //     return false;

        // for(int i=0; i<ch1.length; i++){
        //     if(ch1[i] != ch2[i]){
        //         return false;
        //     }
        // }
        // return true;

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0)+1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0)+1);
        }

        return mapS.equals(mapT);
    }
}
