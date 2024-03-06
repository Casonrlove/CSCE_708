/*
 * Cason Love
 * 529008776
 * CSCE 708
 * 3/24
 */
import java.io.*;
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
        // Grey //
        int greyR = 225;
        int greyG = 225;
        int greyB = 225;
        // Blue //
        int blueR = 173;
        int blueG = 216;
        int blueB = 230;
        // Blue //
        int babyblueR = 204;
        int babyblueG = 255;
        int babyblueB = 255;

        //--------------------FILL 1&2 LAYERS--------------------//
        //----------SORT THROUGH ROWS----------//
        for(int i = 0; i < mySize; i++)
        {
            //----------SORT THROUGH COLS----------//
            for(int j = 0; j < mySize; j++)
            {
                //----------CREATE GRADIENT BACKGROUND----------//
                // red[i][j] = whiteR - (i * (whiteR - maroonR) / mySize);
                // green[i][j] = whiteG - (i * (whiteG - maroonG) / mySize);
                // blue[i][j] = whiteB - (i * (whiteB - maroonB) / mySize);

                //----------ROW1----------//
                if(i < 75)
                {
                    if(j < 75)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 150)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 225)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 300)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 375)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 450)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;
                        

                    }else if(j < 525)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }
                }
                //----------ROW2----------//
                else if(i < 150)
                {
                    if(j < 75)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 150)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 225)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 300)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 375)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 450)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;
                        
                    }else if(j < 525)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }
                }
                //----------ROW3----------//
                else if(i < 225)
                {
                    if(j < 75)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 150)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 225)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 300)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 375)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 450)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;
                        

                    }else if(j < 525)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }
                }
                //----------ROW4----------//
                else if(i < 300)
                {
                    if(j < 75)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 150)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 225)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 300)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 375)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 450)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;
                        
                    }else if(j < 525)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }
                }
                //----------ROW5----------//
                else if(i < 375)
                {
                    if(j < 75)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 150)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 225)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 300)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 375)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 450)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;
                        

                    }else if(j < 525)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }
                }
                //----------ROW6----------//
                else if(i < 450)
                {
                    if(j < 75)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 150)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 225)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 300)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 375)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 450)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;
                        
                    }else if(j < 525)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }
                }
                //----------ROW7----------//
                else if(i < 525)
                {
                    if(j < 75)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 150)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 225)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 300)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 375)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 450)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;
                        

                    }else if(j < 525)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }
                }
                //----------ROW8----------//
                else
                {
                    if(j < 75)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 150)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 225)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 300)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }else if(j < 375)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else if(j < 450)
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;
                        
                    }else if(j < 525)
                    {
                        red[i][j]   = maroonR;
                        green[i][j] = maroonG;
                        blue[i][j]  = maroonB;

                    }else
                    {
                        red[i][j]   = greyR;
                        green[i][j] = greyG;
                        blue[i][j]  = greyB;

                    }
                }
            }
        }

        //--------------------FILL 3rd LAYER--------------------//
        int xstart = 225;
        int ystart = 225;
        int xstop = 150;
        int ystop = 150;

        for (int i = xstart; i < xstart + xstop; i++) 
        {
            for (int j = ystart; j < ystart + ystop; j++) 
            {
                red[i][j]   = babyblueR;
                green[i][j] = babyblueG;
                blue[i][j]  = babyblueB;
            }
        }

        int corner_symbol_x = mySize - 20;
        int corner_symbol_y = mySize - 20;

        //----------SYMBOL----------//
        for (int i = corner_symbol_x; i < corner_symbol_x + 15; i++) 
        {
            for (int j = corner_symbol_y; j < corner_symbol_y + 15; j++) 
            {
                red[i][j]   = blueR;
                green[i][j] = blueG;
                blue[i][j]  = blueB;
            }
        }

        // when arrays are filled, send them to writeFile
        writeFile(red, green, blue, "C");

        //----------TURN TO GREY----------//
        for(int i = 0; i < mySize; i++)
        {
            for(int j = 0; j < mySize; j++)
            {
                int gray_value = (int) ((0.3 * red[i][j]) + (0.59 * green[i][j]) + (0.11 * blue[i][j]));
                red[i][j]   = gray_value;
                green[i][j] = gray_value;
                blue[i][j]  = gray_value;
            }
        }
        // ((0.3 * R) + (0.59 * G) + (0.11 * B)) //


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
