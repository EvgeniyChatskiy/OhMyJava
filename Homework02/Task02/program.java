package Homework02.Task02;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class program {
    static File fileLog;
    static FileWriter fileWriter;
    public static void main(String[] args) throws IOException {
        fileLog = new File("Homework02\\Task02\\log.txt");
        fileWriter = new FileWriter(fileLog);

        int[] array = {11, 3, 14, 16, 12, 6, 15, 2, 7};
 
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            fileWriter.write(Arrays.toString(array) + '\n');
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        fileWriter.close();
    }
}
