package edu.oakland.cse337;

import edu.oakland.cse337.gui.*;
import edu.oakland.cse337.helper.*;
import java.io.IOException;

/**
 * @author Dean DeHart
 * 16/09/09 Due 16/09/14
 * CSE337 Hangman Prerequisite Assignment
 * For updates see: github.com/Deanout/Hangman
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
