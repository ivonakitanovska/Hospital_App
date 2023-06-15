package mk.ukim.finki.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Immutable
@Table(name = "izvestaj_po_pacient")
public class IzvestajPacientView {

    @Id
    @Column(name = "id_izvestaj")
    private Long idIzvestaj;

    @Column(name = "embg",  columnDefinition = "bpchar")
    private String embg;

    @Column(name = "id_pregled")
    private Long idPregled;

    @Column(name = "ime_pacient")
    private String imePacient;

    @Column(name = "prezime_pacient")
    private String prezimePacient;

    @Column(name = "osiguruvanje")
    private String osiguruvanje;

    @Column(name = "terapija")
    private String terapija;

    @Column(name = "datum_na_primanje", columnDefinition = "DATE")
    private LocalDate datumPrimanje;

}
