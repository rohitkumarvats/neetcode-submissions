class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null && strs.length==0){
            return "";
        }

        Arrays.sort(strs);
        String firstLength=strs[0];
        String lastLength=strs[strs.length-1];
        int i=0;

        while(i<firstLength.length() && i<lastLength.length()){
            if(firstLength.charAt(i)==lastLength.charAt(i)){
                i++;
            } else {
                break;
            }
        }

        return firstLength.substring(0, i);
    }
}