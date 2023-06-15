package mk.ukim.finki.hospital.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Immutable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Immutable
@Entity(name = "Lekovi")
@Table(name = "lekovi")
public class Lekovi {

    @Id
    @Column(name = "id_lek")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ime_na_lek")
    private String imeLek;

    @Column(name = "proizvoditel")
    private String proizvoditel;
}
