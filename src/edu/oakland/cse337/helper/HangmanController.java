/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.oakland.cse337.helper;

import edu.oakland.cse337.gui.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * @author Dean
 */
public class HangmanController {
    private String answer;
    private char[] display;
    private final HangmanGUI gui;
    private Random rand = new Random();
    private boolean condition = true;
    private String desiredWord;
    private int guessCounter;
    
    public void generateWord() throws IOException {
        
        while (condition) {
            int randomNum = rand.nextInt(109563 + 1);
            
            try (Stream<String> lines = Files.lines(Paths.get("wordlist.txt"))) {
                desiredWord = lines.skip(randomNum).findFirst().get();
            }
            if (desiredWord.length() < 16) {
                condition = false;
            } else {
                
            }
        }
        answer = desiredWord;
        condition = true;
    }
    
    public HangmanController(HangmanGUI inputGUI) {
        this.gui = inputGUI;
        initializeDisplayText();
    }
            
    public void userGuess(char input) {
        
        for (int i = 0; i < answer.length(); i++) {
            if (Character.toLowerCase(answer.charAt(i)) == Character.toLowerCase(input)) {
                display[i] = input;
            }
        }
        updateDisplayText(display);
        incrementGuessCounter();
        gui.setGuessCounterLabel(guessCounter + " tries");
    }
    
    public void initializeDisplayText() {
        display = new char[15];
        for (int i = 0; i < display.length; i++) {
            display[i] = 'X';
        }
        gui.setDisplayText(updateDisplayText(display));
    }
    
    public void newGame() {
        try {
            generateWord();
        } catch (IOException ex) {
            Logger.getLogger(HangmanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        display = new char[answer.length()];
        for (int i = 0; i < display.length; i++) {
            display[i] = '_';
        }
        gui.setDisplayText(updateDisplayText(display));
    }
    

    public String updateDisplayText(char[] input) {
        char[] constructedInput = new char[input.length * 2];

        for (int i = 0; i < constructedInput.length; i += 2) {
            constructedInput[i] = input[i / 2];
            constructedInput[i + 1] = ' ';
        }
        String text = new String(constructedInput);
        gui.setDisplayText(text);
        return text;
    }    
    
    public char[] getDisplayText() {
        return display;
    }
    public String getAnswer() {
        return answer;
    }
    public int getGuessCounter() {
        return guessCounter;
    }
    public void setGuessCounter(int input) {
        guessCounter = input;
    }
    public void incrementGuessCounter() {
        guessCounter += 1;
    }
    
}
