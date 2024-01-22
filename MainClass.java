import java.util.Scanner;
import java.lang.*;
public class MainClass {
    double[] xcoords;
    double[] ycoords;

    public static void main(String[] args) {
        //create instances of classes
        PlotPoints myPlots = new PlotPoints();
        MainClass myMain = new MainClass();

        //initialize coordinates
        myMain.xcoords = new double[5];
        myMain.ycoords = new double[5];

        //put values into coordinates
        for (int i = 0; i < 5; i++) {
            myMain.xcoords[i] = Math.random() * 1000; //Random number
            myMain.ycoords[i] = Math.random() * 1000;
        }

        //Create a plotter. Plot
        //to draw points defined by: (xcoords[i],ycoords[i])
        myPlots.drawPoints(myMain.xcoords, myMain.ycoords);

        //Please do this!
    }
}