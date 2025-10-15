class Solution {
    public enum Numerals{
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int value;

        Numerals(int value){
            this.value = value;
        }

        public static int getValue(char c){
            return Numerals.valueOf(String.valueOf(c)).value;
        }
    }

    public int romanToInt(String s) {
        
        int converted = 0;
        int i = 0;

        while (i+1<s.length()){
            int current =(Numerals.getValue(s.charAt(i))); 
            int next = (Numerals.getValue(s.charAt(i+1)));

            if (current < next){
                current = current *-1;
                converted = converted + (current);
            }
            else{
                converted = converted + current;
            }
            i++;
        }
    return converted + Numerals.getValue(s.charAt(i));
    }
}
