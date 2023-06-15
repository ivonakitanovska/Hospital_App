package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.Recepta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptaRepository extends JpaRepository<Recepta, Long> {
}
