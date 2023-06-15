package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.Dijagnoza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DijagnozaRepository extends JpaRepository<Dijagnoza, String> {
    Optional<Dijagnoza> findById(String id);
}
