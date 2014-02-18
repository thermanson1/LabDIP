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
public class Message {
    private String aStringMessage;
    
    public Message(String Msg) {
        aStringMessage = Msg;
    }

    public String getMessageAsString() {
        return aStringMessage;
    }

    public void setMessageAsString(String message) {
        this.aStringMessage = message;
    }
}
