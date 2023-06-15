package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.Doktor;
import mk.ukim.finki.hospital.entity.Pregled;
import mk.ukim.finki.hospital.entity.Upat;
import mk.ukim.finki.hospital.entity.exceptions.InvalidIdDoctorException;
import mk.ukim.finki.hospital.repository.DoktorRepository;
import mk.ukim.finki.hospital.repository.PregledRepository;
import mk.ukim.finki.hospital.repository.SpecijalnostRepository;
import mk.ukim.finki.hospital.repository.UpatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DoktorService {
    //doktor upat pregled specijalnost
    private final DoktorRepository doktorRepository;
    private final UpatRepository upatRepository;
    private final PregledRepository pregledRepository;
    private final SpecijalnostRepository specijalnostRepository;

    public List<Doktor> findAllDoktori(){
        return this.doktorRepository.findAll();
    }

    public Doktor findDoktorById(Long id_doktor){
        return this.doktorRepository.findById(id_doktor).orElseThrow(InvalidIdDoctorException::new);
    }
    public List<Upat> getUpatiForLekar(Long lekarId) {
        boolean exists = doktorRepository.existsById(lekarId);
        if (!exists) {
            throw new RuntimeException("Lekar with id " + lekarId + " doesn't exist!");
        }

        return doktorRepository.findById(lekarId).get().getPrimeniUpati();
    }
    public List<Pregled> getPreglediForLekar(Long lekarId) {
        boolean exists = doktorRepository.existsById(lekarId);
        if (!exists) {
            throw new RuntimeException("Lekar with id " + lekarId + " doesn't exist!");
        }

        return doktorRepository.findById(lekarId).get().getPregledi();
    }
}
