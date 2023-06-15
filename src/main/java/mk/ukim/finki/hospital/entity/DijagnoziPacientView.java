package mk.ukim.finki.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Immutable
@Table(name = "dijagnozi_po_pacient")
public class DijagnoziPacientView {
    @Id
    @Column(name = "icd_10_kod")
    private String icd_10_kod;

    @Column(name = "ime_dijagnoza")
    private String imeDijagnoza;

}
