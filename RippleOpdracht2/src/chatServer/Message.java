/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatServer;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Message implements Serializable {
    String message;
    String user;
    String recipient;
    public Message(){
        message = "Standard message";
        user = "Standard user";
    }
    public Message(String mess, String usr){
        message = mess;
        user = usr;
    }
    public String getMessage() {
        return message;
    }
    public String getUser() {
        return user;
    }
    @Override
    public String toString() {
        return getMessage();
    }
}
