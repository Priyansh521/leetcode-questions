public class maximunWord {
    public static int lengthOfMax(String s) {
            int length = s.length();
            String x = "";
            int max = 0;
            ArrayList<String> arr = new ArrayList<String>(length);
            for(int i = 0; i<s.length(); i++){
                x+= s.charAt(i);
                if(s.charAt(i) == ' '){
                    //space will also be added to the string element of the array list to removve we can use string methods
                    arr.add(x);
                    x = "" ;
                }
            }
            for(int i = 0; i<arr.size()-1; i++){
                if(arr.get(i).length()>arr.get(i+1).length()){
                    max = arr.get(i).length();
                }else max = arr.get(i+1).length();
            }
            return max;
        }

    public static void main(String[] args) {
        String s = "I will help you in yourwork onceIamDoneWith mine";
        int z = lengthOfMax(s);
        System.out.println(z);
    }
}
