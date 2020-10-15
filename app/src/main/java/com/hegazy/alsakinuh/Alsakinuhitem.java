package com.hegazy.alsakinuh;

import java.io.Serializable;

public class Alsakinuhitem implements Serializable {
    public String author_name;
    public String type;
    public String roqia_url;


    public Alsakinuhitem(String author_name, String type, String roqia_url) {
        this.author_name = author_name;
        this.type = type;
        this.roqia_url = roqia_url;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRoqia_url() {
        return roqia_url;
    }

    public void setRoqia_url(String roqia_url) {
        this.roqia_url = roqia_url;
    }
}
