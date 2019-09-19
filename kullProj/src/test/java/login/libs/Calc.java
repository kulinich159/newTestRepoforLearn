package login.libs;

public class Calc {

    // void - это результат никакой не возвращается

    // ctrl+alt + l
    public static int sum(int temp_var1, int temp_var2) {

        System.out.println("Result = " + (temp_var1 + temp_var2));
        return temp_var1 + temp_var2;
    }

    public static String sum(String temp_string1, String temp_string2) {

        System.out.println("Result string sum = " + temp_string1 + " " + temp_string2);
        return temp_string1 + temp_string2;
    }

    public static String sum(String varString, int varInt) {

        System.out.println(varString + varInt);
        return varString + varInt;
    }

    public static int sum(int varInt, String varString) {

        try {

            int tempResult = varInt + Integer.parseInt(varString);
            System.out.println("Result " + tempResult);
            return tempResult;

        } catch (NumberFormatException e) {

            System.out.println("Error" + e);
            return 88888;

        } catch (Exception e) {
            System.out.println("Error" + e);
            return 99999;
        }

    }
}
