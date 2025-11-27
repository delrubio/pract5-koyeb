package com.example.demo.Objects;

import java.time.LocalDate;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Composer {
    private String nameComposer;
    private String biography;
    private LocalDate dob;
    private LocalDate dod;
    private String nacionality;
    private String bPlace;
    private String dPlace;
    
    public ArrayList<MusicalPice> picesList = new ArrayList<>();

    public Composer(String nameComposer, String biography, LocalDate dob, String nacionality, String bPlace, ArrayList<MusicalPice> picesList){
        this.nameComposer = nameComposer;
        this.biography = biography;
        this.dob = dob;
        this.nacionality = nacionality;
        this.bPlace = bPlace;
        this.picesList = picesList;
    }

    public Composer(String nameComposer, String biography, LocalDate dob, LocalDate dod, String nacionality, String bPlace, String dPlace, ArrayList<MusicalPice> picesList){
        this.nameComposer = nameComposer;
        this.biography = biography;
        this.dob = dob;
        this.dod = dod;
        this.nacionality = nacionality;
        this.bPlace = bPlace;
        this.dPlace = dPlace;
        this.picesList = picesList;
    }

    public Composer(String nameComposer, String biography, LocalDate dob, String nacionality, String bPlace){
        this.nameComposer = nameComposer;
        this.biography = biography;
        this.dob = dob;
        this.nacionality = nacionality;
        this.bPlace = bPlace;
    }

    public Composer(String nameComposer, String biography, LocalDate dob, LocalDate dod, String nacionality, String bPlace, String dPlace){
        this.nameComposer = nameComposer;
        this.biography = biography;
        this.dob = dob;
        this.dod = dod;
        this.nacionality = nacionality;
        this.bPlace = bPlace;
        this.dPlace = dPlace;
    }
    
}
