package com.example.demo.Controllers;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.Manager;
import com.example.demo.Objects.Composer;

@Controller
public class AppComtroller {

    @GetMapping("/")
    public String indexView() {
        return "index";
    }

    @GetMapping("/composer")
    public String composerView(Model model) {
        Manager instance = Manager.getInstance();
        model.addAttribute("lista", instance.getdataListComp());
        return "composerView";
    }

    @GetMapping("/composer/{composerUrlInput}")
    public String composerViewSearch(@PathVariable String composerUrlInput, Model model) {
        model.addAttribute("lista", getComposerList(composerUrlInput, null));
        return "searchComposerView";
    }

    @GetMapping("/compare-composer")
    public String compareComposerView(Model model) {
        Manager instance = Manager.getInstance();
        model.addAttribute("lista", instance.getdataListComp());
        return "composerCompareView";
    }

    @GetMapping("/compare-composer/{composer1}/{composer2}")
    public String olderComposerView(@PathVariable String composer1, String composer2, Model model) {
        int edad1 = 0;
        int edad2 = 0;

        for (Composer comp : getComposerList(composer1, composer2)) {
            if (comp.getDod() == null && comp.getNameComposer().equals(composer1)) {
                edad1 = Period.between(comp.getDob(), LocalDate.now()).getYears();
            }else {
                int anos = Period.between(comp.getDob(), LocalDate.now()).getYears();
                int resta = Period.between(comp.getDod(), LocalDate.now()).getYears();
                edad1 = anos - resta;
            }

            if (comp.getDod() == null && comp.getNameComposer().equals(composer2)) {
                edad2 = Period.between(comp.getDob(), LocalDate.now()).getYears();
            }else {
                int anos = Period.between(comp.getDob(), LocalDate.now()).getYears();
                int resta = Period.between(comp.getDod(), LocalDate.now()).getYears();
                edad2 = anos - resta;
            }

            if (edad1 != 0) {
                if (edad2 != 0 && edad2 > edad1) {
                    model.addAttribute("compOlder", comp);
                }else if (edad2 != 0 && edad2 < edad1) {
                    model.addAttribute("compOlder", comp);
                }
            }
        }
        return "whoIsOlderView";
    }

    @GetMapping("/pieces")
    public String musicalPiceView(Model model) {
        Manager instance = Manager.getInstance();
        model.addAttribute("lista", instance.getdataListPiece());
        return "musicalPiceView";
    }

    public ArrayList<Composer> getComposerList(String composerUrlInput1, String composerUrlInput2) {

        Manager instance = Manager.getInstance();
        ArrayList<Composer> composerList = new ArrayList<>();

        if (composerUrlInput1 != null && composerUrlInput2 == null) {
            for (Composer comp : instance.getdataListComp()) {
            if (comp.getNameComposer().equals(composerUrlInput1) | comp.getNacionality().equals(composerUrlInput1)) {
                composerList.add(comp);
            }
        }
        } else if (composerUrlInput1 != null && composerUrlInput2 != null) {
            for (Composer comp : instance.getdataListComp()) {
                if (comp.getNameComposer().equals(composerUrlInput1) | comp.getNameComposer().equals(composerUrlInput2)) {
                    composerList.add(comp);
                }
            }
        }

        return composerList;
    }

}