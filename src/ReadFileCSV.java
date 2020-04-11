import java.io.*;

public class ReadFileCSV {
    public static void readFileCSV(File csvFile) {
        String line = "";
        String csvSplitBy = ",";
        try {
            FileReader fileReader = new FileReader(csvFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                String[] country = line.split(csvSplitBy);
                System.out.println("Country [code: " + country[4] + ", name: " + country[5] + "]");
            }
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
