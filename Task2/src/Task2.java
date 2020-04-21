public class Task2 {

    public static String repeat (String str, int n) {
        String rep = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++)
                rep += str.charAt(i) ;
        }
        return rep;
    }

    public static int differenceMaxMin (int[] arr) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        return max - min;
    }

    public static boolean isAvgWhole(int[] arr) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        if (avg == (int)avg)
            return true;
        else
            return false;
    }

    public static int[] cumulativeSum (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    public static int getDecimalPlaces (String num) {
        if (num.indexOf(".") != -1)
            return num.length()-(num.indexOf(".") + 1);
        else
            return 0;
    }

    public static int Fibonacci (int n) {
        switch (n) {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                return Fibonacci(n-2) + Fibonacci(n-1);
        }
    }

    public static boolean isValid (String index) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        for (int i = 0; i < index.length(); i++) {
            if (!Character.isDigit(index.charAt(i)))
                flag1 = false;
            if (index.charAt(i) == ' ')
                flag2 = false;
            if (index.length() > 5)
                flag3 = false;
        }
        if ((flag1 && flag2 && flag3) == true )
            return true;
        else
            return false;
    }

    public static boolean isStrangePair (String str1, String str2) {
        try {
            if (str1.charAt(0) == str2.charAt(str2.length() - 1) &&
                    str1.charAt(str1.length() - 1) == str2.charAt(0))
                return true;
            else
                return false;
        }
        catch (Exception ex) {
            return true;
        }
    }

    //Переделать под значок тире
    public static boolean isPrefix (String word, String prefix) {
        StringBuffer sb = new StringBuffer(prefix);
        sb.delete(prefix.length() - 1, prefix.length());
        String prefix1 = sb.toString();
        return word.startsWith(prefix1);
    }

    public static boolean isSuffix (String word, String suffix) {
        StringBuffer sb = new StringBuffer(suffix);
        sb.delete(0,1);
        String suffix1 = sb.toString();
        return word.endsWith(suffix1);
    }

    public static int boxSeq (int n) {
        int[] arr = new int[n];
        int fields = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            if (i % 2 == 0)
                fields += 3;
            else
                fields -= 1;
        }
        return fields;
    }
}
