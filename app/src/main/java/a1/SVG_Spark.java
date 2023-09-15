package a1;

import java.io.*;
import java.util.Arrays;

/** Class to convert arrays to SVG images */
public class SVG_Spark {
  public static void writeSVG(float[] arr, String fname) {
    // here we are using Java utilities to find min and max
    float[] copy = Arrays.copyOf(arr, arr.length);
    Arrays.sort(copy);
    int lo = (int) copy[0] - 1;
    int hi = (int) copy[copy.length - 1] + 1;

    try {
      PrintWriter out = new PrintWriter(new FileWriter(fname));
      out.printf(
          "<svg height=\"180px\" width=\"500px\" viewBox=\"0 0 %d %d\" preserveAspectRatio=\"none\"  xmlns=\"http://www.w3.org/2000/svg\">\n",
          arr.length - 1, hi - lo);
      out.printf("<path d=\"M 0 %d ", hi);
      for (int i = 0; i < arr.length; i++) {
        out.printf("L %d %f ", i, hi - arr[i]);
      }
      out.printf("L %d %d Z\" stroke=\"transparent\" fill=\"pink\" />\n", arr.length - 1, hi);
      out.printf("<path d=\"M 0 %f ", hi - arr[0]);
      for (int i = 1; i < arr.length; i++) {
        out.printf("L %d %f ", i, hi - arr[i]);
      }
      out.printf("\" stroke-width=\"2\" stroke=\"red\" fill=\"transparent\" vector-effect=\"non-scaling-stroke\" />\n");
      out.print("</svg>");
      out.close();
    } catch (Exception e) {
      System.err.println("Problem writing SVG file: " + e);
    }
  }
}
