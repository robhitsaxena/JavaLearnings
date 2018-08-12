public class palindrome {
    public static boolean palindrome(String value){
        int length = value.length();
        String reverse = "";
        for (int i= length -1; i >=0; i--){
            reverse = reverse + value.charAt(i);

        }

        if(value.equals(reverse)){
            return true;
        }
        return false;

    }
}
