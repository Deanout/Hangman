package edu.oakland.cse337;

import edu.oakland.cse337.gui.*;
import edu.oakland.cse337.helper.*;
import java.io.IOException;
/**
 * @author Dean DeHart
 * 16/09/09 Due 16/09/14
 * CSE337 Hangman Prerequisite Assignment
 * For updates see: github.com/Deanout/Hangman
 * The executable jar can be found at /Hangman/dist/Hangman.jar
 * 
 * If code submitted seems similar to mine, check previous versions of the github repositry.
 * I have noticed the code on a few computers in class, which may be why there's extreme similarities.
 * Dr. Patel has said this is acceptable as long as I allow it, which I have.
 * ********************************
 * Notes On Compilation:
 * If you're attempting to compile the code, there are native Netbeans libraries
 * required for the GUI elements. You will receive errors unless you compile with Netbeans.
 * ********************************
 */
public class Hangman {
    // The Game's GUI object.
    private static final HangmanGUI gui = new HangmanGUI();
    // The controller that contains the majority of game logic code.
    public static final HangmanController controller = new HangmanController(gui);
    
    public static void main(String[] args) throws IOException {
       // Sets the name in the titlebar of the program.
       gui.setTitle("CSE 337 Hangman Prerequisite Assignment");
    }
}
