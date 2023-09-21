class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber == 0){
            return "";
        }
        columnNumber--;
        int x = columnNumber%26;
        int y = columnNumber/26;
        char c = (char)('A' + x);
        return convertToTitle(y) +c;
    }
}
