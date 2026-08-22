class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;

        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            
            if (countMap.getOrDefault(rightChar, 0) > 0) {
                count--;
            }
            countMap.put(rightChar, countMap.getOrDefault(rightChar, 0) - 1);
            while (count == 0) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIdx = l;
                }

                char leftChar = s.charAt(l);
                countMap.put(leftChar, countMap.get(leftChar) + 1);
                if (countMap.get(leftChar) > 0) {
                    count++;
                }
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }
}