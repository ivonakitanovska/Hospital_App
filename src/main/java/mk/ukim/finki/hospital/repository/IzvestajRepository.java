package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.Izvestaj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IzvestajRepository extends JpaRepository<Izvestaj, Long> {
}
