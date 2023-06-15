package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.Oddel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OddelRepository extends JpaRepository<Oddel, Long> {
}
