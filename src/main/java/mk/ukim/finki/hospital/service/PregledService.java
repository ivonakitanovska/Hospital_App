package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.Pregled;
import mk.ukim.finki.hospital.entity.exceptions.InvalidIdPregledException;
import mk.ukim.finki.hospital.repository.DijagnozaRepository;
import mk.ukim.finki.hospital.repository.DoktorRepository;
import mk.ukim.finki.hospital.repository.PacientRepository;
import mk.ukim.finki.hospital.repository.PregledRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PregledService {
    // dijagnoza pacient doktor pregled
    private final DoktorRepository doktorRepository;
    private final PacientRepository pacientRepository;
    private final DijagnozaRepository dijagnozaRepository;
    private final PregledRepository pregledRepository;

    public List<Pregled> findAllPregledi(){
        return this.pregledRepository.findAll();
    }

    public Pregled findPregledById(Long id_pregled){
        return this.pregledRepository.findById(id_pregled).orElseThrow(InvalidIdPregledException::new);
    }

}
