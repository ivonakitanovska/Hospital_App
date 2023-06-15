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
@Immutable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "lekovipotrimesecija")
public class LekoviPoTromesecijaView {

    @Id
    @Column(name = "ime_na_lek")
    private String imeLek;

    @Column(name = "quarter_1_recepti_za_lek", columnDefinition = "NUMERIC(19,0)")
    private Integer quarter1;

    @Column(name = "quarter_2_recepti_za_lek", columnDefinition = "NUMERIC(19,0)")
    private Integer quarter2;

    @Column(name = "quarter_3_recepti_za_lek", columnDefinition = "NUMERIC(19,0)")
    private Integer quarter3;

    @Column(name = "quarter_4_recepti_za_lek", columnDefinition = "NUMERIC(19,0)")
    private Integer quarter4;
}
