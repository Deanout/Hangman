package edu.oakland.cse337;

import edu.oakland.cse337.gui.*;
import edu.oakland.cse337.helper.*;
import java.io.IOException;

/**
 * @author Dean DeHart
 * 16/09/09 Due 16/09/14
 * Hangman Prerequisite Assignment
 */
public class Hangman {
    // The Game's GUI object.
    private static final HangmanGUI gui = new HangmanGUI();
    // The controller that contains the majority of game logic code.
    public static final HangmanController controller = new HangmanController(gui);
    
    public static void main(String[] args) throws IOException {
       // Initializes the display class to a string of X's.
       controller.initializeDisplayText();
       // Sets the keyboard to disabled at the start of the program.
       // This is run again whenever the game is stopped.
       gui.initGameState(false);
       // Sets the name in the titlebar of the program.
       gui.setTitle("CSE 337 Hangman Prerequisite Assignment");
    }
    
    
}
