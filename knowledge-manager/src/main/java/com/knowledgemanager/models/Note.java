package com.knowledgemanager.models;

import java.time.LocalDateTime;


public class Note {

    private String title;
    private String content;
    private LocalDateTime createdDate;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.createdDate = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public LocalDateTime getCreatedDate(){
        return this.createdDate;
    }

    @Override
    public String toString(){
        return title;
    }




}
