package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.NerealiziraniReceptiPacientView;
import mk.ukim.finki.hospital.repository.NerealiziraniReceptiPacientViewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NerealiziraniUpatiPoPacientService {
    private final NerealiziraniReceptiPacientViewRepository nerealiziraniReceptiPacientViewRepository;

    public List<NerealiziraniReceptiPacientView> findAllNerealiziraniUpati(){
        return this.nerealiziraniReceptiPacientViewRepository.findAll();
    }

}
