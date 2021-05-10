package com.hllbr.simpsonbook;

import java.io.Serializable;

public class Simpson implements Serializable {
    private String name ;
    private String job ;
    private String age ;
    private int pictureId;//resimleri id olarak aktarıcağım için bu şekilde bir tanımlama yapıyorum

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getAge() {
        return age;
    }

    public int getPictureId() {
        return pictureId;
    }

    public Simpson(String name, String job, String age, int pictureId) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.pictureId = pictureId;
    }
}
