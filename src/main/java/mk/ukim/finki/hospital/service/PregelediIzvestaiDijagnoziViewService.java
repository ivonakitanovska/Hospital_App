package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.PreglediIzvestaiDijagnoziView;
import mk.ukim.finki.hospital.repository.PreglediIzvestaiDijagnoziViewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PregelediIzvestaiDijagnoziViewService {
    private final PreglediIzvestaiDijagnoziViewRepository preglediIzvestaiDijagnoziViewRepository;

    public List<PreglediIzvestaiDijagnoziView> findAllPreglediIzvestaiDijagnozi(){
        return this.preglediIzvestaiDijagnoziViewRepository.findAll();
    }
}
