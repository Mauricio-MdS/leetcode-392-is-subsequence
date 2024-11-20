class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;

        for (char c : s.toCharArray()) {
            while ( i < t.length() && c != t.charAt(i)) i++;

            if (i == t.length()) return false;

            i++;
        }
        return true;
    }
}