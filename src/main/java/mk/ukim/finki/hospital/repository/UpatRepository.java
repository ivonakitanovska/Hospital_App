package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.Upat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpatRepository extends JpaRepository<Upat, Long> {
}
