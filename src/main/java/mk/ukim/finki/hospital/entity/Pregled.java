package mk.ukim.finki.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Immutable
@Entity(name = "Pregled")
@Table(name = "pregled")
public class Pregled {

    @Id
    @Column(name = "id_pregled")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_doktor", referencedColumnName = "id_doktor")
    private Doktor doktor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "embg", referencedColumnName = "embg")
    private Pacient pacient;

    @Column(name = "datum_pregled", columnDefinition = "DATE")
    private LocalDate datumPregled;

    @ManyToMany
    @JoinTable(
            name = "pregled_ima_dijagnoza",
            joinColumns = @JoinColumn(name = "id_pregled"),
            inverseJoinColumns = @JoinColumn(name = "icd_10_kod")
    )
    private List<Dijagnoza> dijagnozi;
}
