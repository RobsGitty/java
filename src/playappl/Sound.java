/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package playappl;

import java.awt.Toolkit;

/**
 *
 * @author Rob
 */
public class Sound {
    private Toolkit toolkit;
    
    void MakeBeeps() {
        toolkit = Toolkit.getDefaultToolkit();
        //int numbeeps = 1;

    //    for(int x = 0; x < numbeeps; x++) {
//   this works , inline         java.awt.Toolkit.getDefaultToolkit().beep();
            toolkit.beep();
     //   }
    }
    
    void MakeNoise() {
  /*  byte[] buf = new byte[ 1 ];;
    AudioFormat af = new AudioFormat( (float )44100, 8, 1, true, false );
    SourceDataLine sdl = AudioSystem.getSourceDataLine( af );
    sdl = AudioSystem.getSourceDataLine( af );
    sdl.open( af );
    sdl.start();
    for( int i = 0; i < 1000 * (float )44100 / 1000; i++ ) {
        double angle = i / ( (float )44100 / 440 ) * 2.0 * Math.PI;
        buf[ 0 ] = (byte )( Math.sin( angle ) * 100 );
        sdl.write( buf, 0, 1 );
    }
    sdl.drain();
    sdl.stop();
    sdl.close();*/
    }
    
}
