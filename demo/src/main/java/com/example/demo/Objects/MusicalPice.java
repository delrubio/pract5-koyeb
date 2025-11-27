package com.example.demo.Objects;

public class MusicalPice {
    private String title;
    private String year;
    private String instrumentation;
    public Composer composer;
    

    public MusicalPice(String title, Composer composer, String year, String instrumentation) {
        this.title = title;
        this.composer = composer;
        this.year = year;
        this.instrumentation = instrumentation;
    }

    public String getTitle() {
        return title;
    }

    public Composer getComposer() {
        return composer;
    }

    public String getYear() {
        return year;
    }

    public String getInstrumentation() {
        return instrumentation;
    }
    @Override
    public String toString(){
        return this.title + ";" + this.instrumentation + ";" + this.year + " -> " + this.composer;
    }
}