package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.Recepta;
import mk.ukim.finki.hospital.entity.exceptions.InvalidIdReceptaException;
import mk.ukim.finki.hospital.repository.LekoviRepository;
import mk.ukim.finki.hospital.repository.PregledRepository;
import mk.ukim.finki.hospital.repository.ReceptaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReceptaService {
    // pregled lekovi recepta
    private final PregledRepository pregledRepository;
    private final LekoviRepository lekoviRepository;
    private final ReceptaRepository receptaRepository;

    public List<Recepta> findAllRecepti(){
        return this.receptaRepository.findAll();
    }

    public Recepta findReceptaById(Long id_recept){
        return this.receptaRepository.findById(id_recept).orElseThrow(InvalidIdReceptaException::new);
    }

}
