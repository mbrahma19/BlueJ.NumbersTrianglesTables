import java.lang.Math;


public class NumberUtilities {

    public static String getRange(int stop) {
        String result = "";
        for(int i = 0; i < stop; i++){
            result = result + String.valueOf(i);
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++){
            result = result + String.valueOf(i);
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for(int i = start; i < stop; i+=step){
            result = result + String.valueOf(i);
        }
        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";  
        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                result = result + String.valueOf(i);
            }
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++){
            if(i % 2 == 1){
                result = result + String.valueOf(i);
            }  
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String result = "";
            for(int i = start; i <= stop; i++){
                int num = (int) Math.pow(i,exponent);
                result = result + String.valueOf(num);
            }
        return result;
    }
}
