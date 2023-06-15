package mk.ukim.finki.hospital.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.hospital.entity.Doktor;
import mk.ukim.finki.hospital.entity.Pacient;
import mk.ukim.finki.hospital.entity.Upat;
import mk.ukim.finki.hospital.repository.DoktorRepository;
import mk.ukim.finki.hospital.repository.PacientRepository;
import mk.ukim.finki.hospital.repository.UpatRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class UpatService {

    private final DoktorRepository doktorRepository;
    private final UpatRepository upatRepository;
    private final PacientRepository pacientRepository;

    public List<Upat> findAllUpati(){
        return this.upatRepository.findAll();
    }

    public Upat saveUpat(LocalDate datumIzdavanje, String embg, Long doktor_upatuva, Long doktor_upaten_kon) {
        Pacient pacient = pacientRepository.findById(embg).orElseThrow(RuntimeException::new);
        Doktor doktorUpatuva = doktorRepository.findById(doktor_upatuva).orElseThrow(RuntimeException::new);
        Doktor doktorUpatenKon = doktorRepository.findById(doktor_upaten_kon).orElseThrow(RuntimeException::new);
        return upatRepository.save(new Upat(datumIzdavanje, doktorUpatuva, doktorUpatenKon, pacient));
    }


}
