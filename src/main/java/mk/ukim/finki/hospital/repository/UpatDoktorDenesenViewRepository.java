package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.UpatDoktorDenesenView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpatDoktorDenesenViewRepository extends JpaRepository<UpatDoktorDenesenView, Long> {
}
