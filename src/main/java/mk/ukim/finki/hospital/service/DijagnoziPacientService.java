package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.DijagnoziPacientView;
import mk.ukim.finki.hospital.repository.DijagnozaPacientViewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DijagnoziPacientService {
    private final DijagnozaPacientViewRepository dijagnozaPacientViewRepository;

    public List<DijagnoziPacientView> findAllDijagnoziPacient(){
        return this.dijagnozaPacientViewRepository.findAll();
    }
}
