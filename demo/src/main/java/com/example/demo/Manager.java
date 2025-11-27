package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Objects.Composer;
import com.example.demo.Objects.MusicalPice;

public class Manager {
    // THE INSTANCE OF THE CLASS. NOTICE THE STATIC, very important
    private static Manager instance = null;

    private List<MusicalPice> dataListPiece;
    private List<Composer> dataListComp;

    // THE GETTER OF THE INSTANCE. NOTICE THE STATIC, very important
    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    // THE PRIVATE CONSTRUCTOR
    private Manager() {
        initialize();
    }

    // AN AUXILIAR METHOD WE WILL USE TO THE INITIALIZATION OF THE DATA.
    /*
     * IN THE ASSESMENT, FIRST YOU WILL HARD CODE HERE THE COMPOSERS AND
     * LATER YOU WILL REPLACE THAT CODE FOR A MORE ELEGANT WAY
     * TO INITIALIZE THE DATA THROUGH FILES AND PARSING
     */
    private void initialize() {
        //dataListPiece = CSVUtil.readCSV("src/main/resources/data/composer.csv");
        dataListPiece = getMockUpList();
        dataListComp = getMockUpListComp();
        
    }

    // GETTER OF THE DATA WE NEED TO SHARE AMONG THE CLASSES
    public List<MusicalPice> getdataListPiece() {
        return this.dataListPiece;
    }

    public List<Composer> getdataListComp() {
        return this.dataListComp;
    }

    public static List<MusicalPice> getMockUpList(){
        List<MusicalPice> mockList = new ArrayList<>();
        /* 
         * List<Composer> composerList = new ArrayList();
         * POR CADA COMPOSITOR
         * Composer micomposer = new Composer(bla, bla, bla); //sin lista de piezas
         * List<MusicalPiece> repertorio = new ArrayList();
         * repertorio.add(new MusicalPiece(bla, bla, bla));
         * micomposer.setRepertorio(repertorio);
         * 
         * composerList.add(micomposer);
        */

        Composer FrédéricChopin = new Composer("Frédéric Chopin", "Frédéric Chopin fue un compositor y virtuoso pianista polaco del periodo romántico, conocido por sus obras para piano solo que destacan por su lirismo, complejidad armónica y expresividad.", LocalDate.of(1810, 3, 1), LocalDate.of(1849, 10, 17), "Polaco", "Żelazowa Wola, Ducado de Varsovia (actual Polonia)", "París, Francia");
        Composer WolfgangAmadeusMozart = new Composer("Wolfgang Amadeus Mozart", "Mozart fue un prolífico y revolucionario compositor austríaco del periodo clásico, cuya música influyó profundamente en el desarrollo del estilo occidental con obras maestras en prácticamente todos los géneros.", LocalDate.of(1756, 1, 27), LocalDate.of(1791, 12, 5), "Austriaco", "Salzburgo, Sacro Imperio Romano Germánico (actual Austria)", "Viena, Austria");
        Composer GustavMahler = new Composer("Gustav Mahler", "Gustav Mahler fue un compositor y director de orquesta austriaco, conocido por sus sinfonías monumentales y su intensa exploración emocional a través de la música. Es considerado un puente entre el romanticismo y la música del siglo XX.", LocalDate.of(1860, 7, 7), LocalDate.of(1911, 5, 18), "Austriaco", "Kaliště, Imperio austríaco (actual República Checa)", "Viena, Austria");
        Composer ÓlafurArnalds = new Composer("Ólafur Arnalds", "Ólafur Arnalds es un compositor, multiinstrumentista y productor islandés que mezcla música clásica, electrónica y ambiental, destacando por su uso emocional del piano, cuerdas y sintetizadores.", LocalDate.of(1986, 11, 3), null, "Islandés", "Mosfellsbær, Islandia", null);

        MusicalPice piece1 = new MusicalPice("Nocturne in E-flat major, Op. 9 No. 2", FrédéricChopin, "1832", "Solo Piano");
        MusicalPice piece2 = new MusicalPice("Ballade No. 1 in G minor, Op. 23", FrédéricChopin, "1835", "Solo Piano");
        MusicalPice piece3 = new MusicalPice("Etude Op. 10 No. 5 'Black Key'", FrédéricChopin, "1830", "Solo Piano");
        MusicalPice piece4 = new MusicalPice("Polonaise in A major, Op. 40 No. 1 'Military'", FrédéricChopin, "1838", "Solo Piano");
        MusicalPice piece5 = new MusicalPice("Prelude in D-flat major, Op. 28 No. 15 'Raindrop'", FrédéricChopin, "1839", "Solo Piano");
        
        MusicalPice piece6 = new MusicalPice("Symphony No. 40 in G minor, K. 550", WolfgangAmadeusMozart, "1788", "Orchestra");
        MusicalPice piece7 = new MusicalPice("Piano Concerto No. 21 in C major, K. 467", WolfgangAmadeusMozart, "1785", "Piano and Orchestra");
        MusicalPice piece8 = new MusicalPice("Requiem in D minor, K. 626", WolfgangAmadeusMozart, "1791", "Choir and Orchestra");
        MusicalPice piece9 = new MusicalPice("Eine kleine Nachtmusik, K. 525", WolfgangAmadeusMozart, "1787", "String Ensemble");
        MusicalPice piece10 = new MusicalPice("The Magic Flute, K. 620", WolfgangAmadeusMozart, "1791", "Opera");
        
        MusicalPice piece11 = new MusicalPice("Symphony No. 1 in D major 'Titan'", GustavMahler, "1888", "Large Orchestra");
        MusicalPice piece12 = new MusicalPice("Symphony No. 2 in C minor 'Resurrection'", GustavMahler, "1894", "Choir and Large Orchestra");
        MusicalPice piece13 = new MusicalPice("Kindertotenlieder", GustavMahler, "1904", "Voice and Orchestra");
        MusicalPice piece14 = new MusicalPice("Das Lied von der Erde", GustavMahler, "1909", "Tenor, Alto (or Baritone), and Orchestra");
        MusicalPice piece15 = new MusicalPice("Symphony No. 5 in C-sharp minor", GustavMahler, "1902", "Large Orchestra");

        MusicalPice piece16 = new MusicalPice("Near Light", ÓlafurArnalds, "2011", "Piano, Strings, and Electronics");
        MusicalPice piece17 = new MusicalPice("Saman", ÓlafurArnalds, "2018", "Piano and Strings");
        MusicalPice piece18 = new MusicalPice("re:member", ÓlafurArnalds, "2018", "Piano, Strings, Synthesizers");
        MusicalPice piece19 = new MusicalPice("So Far", ÓlafurArnalds, "2010", "Piano and Electronics");
        MusicalPice piece20 = new MusicalPice("Þú ert jörðin", ÓlafurArnalds, "2009", "Strings and Electronics");

        mockList.add(piece1);
        mockList.add(piece2);
        mockList.add(piece3);
        mockList.add(piece4);
        mockList.add(piece5);
        mockList.add(piece6);
        mockList.add(piece7);
        mockList.add(piece8);
        mockList.add(piece9);
        mockList.add(piece10);
        mockList.add(piece11);
        mockList.add(piece12);
        mockList.add(piece13);
        mockList.add(piece14);
        mockList.add(piece15);
        mockList.add(piece16);
        mockList.add(piece17);
        mockList.add(piece18);
        mockList.add(piece19);
        mockList.add(piece20);

        return mockList;
    }

    public static List<Composer> getMockUpListComp(){
        List<Composer> mockList = new ArrayList<>();
        
        Composer FrédéricChopin = new Composer("FrédéricChopin", "Frédéric Chopin fue un compositor y virtuoso pianista polaco del periodo romántico, conocido por sus obras para piano solo que destacan por su lirismo, complejidad armónica y expresividad.", LocalDate.of(1810, 3, 1), LocalDate.of(1849, 10, 17), "Polaco", "Żelazowa Wola, Ducado de Varsovia (actual Polonia)", "París, Francia");
        Composer WolfgangAmadeusMozart = new Composer("WolfgangAmadeusMozart", "Mozart fue un prolífico y revolucionario compositor austríaco del periodo clásico, cuya música influyó profundamente en el desarrollo del estilo occidental con obras maestras en prácticamente todos los géneros.", LocalDate.of(1756, 1, 27), LocalDate.of(1791, 12, 5), "Austriaco", "Salzburgo, Sacro Imperio Romano Germánico (actual Austria)", "Viena, Austria");
        Composer GustavMahler = new Composer("GustavMahler", "Gustav Mahler fue un compositor y director de orquesta austriaco, conocido por sus sinfonías monumentales y su intensa exploración emocional a través de la música. Es considerado un puente entre el romanticismo y la música del siglo XX.", LocalDate.of(1860, 7, 7), LocalDate.of(1911, 5, 18), "Austriaco", "Kaliště, Imperio austríaco (actual República Checa)", "Viena, Austria");
        Composer ÓlafurArnalds = new Composer("ÓlafurArnalds", "Ólafur Arnalds es un compositor, multiinstrumentista y productor islandés que mezcla música clásica, electrónica y ambiental, destacando por su uso emocional del piano, cuerdas y sintetizadores.", LocalDate.of(1986, 11, 3), null, "Islandés", "Mosfellsbær, Islandia", null);

        mockList.add(FrédéricChopin);
        mockList.add(WolfgangAmadeusMozart);
        mockList.add(GustavMahler);
        mockList.add(ÓlafurArnalds);

        return mockList;
    }

    /* 
     * Lista de compositores y dentro de cada compositor, una lista de sus obras
    */
}
