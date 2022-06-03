package edu.upc.dsa.models;

public class Consult {
    private String date;
    private String title;
    private String message;



    private String sender;
    public Consult() {
    }

    public Consult(String date, String title, String message) {
        this();
        this.setDate(date);
        this.setTitle(title);
        this.setMessage(message);
    }

    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }


}
