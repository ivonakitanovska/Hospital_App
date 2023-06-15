package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.Pacient;
import mk.ukim.finki.hospital.entity.Pregled;
import mk.ukim.finki.hospital.entity.exceptions.InvalidEmbgPacientException;
import mk.ukim.finki.hospital.repository.PacientRepository;
import mk.ukim.finki.hospital.repository.PregledRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PacientService {
    private final PregledRepository pregledRepository;
    private final PacientRepository pacientRepository;

    public List<Pacient> findAllPacienti(){
        return this.pacientRepository.findAll();
    }

    public Pacient findPacientById(String embg){
        return this.pacientRepository.findById(embg).orElseThrow(InvalidEmbgPacientException::new);
    }
    public List<Pregled> getPreglediForPacient(String embg) {
        boolean exists = pacientRepository.findAll().stream().anyMatch(p -> p.getEmbg().equals(embg));
        if (!exists) {
            throw new RuntimeException("Pacient with EMBG " + embg + " doesn't exist!");
        }

        return pacientRepository.findAll().stream()
                .filter(p -> p.getEmbg().equals(embg)).findFirst().get().getPregledi();
    }
}
