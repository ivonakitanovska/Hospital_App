package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientRepository extends JpaRepository<Pacient, String> {
}
