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

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Immutable
@Table(name = "pregledisoizvestaiidijagnozii")
public class PreglediIzvestaiDijagnoziView {

    @Id
    @Column(name = "id_pregled")
    private Long idPregled;

    @Column(name = "id_doktor")
    private Long idDoktor;

    @Column(name = "embg", columnDefinition = "bpchar")
    private String embg;

    @Column(name = "terapija")
    private String terapija;

    @Column(name = "icd_10_kod")
    private String icd_10_kod;

}
