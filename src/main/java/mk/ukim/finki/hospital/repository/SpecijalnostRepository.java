package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.Specijalnost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecijalnostRepository extends JpaRepository<Specijalnost, Long> {
}
