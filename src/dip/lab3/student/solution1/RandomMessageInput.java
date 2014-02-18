/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import java.util.Random;
/**
 *
 * @author Teraesa
 */
public class RandomMessageInput implements MessageInput{
    private Message[] messages = {
        new Message("I don't want to talk to you no more, you empty headed animal food trough wiper"),
        new Message("I fart in your general direction."),
        new Message("Your mother was a hamster and your father smelt of elderberries.")
    };
    
    @Override
    public Message getMessage(){
        Random msg = new Random(System.nanoTime());
        int index = msg.nextInt(messages.length);
        return messages[index];
    }
}
