package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.UpatDoktorDenesenView;
import mk.ukim.finki.hospital.repository.UpatDoktorDenesenViewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UpatDoktorDenesenViewService {

    private final UpatDoktorDenesenViewRepository upatDoktorDenesenViewRepository;

    public List<UpatDoktorDenesenView> findAllUpatDoktorDenesen(){
        return this.upatDoktorDenesenViewRepository.findAll();
    }
}
