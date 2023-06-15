package mk.ukim.finki.hospital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Immutable
@Entity(name = "TelefonskiBroj")
@Table(name = "telefonski_broj")
public class TelefonskiBroj {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "embg", referencedColumnName = "embg")
    private Pacient pacient;

    @Column(name = "telefonski_broj")
    private String broj;

}
