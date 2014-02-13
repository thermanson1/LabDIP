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
    private String[] messages = {
        "I don't want to talk to you no more, you empty headed animal food trough wiper",
        "I fart in your general direction.",
        "Your mother was a hamster and your father smelt of elderberries."
    };
    
    @Override
    public String getMessage(){
        Random r = new Random(System.nanoTime());
        return messages[r.nextInt(3)];
    }
}
