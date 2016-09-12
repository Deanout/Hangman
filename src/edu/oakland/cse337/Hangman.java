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
    private static final HangmanGUI gui = new HangmanGUI();
    public static final HangmanController controller = new HangmanController(gui);
    
    public static void main(String[] args) throws IOException {
       controller.initializeDisplayText();
       gui.initGameState(false);
    }
    
    
}
