/*"1.) Write a program to replace a given substring in a sentence with another string.
 * For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”.
2.) WAP to tOGGLE each word in the String?
Input: This is Geekster
Output: tHIS iS gEEKSTER
3.) WAP to reverse tOGGLE each word in the String?
 Input: my name is khan
Output: yM eMAN sI nAHK"
*/public class ass1march {
    public static void main(String[] args) {
//		C/W
        System.out.println(printIntialLetter("gu"));
        System.out.println(makeCapitalFirstLetter("gulshan hi how are You"));
//		H/W
        System.out.println(toggleString("This is Geekster"));
        System.out.println(reverseToggledString("my name is khan"));
        System.out.println(replaceString("A batman with bat","bat","snow"));
    }
    private static String replaceString(String inputString, String toBeReplace, String replaceWith) {
        return inputString.replace(toBeReplace, replaceWith);
    }
    private static String reverseToggledString(String str) {
        String[] strArray=str.split(" ");
        String output="";
        for(String val:strArray) {
            val=val.toUpperCase();
            StringBuilder value=new StringBuilder(val).reverse();
            value.setCharAt(0, Character.toLowerCase(value.charAt(0)));
            output+=value.toString()+" ";
        }
        return output;
    }

    private static String toggleString(String str) {
        String res="";
        for(char ch:str.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                ch=Character.toLowerCase(ch);
            }else {
                ch=Character.toUpperCase(ch);
            }
            res+=ch;
        }
        return res;
    }
    private static String makeCapitalFirstLetter(String str) {
        String res[]=str.split(" ");
        StringBuilder output=new StringBuilder();
        if (str.length()>0) {
            for (String value : res) {
                StringBuilder val=new StringBuilder(value);
                val.setCharAt(0,(Character.isLowerCase(value.charAt(0))?Character.toUpperCase(value.charAt(0)):val.charAt(0)));
                output.append(val+" ");
            }
        }
        return output.toString();
    }
    private static String printIntialLetter(String str) {
        String res[]=str.split(" ");
        String output="";
        if (str.length()>0) {
            for (String value : res) {
                output += String.valueOf(value.charAt(0)).toUpperCase();
            }
        }
        return output;
    }
}
