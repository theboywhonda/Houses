import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    /*
     * Complete the function below.
     */
    static int consecutive(long num) {
        //INSERT
        
        
        
    }
  
   public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        long num;
        num = Long.parseLong(in.nextLine().trim());

        res = consecutive(num);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
