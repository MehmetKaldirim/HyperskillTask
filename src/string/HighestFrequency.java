package string;

public class HighestFrequency {
    public static void main(String[] args) {


        String str = "aaabbbdfff";

        int highestFrequency = 0;
        String result = "";

        String stringArray = "00";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if ((count >= stringArray.charAt(1)-48)) {
                stringArray = ""+ ch + count  + stringArray;
                System.out.println("if  " + i + " char has more occurences add it to left, and here is new string =  " + stringArray );
                if (!result.contains(ch+"") && count != stringArray.charAt(3)-48) {
                    result = "" + stringArray.charAt(0);
                } else if(!result.contains(ch+"") && count == stringArray.charAt(3)-48){
                    result = result + stringArray.charAt(0) +"";
                }
            } else if ((count < (int)stringArray.charAt(1)-48)) {
                stringArray = "" + stringArray + ch + count;

                System.out.println("if  " + i + " char  has less occurencec add it to right, and here is new string =  " + stringArray );
            }

        }

        System.out.println(result);

    }
}