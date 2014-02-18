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
    

    public Message getMessage() {
        Scanner keyboard = new Scanner(System.in);
        String message = keyboard.nextLine();
        Message newMsg = new Message(message);
        return newMsg;
    }

    
    
    
}
