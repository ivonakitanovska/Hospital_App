package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.Oddel;
import mk.ukim.finki.hospital.entity.exceptions.InvalidIdOddelException;
import mk.ukim.finki.hospital.repository.OddelRepository;
import mk.ukim.finki.hospital.repository.SpecijalnostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OddelService {
    private final OddelRepository oddelRepository;
    private final SpecijalnostRepository specijalnostRepository;

    public List<Oddel> findAllDijagnozi(){
        return this.oddelRepository.findAll();
    }

    public Oddel findOddelById(Long id_oddel){
        return this.oddelRepository.findById(id_oddel).orElseThrow(InvalidIdOddelException::new);
    }

}
