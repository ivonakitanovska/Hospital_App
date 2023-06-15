package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.LekoviPoTromesecijaView;
import mk.ukim.finki.hospital.repository.LekoviPoTromesecijaViewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LekoviPoTromesecijaViewService {
    private final LekoviPoTromesecijaViewRepository lekoviPoTromesecijaViewRepository;

    public List<LekoviPoTromesecijaView> findAllLekoviPoTromesecija(){
        return this.lekoviPoTromesecijaViewRepository.findAll();
    }
}
