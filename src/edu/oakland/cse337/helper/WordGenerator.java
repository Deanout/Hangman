/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.oakland.cse337.helper;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;


/**
 *
 * @author Dean
 */
public class WordGenerator {
    private Random rand = new Random();
    private boolean condition = true;
    private String desiredWord;
    
    public String generateWord() throws IOException {
        /*
        File rootPath = new File(".");
        File target = new File(rootPath.getCanonicalPath() + File.separator + "WordList.txt");
        FileInputStream inputStream = new FileInputStream(target);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
         */
        
        while (condition) {
            int randomNum = rand.nextInt(109583 + 1);
            
            try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
                desiredWord = lines.skip(randomNum).findFirst().get();
            }
            if (desiredWord.length() < 16) {
                condition = false;
            } else {
                
            }
        }
        return desiredWord;
        
    }
}
