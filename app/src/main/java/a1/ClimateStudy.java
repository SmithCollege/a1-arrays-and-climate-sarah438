package a1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClimateStudy {
    public static void main(String[] args) {
    String filename_2012 = (args.length > 0) ? args[0] : "CRND0103-2012-NY_Ithaca_13_E.txt";
    Scanner file_2012 = null;
    try {
      file_2012 = new Scanner(new File(filename_2012));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    int current_line_2012 = 0;
    float[] temp_2012 = new float[366];
    while (file_2012.hasNextLine()) {
      String line = file_2012.nextLine();
      String[] fields = line.split("\\s+");
      //String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      temp_2012[current_line_2012] = temperature;
      current_line_2012 += 1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    file_2012.close();
    boolean[] ex_values_2012 =  ArrayMethods.isEqualTo(temp_2012, -9999.0f);
    boolean[] useVal_2012 = ArrayMethods.logicalNot(ex_values_2012); 
    float mean_2012 = ArrayMethods.mean(temp_2012, useVal_2012, 0, 366);
    float mean_2012_times_10 = Math.round(mean_2012*10);

    System.out.println("The average daily temperature in 2012 is " + mean_2012_times_10/10 + " degrees Celsius");


    /** 2013 data */
    String filename_2013 = (args.length > 0) ? args[0] : "CRND0103-2013-NY_Ithaca_13_E.txt";
    Scanner file_2013 = null;
    try {
      file_2013 = new Scanner(new File(filename_2013));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    int current_line_2013 = 0;
    float[] temp_2013 = new float[365];
    while (file_2013.hasNextLine()) {
      String line = file_2013.nextLine();
      String[] fields = line.split("\\s+");
      //String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      temp_2013[current_line_2013] = temperature;
      current_line_2013 += 1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    file_2013.close();
    boolean[] ex_values_2013 =  ArrayMethods.isEqualTo(temp_2013, -9999.0f);
    boolean[] useVal_2013 = ArrayMethods.logicalNot(ex_values_2013); 
    float mean_2013 = ArrayMethods.mean(temp_2013, useVal_2013, 0, 365);
    float mean_2013_times_10 = Math.round(mean_2013*10);

    System.out.println("The average daily temperature in 2013 is " + mean_2013_times_10/10 + " degrees Celsius");


    /** 2014 data */
    String filename_2014 = (args.length > 0) ? args[0] : "CRND0103-2014-NY_Ithaca_13_E.txt";
    Scanner file_2014 = null;
    try {
      file_2014 = new Scanner(new File(filename_2014));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    int current_line_2014 = 0;
    float[] temp_2014 = new float[365];
    while (file_2014.hasNextLine()) {
      String line = file_2014.nextLine();
      String[] fields = line.split("\\s+");
      //String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      temp_2014[current_line_2014] = temperature;
      current_line_2014 += 1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    file_2014.close();
    boolean[] ex_values_2014 =  ArrayMethods.isEqualTo(temp_2014, -9999.0f);
    boolean[] useVal_2014 = ArrayMethods.logicalNot(ex_values_2014); 
    float mean_2014 = ArrayMethods.mean(temp_2014, useVal_2014, 0, 365);
    float mean_2014_times_10 = Math.round(mean_2014*10);

    System.out.println("The average daily temperature in 2014 is " + mean_2014_times_10/10 + " degrees Celsius");



    /** 2015 data */
    String filename_2015 = (args.length > 0) ? args[0] : "CRND0103-2015-NY_Ithaca_13_E.txt";
    Scanner file_2015 = null;
    try {
      file_2015 = new Scanner(new File(filename_2015));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    int current_line_2015 = 0;
    float[] temp_2015 = new float[365];
    while (file_2015.hasNextLine()) {
      String line = file_2015.nextLine();
      String[] fields = line.split("\\s+");
      //String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      temp_2015[current_line_2015] = temperature;
      current_line_2015 += 1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    file_2015.close();
    boolean[] ex_values_2015 =  ArrayMethods.isEqualTo(temp_2015, -9999.0f);
    boolean[] useVal_2015 = ArrayMethods.logicalNot(ex_values_2015); 
    float mean_2015 = ArrayMethods.mean(temp_2015, useVal_2015, 0, 365);
    float mean_2015_times_10 = Math.round(mean_2015*10);

    System.out.println("The average daily temperature in 2015 is " + mean_2015_times_10/10 + " degrees Celsius");



    /** 2016 data */
    String filename_2016 = (args.length > 0) ? args[0] : "CRND0103-2016-NY_Ithaca_13_E.txt";
    Scanner file_2016 = null;
    try {
      file_2016 = new Scanner(new File(filename_2016));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    int current_line_2016 = 0;
    float[] temp_2016 = new float[366];
    while (file_2016.hasNextLine()) {
      String line = file_2016.nextLine();
      String[] fields = line.split("\\s+");
      //String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      temp_2016[current_line_2016] = temperature;
      current_line_2016 += 1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    file_2016.close();
    boolean[] ex_values_2016 =  ArrayMethods.isEqualTo(temp_2016, -9999.0f);
    boolean[] useVal_2016 = ArrayMethods.logicalNot(ex_values_2016); 
    float mean_2016 = ArrayMethods.mean(temp_2016, useVal_2016, 0, 366);
    float mean_2016_times_10 = Math.round(mean_2016*10);

    System.out.println("The average daily temperature in 2016 is " + mean_2016_times_10/10 + " degrees Celsius");




    /** 2017 data */
    String filename_2017 = (args.length > 0) ? args[0] : "CRND0103-2017-NY_Ithaca_13_E.txt";
    Scanner file_2017 = null;
    try {
      file_2017 = new Scanner(new File(filename_2017));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    int current_line_2017 = 0;
    float[] temp_2017 = new float[365];
    while (file_2017.hasNextLine()) {
      String line = file_2017.nextLine();
      String[] fields = line.split("\\s+");
      //String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      temp_2017[current_line_2017] = temperature;
      current_line_2017 += 1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    file_2017.close();
    boolean[] ex_values_2017 =  ArrayMethods.isEqualTo(temp_2017, -9999.0f);
    boolean[] useVal_2017 = ArrayMethods.logicalNot(ex_values_2017); 
    float mean_2017 = ArrayMethods.mean(temp_2017, useVal_2017, 0, 365);
    float mean_2017_times_10 = Math.round(mean_2017*10);

    System.out.println("The average daily temperature in 2017 is " + mean_2017_times_10/10 + " degrees Celsius");


    /** 2018 data */
    String filename_2018 = (args.length > 0) ? args[0] : "CRND0103-2018-NY_Ithaca_13_E.txt";
    Scanner file_2018 = null;
    try {
      file_2018 = new Scanner(new File(filename_2018));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    int current_line_2018 = 0;
    float[] temp_2018 = new float[365];
    while (file_2018.hasNextLine()) {
      String line = file_2018.nextLine();
      String[] fields = line.split("\\s+");
      //String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      temp_2018[current_line_2018] = temperature;
      current_line_2018 += 1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    file_2018.close();
    boolean[] ex_values_2018 =  ArrayMethods.isEqualTo(temp_2018, -9999.0f);
    boolean[] useVal_2018 = ArrayMethods.logicalNot(ex_values_2018); 
    float mean_2018 = ArrayMethods.mean(temp_2018, useVal_2018, 0, 365);
    float mean_2018_times_10 = Math.round(mean_2018*10);

    System.out.println("The average daily temperature in 2018 is " + mean_2018_times_10/10 + " degrees Celsius");
    

    /** 2019 data */
    String filename_2019 = (args.length > 0) ? args[0] : "CRND0103-2019-NY_Ithaca_13_E.txt";
    Scanner file_2019 = null;
    try {
      file_2019 = new Scanner(new File(filename_2019));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    int current_line_2019 = 0;
    float[] temp_2019 = new float[365];
    while (file_2019.hasNextLine()) {
      String line = file_2019.nextLine();
      String[] fields = line.split("\\s+");
      //String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      temp_2019[current_line_2019] = temperature;
      current_line_2019 += 1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    file_2019.close();
    boolean[] ex_values_2019 =  ArrayMethods.isEqualTo(temp_2019, -9999.0f);
    boolean[] useVal_2019 = ArrayMethods.logicalNot(ex_values_2019); 
    float mean_2019 = ArrayMethods.mean(temp_2019, useVal_2019, 0, 365);
    float mean_2019_times_10 = Math.round(mean_2019*10);

    System.out.println("The average daily temperature in 2019 is " + mean_2019_times_10/10 + " degrees Celsius");



    /** 2020 data */
    String filename_2020 = (args.length > 0) ? args[0] : "CRND0103-2020-NY_Ithaca_13_E.txt";
    Scanner file_2020 = null;
    try {
      file_2020 = new Scanner(new File(filename_2020));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    int current_line_2020 = 0;
    float[] temp_2020 = new float[366];
    while (file_2020.hasNextLine()) {
      String line = file_2020.nextLine();
      String[] fields = line.split("\\s+");
      //String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      temp_2020[current_line_2020] = temperature;
      current_line_2020 += 1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    file_2020.close();
    boolean[] ex_values_2020 =  ArrayMethods.isEqualTo(temp_2020, -9999.0f);
    boolean[] useVal_2020 = ArrayMethods.logicalNot(ex_values_2020); 
    float mean_2020 = ArrayMethods.mean(temp_2020, useVal_2020, 0, 366);
    float mean_2020_times_10 = Math.round(mean_2020*10);

    System.out.println("The average daily temperature in 2020 is " + mean_2020_times_10/10 + " degrees Celsius");
  }
}
