lass Solution {
    public char findTheDifference(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        int x =0;
        for(int i = 0; i<s.length();i++){
            if( T[i] != S[i]){
                 x=i;
                 break;
           }
           if(T[i] == S[i] && T.length>S.length){
               x = T.length -1;
           }
        }
        return T[x];
    }
}
