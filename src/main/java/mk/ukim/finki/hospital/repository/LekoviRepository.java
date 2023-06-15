package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.Lekovi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LekoviRepository extends JpaRepository<Lekovi, Long> {

}
