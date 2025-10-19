class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String longestCommonPrefix = "";
        
        for (int i=0; i<strs.length-1; i++){
            String currentLongest = "";
            int minLength = Math.min(strs[i].length(),strs[i+1].length());

            for (int j=0; j < minLength;j++){
                if (strs[i].charAt(j)==strs[i+1].charAt(j)){
                    currentLongest = currentLongest + (strs[i].charAt(j));
                }
                else {
                    break;
                }
            }
                if(i==0){
                    longestCommonPrefix = currentLongest;
                }
                else if (currentLongest.length() < longestCommonPrefix.length()){
                    longestCommonPrefix = currentLongest;
                }
        }
        return longestCommonPrefix;
    }
}
