package mk.ukim.finki.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Immutable
@AllArgsConstructor
@Entity(name = "Specijalnost")
@Table(name = "specijalnost")
public class Specijalnost {

    @Id
    @Column(name = "id_specijalnost", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tip")
    private String tip;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "specijalnost")
    private List<Doktor> doktori;



}
