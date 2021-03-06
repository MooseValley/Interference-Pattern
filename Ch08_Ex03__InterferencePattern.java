/*
   Author: Mike O'Malley
   Description: InterferencePattern
   My solution Example 8.3, p258-Q263.

   Structured Fortran 77 for Engineers and Scientists,
   D. M. Etter.
   (C) 1983.  ISBN: 0-8053-2520-4

My old QIT (Uni) textbook from my uni days 1983-1987 - VERY weather beaten and worn now (almost 30 years later).

Example 8.3, p258-263.

In this application, we are interested in studying the interference pattern
produced by two sinusoidal wave generators operating in phase.
Examples:
* two speakers driven by the same amplifier.
* two radio antennas powered by the same transmitter.

We have a function that defines a displacement Z that describes the interference of the sources.
If we are dealing with surface waves, Z would be the actual displacement of the surface, which could be water.
If we are talking about sound waves, Z could refer to pressure.

   R1 = distance between current point X,Y and the 1st source of interference.
      = Sqrt ((X + source1X) ^2 + (Y + source1Y) ^2)
   R2 = distance between current point X,Y and the 2nd source of interference.
      = Sqrt ((X + source1X) ^2 + (Y + source1Y) ^2)
    Z = displacement (the interference) at the current point.
      = cos (R1) + cos (R2)

Plot the interference pattern between -10 and +10 for X and Y
where the two wave sources are located at -1,-1 and +1,+1.

We want to represent the displacement Z with characters
such that the character becomes darker as the displacement increases.


*/

/*
Sample Output:

Interference Pattern: 40w x 25h
,++++++++++,,,,,,,,,,,,,,,,,,++%@#####@%
++++++++,,,,,,,,,,,,,,,,,,,,,,,,+%@####@
++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,+%@###
+++++,,,,,,,,,,,,+++++++,,,,,,,,,,,,+%##
+++,,,,,,,,,,++++%%%%%@@%%%+,,,,,,,,,,%@
++,,,,,,,,+++++%%%%%@@@####@%+,,,,,,,,,%
+,,,,,,,,++++++++++%%%%@@####@%+,,,,,,,,
,,,,,,,++++++++++,,,,,,+%%@####@%,,,,,,,
,,,,,,,+++++++,,,,,,,,,,,,+%####@%,,,,,,
,,,,,,+++++++,,,,,,,,,,,,,,,%@###@+,,,,,
,,,,,++%%%++,,,,,,,,,,,,,,,,,%@##@%,,,,,
,,,,,+%%%%++,,,,,,,,,,,,,,,,,+%@@@%+,,,,
,,,,,+%%%%+,,,,,,,++++,,,,,,,,%%@@%+,,,,
,,,,,+%@@%%,,,,,,,,++++,,,,,,,+%%%%+,,,,
,,,,,+%@@@%+,,,,,,,,,,,,,,,,,++%%%%+,,,,
,,,,,,%@##@%,,,,,,,,,,,,,,,,,++%%%++,,,,
,,,,,,+@###@%,,,,,,,,,,,,,,,+++++++,,,,,
,,,,,,,%@####%+,,,,,,,,,,,,+++++++,,,,,,
+,,,,,,,%@####@%%+,,,,,,++++++++++,,,,,,
%,,,,,,,,+%@####@@%%%%++++++++++,,,,,,,,
@%,,,,,,,,,+%@####@@@%%%%%+++++,,,,,,,,+
#@%,,,,,,,,,,+%%%@@%%%%%++++,,,,,,,,,,++
###%+,,,,,,,,,,,,+++++++,,,,,,,,,,,,++++
####@%+,,,,,,,,,,,,,,,,,,,,,,,,,,,,+++++
%@####@%+,,,,,,,,,,,,,,,,,,,,,,,,+++++++


Interference Pattern: 75w x 60h
,++++++++++++++++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+++%%@@@########@@%%+
++++++++++++++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++%%@@#########@@%
++++++++++++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++%%@@########@@
++++++++++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++%@@########@
+++++++++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+%%@@#######
+++++++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++%@@######
++++++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+%%@#####
++++++++,,,,,,,,,,,,,,,,,,,,,,,,+++++++++++,,,,,,,,,,,,,,,,,,,,,,,,+%%@####
+++++++,,,,,,,,,,,,,,,,,,,,,+++++++++++++++++++,,,,,,,,,,,,,,,,,,,,,++%@@##
++++++,,,,,,,,,,,,,,,,,,,++++++++%%%%%%%%%%%%%%+++,,,,,,,,,,,,,,,,,,,++%@@#
+++++,,,,,,,,,,,,,,,,,+++++++++%%%%%%%@@@@@@@@@%%%%++,,,,,,,,,,,,,,,,,++%@@
++++,,,,,,,,,,,,,,,,,++++++++%%%%%%%%@@@@@@@@@@@@@%%%++,,,,,,,,,,,,,,,,++%@
+++,,,,,,,,,,,,,,,,+++++++++%%%%%%%%%@@@@@@#######@@@%%+,,,,,,,,,,,,,,,,+%%
+++,,,,,,,,,,,,,,,++++++++++%%%%%%%%%%%@@@@@########@@@%++,,,,,,,,,,,,,,,+%
++,,,,,,,,,,,,,,+++++++++++++++%%%%%%%%%%@@@@#########@@%%+,,,,,,,,,,,,,,,+
+,,,,,,,,,,,,,,++++++++++++++++++++++++%%%%%@@@#########@%%+,,,,,,,,,,,,,,+
+,,,,,,,,,,,,,+++++++++++++++++++++++++++++%%%@@@########@@%+,,,,,,,,,,,,,,
,,,,,,,,,,,,,++++++++++++++++++,,,,,,,,,,,,+++%%@@########@%%+,,,,,,,,,,,,,
,,,,,,,,,,,,,++++++++++++++++,,,,,,,,,,,,,,,,,++%%@########@%%+,,,,,,,,,,,,
,,,,,,,,,,,,+++++++++++++++,,,,,,,,,,,,,,,,,,,,,+%%@@#######@%++,,,,,,,,,,,
,,,,,,,,,,,+++++++++++++++,,,,,,,,,,,,,,,,,,,,,,,++%@@######@@%+,,,,,,,,,,,
,,,,,,,,,,,+++++++++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,+%@@######@%%+,,,,,,,,,,
,,,,,,,,,,+++++++++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+%@@#####@@%+,,,,,,,,,,
,,,,,,,,,,++++%%%++++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++%@@####@@%++,,,,,,,,,
,,,,,,,,,,+++%%%%%++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+%%@@###@@%%+,,,,,,,,,
,,,,,,,,,+++%%%%%%++++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+%%@@##@@@%+,,,,,,,,,
,,,,,,,,,+++%%%%%%+++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++%@@@@@@@%++,,,,,,,,
,,,,,,,,,++%%%%%%%+++,,,,,,,,,,,,,+++,,,,,,,,,,,,,,,,,,+%%@@@@@@%++,,,,,,,,
,,,,,,,,,++%%%%%%%%++,,,,,,,,,,,,,+++++,,,,,,,,,,,,,,,,+%%@@@@@@%++,,,,,,,,
,,,,,,,,,++%%%@%%%%++,,,,,,,,,,,,,++++++,,,,,,,,,,,,,,,++%%@@@@%%++,,,,,,,,
,,,,,,,,,++%%@@@%%%++,,,,,,,,,,,,,,++++++,,,,,,,,,,,,,,++%%%@@@%%++,,,,,,,,
,,,,,,,,,++%%@@@@%%++,,,,,,,,,,,,,,,++++++,,,,,,,,,,,,,++%%%%@%%%++,,,,,,,,
,,,,,,,,,++%@@@@@@%%+,,,,,,,,,,,,,,,,+++++,,,,,,,,,,,,,++%%%%%%%%++,,,,,,,,
,,,,,,,,,++%@@@@@@%%+,,,,,,,,,,,,,,,,,,+++,,,,,,,,,,,,,+++%%%%%%%++,,,,,,,,
,,,,,,,,,++%@@@@@@@%++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+++%%%%%%+++,,,,,,,,
,,,,,,,,,,+%@@@##@@%%+,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++++%%%%%%+++,,,,,,,,
,,,,,,,,,,+%%@@###@@%%+,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++++%%%%%+++,,,,,,,,,
,,,,,,,,,,++%@@####@@%++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++++++%%%++++,,,,,,,,,
,,,,,,,,,,,+%@@#####@@%+,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+++++++++++++,,,,,,,,,
,,,,,,,,,,,+%%@######@@%+,,,,,,,,,,,,,,,,,,,,,,,,,,,+++++++++++++,,,,,,,,,,
,,,,,,,,,,,,+%@@######@@%++,,,,,,,,,,,,,,,,,,,,,,,+++++++++++++++,,,,,,,,,,
,,,,,,,,,,,,++%@#######@@%%+,,,,,,,,,,,,,,,,,,,,,+++++++++++++++,,,,,,,,,,,
,,,,,,,,,,,,,+%%@########@%%++,,,,,,,,,,,,,,,,,++++++++++++++++,,,,,,,,,,,,
,,,,,,,,,,,,,,+%%@########@@%%+++,,,,,,,,,,,,++++++++++++++++++,,,,,,,,,,,,
+,,,,,,,,,,,,,,+%@@########@@@%%%+++++++++++++++++++++++++++++,,,,,,,,,,,,,
++,,,,,,,,,,,,,,+%%@#########@@@%%%%%++++++++++++++++++++++++,,,,,,,,,,,,,,
%+,,,,,,,,,,,,,,,+%%@@#########@@@@%%%%%%%%%%+++++++++++++++,,,,,,,,,,,,,,+
@%+,,,,,,,,,,,,,,,++%@@@########@@@@@%%%%%%%%%%%++++++++++,,,,,,,,,,,,,,,++
@%%+,,,,,,,,,,,,,,,,+%%@@@#######@@@@@@%%%%%%%%%+++++++++,,,,,,,,,,,,,,,,++
#@%++,,,,,,,,,,,,,,,,++%%%@@@@@@@@@@@@@%%%%%%%%++++++++,,,,,,,,,,,,,,,,,+++
#@@%++,,,,,,,,,,,,,,,,,++%%%%@@@@@@@@@%%%%%%%+++++++++,,,,,,,,,,,,,,,,,++++
##@@%++,,,,,,,,,,,,,,,,,,,+++%%%%%%%%%%%%%%++++++++,,,,,,,,,,,,,,,,,,,+++++
###@@%++,,,,,,,,,,,,,,,,,,,,,+++++++++++++++++++,,,,,,,,,,,,,,,,,,,,,++++++
#####@%%+,,,,,,,,,,,,,,,,,,,,,,,,+++++++++++,,,,,,,,,,,,,,,,,,,,,,,,+++++++
######@%%+,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+++++++++
#######@@%++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++++++++++
@#######@@%%+,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,++++++++++++
@@########@@%++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+++++++++++++
%@@########@@%%++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+++++++++++++++
+%@@#########@@%%++,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+++++++++++++++++

*/

public class Ch08_Ex03__InterferencePattern
{
   // Constants:
   private static final double source1X = -1.0;  // Coordinates of the objects generating sound, vibration, etc.
   private static final double source1Y = -1.0;
   private static final double source2X =  1.0;
   private static final double source2Y =  1.0;
   private static final double xMin = -10.0;     // Range of X and Y to plot over.
   private static final double xMax =  10.0;
   private static final double yMin = -10.0;
   private static final double yMax =  10.0;
   private static final int outputWidthInChars  = 70; // Output plot size in chars.
   private static final int outputHeightInChars = 60;
   private static final double smallValue =  0.1;  // Also called "epsilon" in mathematics.

   private static boolean drawAxes = true; // false;

   public static String InterferencePattern ()
   {
      double R1 = 0.0;
      double R2 = 0.0;
      double Z  = 0.0;
      double X  = 0.0;
      double Y  = 0.0;
      String outString = "";
      char   outChar   = ' ';

      double xInc = (xMax - xMin) / outputWidthInChars;
      double yInc = (yMax - yMin) / outputHeightInChars;

      System.out.println ("Interference Pattern: " + outputWidthInChars + "w x " + outputHeightInChars + "h");

      Y = yMin;

      while (Y < yMax)
      {
         X = xMin;

         while (X < xMax)
         {
            // Calculate the distance between the current point X,Y and each source of interference.
            R1 = Math.sqrt ((X + source1X) * (X + source1X) + (Y + source1Y) * (Y + source1Y));

            R2 = Math.sqrt ((X + source2X) * (X + source2X) + (Y + source2Y) * (Y + source2Y));

            // Calculate the displacement (the total interference) at the current point X,Y
            Z = Math.cos (R1) + Math.cos (R2);

            if (Z <= 0.0)
               outChar = ',';
            else if (Z <= 0.5)
               outChar = '+';
            else if (Z <= 1.0)
               outChar = '%';
            else if (Z <= 1.5)
               outChar = '@';
            else if (Z <= 2.0)
               outChar = '#';

            //System.out.println (X + "\t" + Y + "\t" + Z + "\t" + outChar);

            if (drawAxes == true)
            {
               // If the inc is 0.5 athen values of X could be ... -0.5, 0, 0.5
               // and we will end up with 3 axes.
               if ((Math.abs (X) < smallValue) && (Math.abs (Y) < smallValue))
                  outChar = '+'; // The origin (0,0).
               else if (Math.abs (X) < smallValue)
                  outChar = '|'; // The Y axis.
               else if (Math.abs (Y) < smallValue)
                  outChar = '-'; // The X axis.
            }

            outString = outString + outChar;

            X = X + xInc;
         }

         outString = outString + "\n";

         Y = Y + yInc;
      }

      return outString;
   }


   public static void main (String[] args)
   {
      System.out.println (InterferencePattern ());
   }
} // public class Ch08_Ex03__InterferencePattern
