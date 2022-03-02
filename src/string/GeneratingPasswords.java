package string;

import java.util.*;


public class GeneratingPasswords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//upper
        int b = sc.nextInt();//lower
        int c = sc.nextInt();//digits
        int n = sc.nextInt();//length

        int sum = a + b + c;
        String result = "";
        if (a == 0 && b == 0 && c == 0){
            result = "";
        } else if (n == sum) {
            result = equalSum(a, b , c , result);

        } else if (n > sum){
            result = equalSum(a, b , c , result);
            result = moreSum(n-sum,result);

            }





        System.out.println(result);

    }

    public static String equalSum(int a,int b,int c ,String result){
        for (int i = 0; i < a; i++){
             result = addUpper(result);
        }
        for (int i = 0; i < b; i++){
            result = addLower(result);
        }
        for (int i = 0; i < c; i++){
            result = addNumbers(result);
        }
        return result;

    }
    public static String moreSum(int dif, String result){
        for (int i = 0; i < dif; i++){
            result = addUn(result);
        }
        return result;
    }


    public static Character createRandomSybmbol() {
        return (char) (new Random().nextInt(26) + 'a');
    }

    public static Character createRandomNonAlphaNumerical() {
        return (char) (new Random().nextInt(100) + 'ž');
    }

    public static String  addUn (String result) {
          if(result.length()== 0){
              result += createRandomNonAlphaNumerical();
          } else {
              while (true) {
                  Character addNon = createRandomNonAlphaNumerical();
                  boolean isAdd = !(result.charAt(result.length()-1) == addNon);
                  if (isAdd){
                      result += addNon;
                      break;
                  }
              }

          }


            return result;
    }


    public static String addUpper(String result) {
        if(result.length()== 0){
            result += Character.toUpperCase(createRandomSybmbol());
        } else {
            while (true) {
                Character addUpper = Character.toUpperCase(createRandomSybmbol());
                boolean isAdd = !(result.charAt(result.length() - 1) == addUpper);
                if (isAdd) {
                    result += addUpper;
                    break;
                }
            }
        }
       return result;
    }

    public static String addLower(String result) {
        if(result.length()== 0){
            result += Character.toLowerCase(createRandomSybmbol());
        } else {
            while (true) {
                Character addLower = Character.toLowerCase(createRandomSybmbol());
                boolean isAdd = !(result.charAt(result.length() - 1) == addLower);
                if (isAdd) {
                    result += addLower;
                    break;
                }
            }
        }
        return result;
    }

    public static String addNumbers(String result) {
        if(result.length()== 0){
            result += Character.forDigit(new Random().nextInt(10), 10);
        } else {
            while (true) {
                Character addDigit = Character.forDigit(new Random().nextInt(10), 10);
                boolean isAdd = !(result.charAt(result.length() - 1) == addDigit);
                if (isAdd) {
                    result += addDigit;
                    break;
                }

            }
        }
        return result;
    }
}
