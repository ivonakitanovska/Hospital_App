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
@AllArgsConstructor
@Immutable
@Entity
@Table(name = "dijagnoza")
public class Dijagnoza {

    @Id
    @Column(name = "icd_10_kod", nullable = false, columnDefinition = "bpchar")
    private String icd_10_kod;

    @Column(name = "ime_dijagnoza")
    private String imeDijagnoza;

    @ManyToMany
    @JoinTable(
            name = "pregled_ima_dijagnoza",
            joinColumns = @JoinColumn(name = "icd_10_kod"),
            inverseJoinColumns = @JoinColumn(name = "id_pregled")
    )
    private List<Pregled> pregledi;
}
