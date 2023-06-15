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
@Table(name = "upat_doktor_denes_den")
public class UpatDoktorDenesenView {

    @Id
    @Column(name = "id_upat")
    private Long idUpat;

    @Column(name = "ime_upat")
    private String ime;

    @Column(name = "prezime_upat")
    private String prezime;

    @Column(name = "id_doktor_upatuva")
    private Long idDoktorUpatuva;

    @Column(name = "id_doktor_upateni_kon")
    private Long idDoktorUpateniKon;

    @Column(name = "embg", columnDefinition = "bpchar")
    private String embg;

    @Column(name = "datum_izdavanje", columnDefinition = "DATE")
    private LocalDate datumIzdavanje;

    @Column(name = "datum_vazhnost", columnDefinition = "DATE")
    private LocalDate datumVazhnost;
}
