package mk.ukim.finki.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Immutable
@Entity
@Table(name = "oddel")
public class Oddel {

    @Id
    @Column(name = "id_oddel")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ime_oddel")
    private String imeOddel;

    @ManyToOne
    @JoinColumn(name = "id_specijalnost", referencedColumnName = "id_specijalnost")
    private Specijalnost specijalnost;

}
