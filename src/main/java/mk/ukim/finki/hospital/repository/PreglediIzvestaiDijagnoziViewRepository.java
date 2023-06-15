package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.PreglediIzvestaiDijagnoziView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreglediIzvestaiDijagnoziViewRepository extends JpaRepository<PreglediIzvestaiDijagnoziView, Long> {
}
