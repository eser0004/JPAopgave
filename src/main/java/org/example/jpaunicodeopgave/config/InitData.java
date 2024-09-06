package org.example.jpaunicodeopgave.config;

import org.example.jpaunicodeopgave.model.Unicode;
import org.example.jpaunicodeopgave.repository.UniCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UniCodeRepository uniCodeRepository;

    @Override
    public void run(String... args) throws Exception {
        Unicode a1 = new Unicode();

    }



    private void initializeUnicodeCharacters() {
        Set<Character> characters = new HashSet<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            characters.add(c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            characters.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            characters.add(c);
        }

        //  gemmer character i databasen
        for (Character character : characters) {
            Unicode unicode1 = new Unicode();
            unicode1.setUnicode((int) character);
            unicode1.setBogstav(character);
            unicode1.setDescription("Kurder");
            unicode1.setName("magaaa " + character);

            uniCodeRepository.save(unicode1); // Gemmer i databasen

        }
    }
}
