package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.Pregled;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PregledRepository extends JpaRepository<Pregled, Long> {
}
