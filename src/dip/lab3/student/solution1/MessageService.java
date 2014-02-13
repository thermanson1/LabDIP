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
public class MessageService {
    private MessageInput messageInput;
    private MessageOutput messageOutput;
    public void transmitMessage(){
        
    }

    public MessageService(MessageInput messageInput, MessageOutput messageOutput) {
        this.messageInput = messageInput;
        this.messageOutput = messageOutput;
    }

    public MessageInput getMessageInput() {
        return messageInput;
    }

    public void setMessageInput(MessageInput messageInput) {
        this.messageInput = messageInput;
    }

    public MessageOutput getMessageOutput() {
        return messageOutput;
    }

    public void setMessageOutput(MessageOutput messageOutput) {
        this.messageOutput = messageOutput;
    }
    
}
