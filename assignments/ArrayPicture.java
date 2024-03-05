/*
 * Jackson Benge
 * 329008577
 * CSCE 111-504
 * 10-11-23
 */
import java.io.File;
import java.io.FileWriter;
public class ArrayPicture {
    public static void main(String[] args) {
    //set the size of your square 600.
        int mySize = 600;
        //build 3 parallel arrays. You can rename them if you want.
        int[][] red = new int[mySize][mySize];
        int[][] green = new int[mySize][mySize];
        int[][] blue = new int[mySize][mySize];
        //and idea for createing colors  - Maroon
        int maroonR = 88;
        int maroonG = 0;
        int maroonB = 0;
        // and here is White.
        int whiteR = 255;
        int whiteG = 255;
        int whiteB = 255;
        // // blue
        // int blueR = 173;
        // int blueG = 216;
        // int blueB = 230;
        // // green
        // int greenR = 173;
        // int greenG = 255;
        // int greenB = 173;
        // // purple
        // int purpleR = 216;
        // int purpleG = 173;
        // int purpleB = 230;
        // // pink
        // int pinkR = 255;
        // int pinkG = 182;
        // int pinkB = 193;

        //----------SORT THROUGH ROWS----------//
        for(int i = 0; i < mySize; i++)
        {
            //----------SORT THROUGH COLS----------//
            for(int j = 0; j < mySize; j++)
            {
                //----------CREATE GRADIENT BACKGROUND----------//
                red[i][j] = whiteR - (i * (whiteR - maroonR) / mySize);
                // green[i][j] = whiteG - (i * (whiteG - maroonG) / mySize);
                // blue[i][j] = whiteB - (i * (whiteB - maroonB) / mySize);
            }
        }

        //symbol in the corner
        int symbolX = mySize - 20;
        int symbolY = mySize - 20;
        //yellow
        int symbolColorR = 255;
        int symbolColorG = 255;
        int symbolColorB = 100;

        // putting symbol on image
        for (int i = symbolX; i < symbolX + 10; i++) {
            for (int j = symbolY; j < symbolY + 10; j++) {
                red[i][j] = symbolColorR;
                green[i][j] = symbolColorG;
                blue[i][j] = symbolColorB;
            }
        }
        // symbol is a yellow square that stands out from the other pastel and dull colors from the white and maroon gradiant


        // when arrays are filled, send them to writeFile
        writeFile(red, green, blue, "C");

        for(int i = 0; i < mySize; i++){
            for(int j = 0; j < mySize; j++){
                int grayValue = (int) ((0.3 * red[i][j]) + (0.59 * green[i][j]) + (0.11 * blue[i][j])); //grabbing the gray value using equation provided
                red[i][j] = grayValue;
                green[i][j] = grayValue;
                blue[i][j] = grayValue;
            }
        }
        // ((0.3 * R) + (0.59 * G) + (0.11 * B))


        // when arrays are filled, send them to writeFile
        writeFile(red, green, blue, "G");
    }//end main


/**
 * Given 3 parallel arrays, Writefile will write an output
 * file in PPM format that can be viewed with a ppm viewer.
 * All 3 arrays must be the same size.
 * @param r 2 dimentional array of integers from 0 - 255
 * @param g 2 dimentional array of integers from 0 - 255
 * @param b 2 dimentional array of integers from 0 - 255
 * you do not need to edit this method
 */
    public static void writeFile(int[][] r, int[][] g, int[][] b, String outputType) {
        //the output will be based on the array size sent.
        int size = r.length;
        //pixel will store the color to be output to the file.
        String pixel;
        try {
            //open a file in the current directory. will overwrite
            //previous versions.
            String fileName = "output"+outputType+".ppm";
            File output = new File(fileName);
            FileWriter fw = new FileWriter(output);
            //create the header of PPM files.
            fw.write("P3\n"+ size + " " + size +"\n255\n");
            //write out all pixels from the RGB arrays.
            for (int i = 0; i < size ; i++) {
                for (int j = 0; j < size ; j++) {
                    pixel = String.format("%d %d %d ",r[i][j], g[i][j], b[i][j]);
                    fw.write(pixel);
                }//end for j
            }//end for i
            fw.close();
        }
        catch(Exception e) {
            System.out.println("Error writing file.");
        }//end try catch

  	} // end writeFile2
  }  // end class
