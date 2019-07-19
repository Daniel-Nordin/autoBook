
package com.company;

public class Book {

    private String name;
    private String author;
    private String series;
    private int serNum;
    private int width;

    public Book(String name, String author, String series, int serNum, int width){
        this.name = name;
        this.author = author;
        this.series = series;
        this.serNum = serNum;
        this.width = width;
    }

    public Book(String name, String author, int width){
        this.name = name;
        this.author = author;
        this.series = name;
        this.serNum = 1;
        this.width = width;
    }

    public int getWidth(){
        return this.width;
    }


}