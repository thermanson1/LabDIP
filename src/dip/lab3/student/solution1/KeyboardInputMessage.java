/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import java.util.Scanner;
/**
 *
 * @author Teraesa
 */
public class KeyboardInputMessage {
    private String message;
    
    Scanner keyboard = new Scanner(System.in);
    
    public KeyboardInputMessage(MessageService e){
        
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
