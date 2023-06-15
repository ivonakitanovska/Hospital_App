package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.Dijagnoza;
import mk.ukim.finki.hospital.entity.exceptions.InvalidIdDijagnozaException;
import mk.ukim.finki.hospital.repository.DijagnozaRepository;
import mk.ukim.finki.hospital.repository.PregledRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DijagnozaService {
    private final DijagnozaRepository dijagnozaRepository;
    private final PregledRepository pregledRepository;

    public List<Dijagnoza> findAllDijagnozi(){
        return this.dijagnozaRepository.findAll();
    }

    public Dijagnoza findDijagnozaById(String icd_10_kod){
        return this.dijagnozaRepository.findById(icd_10_kod).orElseThrow(InvalidIdDijagnozaException::new);
    }

}
