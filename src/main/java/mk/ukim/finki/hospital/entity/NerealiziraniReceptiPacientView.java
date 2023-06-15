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
@Immutable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "nerealiziranireceptisporedpacient")
public class NerealiziraniReceptiPacientView {

    @Id
    @Column(name = "embg",  columnDefinition = "bpchar")
    private String embg;

    @Column(name = "ime_pacient")
    private String imePacient;

    @Column(name = "ime_na_lek")
    private String imeLek;

    @Column(name = "id_lek")
    private Long idLek;

    @Column(name = "datum_izdavanje", columnDefinition = "DATE")
    private LocalDate datumIzdavanje;
}
