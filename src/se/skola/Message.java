
package se.skola;

/**
 *
 * @author rimazivkovic
 */
public class Message {
   
    private String id;
    private String date;
    private String email;
    private String message;
    

    public Message(String id, String date, String email, String message) {
        this.id = id;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Message{" + "id=" + id + ", date=" + date + ", email=" + email + ", message=" + message + '}';
    }
    
    
}
