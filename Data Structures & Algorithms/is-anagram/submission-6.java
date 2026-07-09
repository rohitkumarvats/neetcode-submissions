class Solution {
    public boolean isAnagram(String s, String t) {
        // Solution 1
        // if(s.length()!=t.length()){
        //     return false;
        // }

        // char[] ch1=s.toCharArray();
        // char[] ch2=t.toCharArray();

        // Arrays.sort(ch1);
        // Arrays.sort(ch2);

        // for(int i=0; i<ch1.length; i++){
        //     if(ch1[i]!=ch2[i]){
        //         return false;
        //     }
        // }

        // return true;

        // Solution 2
        // if(s.length()!=t.length()){
        //     return false;
        // }

        // char[] ch1=s.toCharArray();
        // char[] ch2=t.toCharArray();

        // Arrays.sort(ch1);
        // Arrays.sort(ch2);

        // return Arrays.equals(ch1, ch2);

        // Solution 3
        if(s.length()!=t.length()){
            return false;
        }

        int[] counterArray=new int[26];
        for(int i=0; i<s.length(); i++){
            counterArray[s.charAt(i) - 'a']++;
            counterArray[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<counterArray.length; i++){
            if(counterArray[i]!=0){
                return false;
            }
        }

        return true;
    }
}
