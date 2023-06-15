package mk.ukim.finki.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Immutable
@Entity(name = "Pacient")
@Table(name = "pacient")
public class Pacient {

    @Id
    @Column(name = "embg", columnDefinition = "bpchar")
    private String embg;

    @Column(name = "ime_pacient")
    private String imePacient;

    @Column(name = "prezime_pacient")
    private String prezimePacient;

    @Column(name = "osiguruvanje")
    private String osiguruvanje;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pacient")
    private List<Pregled> pregledi;
}
