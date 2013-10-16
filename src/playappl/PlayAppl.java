/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package playappl;


/**
 *
 * @author Rob
 */
public class PlayAppl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculate myCal = new calculate();
        Sound mySound = new Sound();
        
        System.out.print("start\n");
        System.out.print("result = " + myCal.add(5.6,7.2) + "\n");
        System.out.print("result = " + myCal.subtract(5.6,7.2) + "\n");
        System.out.print("result = " + myCal.multiply(5.6,7.2) + "\n");
        System.out.print("result = " + myCal.devide(5.6,7.2) + "\n");
     
        mySound.MakeBeeps();
    }
}
