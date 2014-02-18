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
public class Startup {
    public static void main(String[]args){
        MessageInput input = new KeyboardInputMessage();
        MessageOutput output = new ConsoleOutputMessage();
        
        MessageService service = new MessageService(input, output);
        service.produceMessage();
    }
}
