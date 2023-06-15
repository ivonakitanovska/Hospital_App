package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.Doktor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoktorRepository extends JpaRepository<Doktor, Long> {
}
