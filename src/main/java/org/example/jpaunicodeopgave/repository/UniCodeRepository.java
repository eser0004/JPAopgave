package org.example.jpaunicodeopgave.repository;


import org.example.jpaunicodeopgave.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniCodeRepository extends JpaRepository<Unicode, Integer> {

}
