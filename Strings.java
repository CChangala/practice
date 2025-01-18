public class Strings {
    public static boolean isPalindrome(String s) {
        //to replace space and make lowercase
        String org = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        System.out.println(org);
        StringBuilder str = new StringBuilder(org);
        String reversed = str.reverse().toString();
        System.out.println(reversed);
        //to check two strings we have to use string.equals(anotherstring)
        return org.equals(reversed);
    }

    public static void main(String[] args){
        Boolean ans = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(ans);
    }

}
