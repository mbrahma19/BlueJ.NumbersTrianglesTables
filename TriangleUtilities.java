 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result = "";
        for(int i = 0; i < numberOfStars; i++ ){
            result = result + "*";
        }
        return result;
    }
    
    public static String getTriangle(int numberOfRows) {
        String result = "";
        for(int j = 1; j <= numberOfRows; j++){    
            for(int i = 0; i < j; i++ ){
                result = result + "*";
            }
            result = result + "\n";
        }    
        return result;
    }


    public static String getSmallTriangle() {
        String result = "";
        for(int j = 1; j <= 4; j++){    
            for(int i = 0; i < j; i++ ){
                result = result + "*";
            }
            result = result + "\n";
        }    
        return result;
    }

    public static String getLargeTriangle() {
        String result = "";
        for(int j = 1; j <= 9; j++){    
            for(int i = 0; i < j; i++ ){
                result = result + "*";
            }
            result = result + "\n";
        }    
        return result;
    }
}
