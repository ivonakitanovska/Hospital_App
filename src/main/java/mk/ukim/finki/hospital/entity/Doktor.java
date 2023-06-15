package mk.ukim.finki.hospital.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Immutable
@Entity
@Table(name = "doktor")
public class Doktor {

    @Id
    @Column(name = "id_doktor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ime_doktor")
    private String ime;

    @Column(name = "prezime_doktor")
    private String prezime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_specijalnost", referencedColumnName = "id_specijalnost")
    private Specijalnost specijalnost;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "doktorUpatuva")
    private List<Upat> dadeniUpati;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "doktorUpatenKon")
    private List<Upat> primeniUpati;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "doktor")
    private List<Pregled> pregledi;

    public String getFullName() {
        return ime + " " + prezime;
    }
}
