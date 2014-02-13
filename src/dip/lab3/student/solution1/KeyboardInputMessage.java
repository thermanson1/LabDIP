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
public class KeyboardInputMessage implements MessageInput {
    private String message;

    public String getMessage() {
        Scanner keyboard = new Scanner(System.in);
        message = keyboard.nextLine();
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
