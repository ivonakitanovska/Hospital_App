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
@Entity(name = "Izvestaj")
@Table(name = "izvestaj")
public class Izvestaj {

    @Id
    @Column(name = "id_izvestaj")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "terapija")
    private String terapija;

    @Column(name = "datum_na_primanje", columnDefinition = "DATE")
    private LocalDate datumPrimanje;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pregled", referencedColumnName = "id_pregled")
    private Pregled pregled;

}
