package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.Izvestaj;
import mk.ukim.finki.hospital.entity.exceptions.InvalidIdIzvestajException;
import mk.ukim.finki.hospital.repository.IzvestajRepository;
import mk.ukim.finki.hospital.repository.PregledRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IzvestajService {
    private final IzvestajRepository izvestajRepository;
    private final PregledRepository pregledRepository;

    public List<Izvestaj> findAllIzvestai(){
        return this.izvestajRepository.findAll();
    }

    public Izvestaj findIzvestajById(Long id_izvestaj){
        return this.izvestajRepository.findById(id_izvestaj).orElseThrow(InvalidIdIzvestajException::new);
    }

}
