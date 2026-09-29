/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathclasspractice;

import java.util.Random;

/**
 *
 * @author acena2028
 */
public class MathClassPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        
        
        // 1: Sine, Cosine, and Tangent
        // declare variable, assign random number 0-90 inclusive, display, and convert to radians
        int degrees = random.nextInt(91);
        System.out.print("Number: " + degrees);
        double radians = Math.toRadians(degrees);
        // find and display sin, cos, tan of radians
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        System.out.println(" Sine: " + sin + " Cosine: " + cos + " Tangent: " + tan + "\n");
        
        
        // 2: Circle Math
        // assign new double a random number 1.0-20.0 inclusive
        double radius = (Math.round(random.nextDouble(19.0) + 1.0));
        // calculate area and volume, round to 3 decimal places
        double area = Math.PI * Math.pow(radius, 2);
        area = (Math.round(area * 1000)) / 1000.000;
        double volume = (4/3) * Math.PI * Math.pow(radius, 3);
        volume = (Math.round(volume * 1000)) / 1000.000;
        // display all values, labeled
        System.out.println("Radius: " + radius + "\nArea: " + area + "\nVolume: " + volume + "\n");
        
        
        // 3: Square Root and Logarithms
        // assign new double a random number 100,000,000.0-100,000,000,000.0
        double realNum = Math.round(random.nextDouble(99900000000.0) + 100000000.0);
        // calculate square root, natural log, and Log10, round to 5 decimal places
        double sqrRoot = roundAvoid(Math.sqrt(realNum), 5);
        double natLog = roundAvoid(Math.log(realNum), 5);
        double log10 = roundAvoid(Math.log10(realNum), 5);
        // display all values, labeled
        System.out.println("Number: " + realNum + "\nSquare Root: " + sqrRoot + "\nNatural Log: " + natLog + "\nLog10: " + log10 + "\n");        
        
        
        // 4: Energy Math
        // use realNum the value of E in calculations
        // solve for  Mass (m) in E=mc^2
        double mass = (realNum / Math.pow(299792458, 2)) * 1000;
        
        
        
        
        // 5: 
        
        
        
        
        
        
        // METHODS
        // roundAvoid - round a double to a certain number of decimal places
        // value {double} - the value being rounded
        // places {int} - the number of decimal places to round to
        
    }
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
    
}
