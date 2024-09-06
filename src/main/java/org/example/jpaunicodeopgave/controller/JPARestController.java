package org.example.jpaunicodeopgave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JPARestController {


    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char) i;
        return "unicode=" + i + " char=" + c;
    }
    /* note til mig selv----
        husk getmapping er et endpoint, så det vi laver er en metode til at finde char'en " i "'s
        unicode værdi. så vores endpoint er ikke localhost:8080/unicode/i, men derimod dens unicode værdi
        som er localhost:8080/unicode/97

     */

    // Første opgave, skriv et endpoint der gør det modsatte end ovenstående
    // tag en char som parameter og skrive unicoden ud

    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {
        int unicode = (int) c;
        return "char=" + c + " unicode=" + unicode;

    }
        // det er stortset en omregner, øv det mer.

    // Endpoint til at få et antal bogstaver startende med et bestemt bogstav
    @GetMapping("/sequence")
    public List<Character> getCharactersStartingFrom(
            @RequestParam char startChar,
            @RequestParam int count) {
        List<Character> result = new ArrayList<>();
        // Generer en sekvens af bogstaver startende fra 'startChar'
        for (int i = 0; i < count; i++) {
            result.add((char) (startChar + i));
        }

        return result;

    }
    //endpointet er: http://localhost:8080/sequence?startChar=a&count=10
    // startchar = a, betyder at den unicodesne starter fra a, der kunne i princippet stå z eller andet.
    //count=10 betyder at den udprinter fra a, så 10 (symboler) frem. Kan skrive 2400 for at få vist så mange
    // prøv og find ud af hvordan du kan få printet noget med unicode værdien 2400, 1 gang
    }


