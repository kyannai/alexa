package com.kyan.chatbot.lexmodel.response;

public class Message {
    public static final String TYPE_PLAIN_TEXT = "PlainText";
    public static final String TYPE_SSML = "SSML";

    private String contentType;
    private String content;

    public Message(String content, String contentType){
        this.content = content;
        this.contentType = contentType;
    }

    public Message() {
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
