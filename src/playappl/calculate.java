/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package playappl;

/**
 *
 * @author Rob
 */
public class calculate {
    
    public double result;
    
    double add(double a, double b) {
        System.out.print("actual add routine");
        result = a + b;
        return result;
    }

    double subtract(double a, double b) {
        System.out.print("actual subtract routine");
        result = a - b;
        return result;
    }
        
    double multiply(double a, double b) {
        System.out.print("actual multiply routine");
        result = a * b;
        return result;
    }
    
    double devide(double a, double b) {
        System.out.print("actual devide routine");
        result = a / b;
        return result;
    }
    
}
