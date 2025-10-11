class Solution {
    public int scoreOfString(String s) {
        
        int difference = 0;
        int i=0;
        int score = 0;

        for (i=0; i+1<s.length(); i++){
            char current =s.charAt(i);
            char next = s.charAt(i+1);
            difference = (current - next);
            if (difference < 0){
                difference = difference *-1;
            }
            score = score + difference;
        }//loop
        return score;
    }//scoreofstring
    
}//class
