package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.Lekovi;
import mk.ukim.finki.hospital.entity.exceptions.InvalidIdLekException;
import mk.ukim.finki.hospital.repository.LekoviRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LekoviService {
    private final LekoviRepository lekoviRepository;

    public List<Lekovi> findAllLekovi(){
        return this.lekoviRepository.findAll();
    }

    public Lekovi findLekById(Long id_lek){
        return this.lekoviRepository.findById(id_lek).orElseThrow(InvalidIdLekException::new);
    }

}
