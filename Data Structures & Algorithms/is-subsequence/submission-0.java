class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int sIdx = 0;
        for (int j = 0; j < t.length() && sIdx < s.length(); j++) {
            if (s.charAt(sIdx) == t.charAt(j)) {
                sIdx++;
            }
        }
        return sIdx == s.length();
    }
}