/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

/**
 *
 * @author Teraesa
 */
public class RandomMessageInput implements MessageInput{
    private String[] messages = {
        "Hello Programmers",
        "What's going on?",
        "Hope you pass!"
    };
    
    @Override
    public String getMessage(){
        Random r = new Random(System.nanoTime());
        return messages[r.nextInt(3)];
    }
}
