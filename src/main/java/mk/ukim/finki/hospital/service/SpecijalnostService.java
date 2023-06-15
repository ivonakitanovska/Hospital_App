package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.Specijalnost;
import mk.ukim.finki.hospital.entity.exceptions.InvalidIdSpecijalnostException;
import mk.ukim.finki.hospital.repository.DoktorRepository;
import mk.ukim.finki.hospital.repository.SpecijalnostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SpecijalnostService {
    private final SpecijalnostRepository specijalnostRepository;
    private final DoktorRepository doktorRepository;

    public List<Specijalnost> findAllSpecijalnosti(){
        return this.specijalnostRepository.findAll();
    }

    public Specijalnost findSpecijalnostById(Long id_specijalnost){
        return this.specijalnostRepository.findById(id_specijalnost).orElseThrow(InvalidIdSpecijalnostException::new);
    }

}
