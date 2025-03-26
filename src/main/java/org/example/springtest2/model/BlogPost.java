package org.example.springtest2.model;

public class BlogPost {
    String id;
    String title;
    public String image;
    String content;

    public BlogPost(String id, String title, String image, String content){
        this.id = id;
        this.title = title;
        this.image = image;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }
}
