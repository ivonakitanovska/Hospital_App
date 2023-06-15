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
@Entity(name = "Recepta")
@Table(name = "recepta")
public class Recepta {

    @Id
    @Column(name = "id_recepta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "preporacana_doza")
    private String preporacanaDoza;

    @Column(name = "ime_lek")
    private String imeLek;

    @Column(name = "datum_izdavanje", columnDefinition = "DATE")
    private LocalDate datumIzdavanje;

    @Column(name = "datum_vaznost", columnDefinition = "DATE")
    private LocalDate datumVaznst;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pregled", referencedColumnName = "id_pregled")
    private Pregled pregled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lek", referencedColumnName = "id_lek")
    private Lekovi lekovi ;


}
