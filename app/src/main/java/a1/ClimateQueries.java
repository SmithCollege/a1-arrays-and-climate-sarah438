package a1;


import java.io.*;
import java.util.Scanner;

public class ClimateQueries {
    public static void main(String[] args) {
        String filename = (args.length > 0) ? args[0] : "YUMA_2023.txt";
        System.out.println(filename);
        Scanner file = null;
        //float total_temp = 0.0f;
        try {
          file = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
          System.err.println("Cannot locate file.");
          System.exit(-1);
        }
        // int line_count = 0;
        // while (file.hasNextLine()){
        //   line_count += 1;
        // }
        //float[] january = new float[31]; 
       // float[] july = new float[31];
        float[] all_temp = new float[226];
        int current_line = 0;
        String[] all_dates = new String[226];
        
        while (file.hasNextLine()) {
          String line = file.nextLine();
          String[] fields = line.split("\\s+");
          String date = fields[1];
          float temperature = Float.valueOf(fields[8]);

          all_dates[current_line] = date;
          all_temp[current_line] = temperature;
          current_line += 1;
          
          
          //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
        }
        file.close();
        boolean[] ex_values =  ArrayMethods.isEqualTo(all_temp, -9999.0f);
        boolean[] useVal = ArrayMethods.logicalNot(ex_values); 

        float all_mean = ArrayMethods.mean(all_temp, useVal, 0, 226);
        float all_mean_times_10 = Math.round(all_mean*10);
        System.out.println("Annual Mean Temperature: " + all_mean_times_10/10 + " degrees Celsius");

        float min = ArrayMethods.min(all_temp, useVal);
        System.out.println("Minimum Daily Temperature: " + min + " degrees Celsius");

        float max = ArrayMethods.max(all_temp);
        System.out.println("Maximum Daily Temperature: " + max + " degrees Celsius");

        boolean[] jan_dates_bool = ArrayMethods.datesBetween(all_dates, "20230101", "20230131");
        boolean[] use_jan = ArrayMethods.logicalAnd(useVal, jan_dates_bool);
        float jan_mean = ArrayMethods.mean(all_temp, use_jan, 0, 226);
        float jan_mean_times_10 = Math.round(jan_mean*10);
        System.out.println("Mean temperature in January: " + jan_mean_times_10/10 + " degrees Celsius");

        boolean[] july_dates_bool = ArrayMethods.datesBetween(all_dates, "20230701", "20230731");
        boolean[] use_july = ArrayMethods.logicalAnd(useVal, july_dates_bool);
        float july_mean = ArrayMethods.mean(all_temp, use_july, 0, 226);
        float july_mean_times_10 = (Math.round(july_mean*10));
        System.out.println("Mean temperature in July: " + july_mean_times_10/10 + " degrees Celsius");
        //System.out.println(useVal);
      }
}
