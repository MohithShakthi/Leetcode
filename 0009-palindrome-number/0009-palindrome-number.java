class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int r = 0;
        int n = str.length();
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) == str.charAt(n-1-i)){
                r++;
            }
            else {
                return false;
            }
        }
        if(r > 0){
            return true;
        }
        return false;
    }
}