package mk.ukim.finki.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Immutable
@Entity(name = "Upat")
@Table(name = "upat")
public class Upat {

    @Id
    @Column(name = "id_upat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "datum_izdavanje", columnDefinition = "DATE")
    private LocalDate datumIzdavanje;

    @Column(name = "datum_vazhnost", columnDefinition = "DATE")
    private LocalDate datumVaznost;

    @Column(name = "ime_upat")
    private String ime;

    @Column(name = "prezime_upat")
    private String prezime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_doktor_upatuva", referencedColumnName = "id_doktor")
    private Doktor doktorUpatuva;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_doktor_upateni_kon", referencedColumnName = "id_doktor")
    private Doktor doktorUpatenKon;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "embg", referencedColumnName = "embg")
    private Pacient pacient;

    public Upat(LocalDate datumIzdavanje, Doktor doktorUpatuva, Doktor doktorUpatenKon, Pacient pacient) {
        this.datumIzdavanje = datumIzdavanje;
        this.doktorUpatuva = doktorUpatuva;
        this.doktorUpatenKon = doktorUpatenKon;
        this.pacient = pacient;
    }

    public String upatDescription() {
        return "Upat za pacient so EMBG " + pacient.getEmbg() + ", upaten od dr." + doktorUpatuva.getFullName() +
                " , upaten kon dr." + doktorUpatenKon.getFullName();
    }
}
