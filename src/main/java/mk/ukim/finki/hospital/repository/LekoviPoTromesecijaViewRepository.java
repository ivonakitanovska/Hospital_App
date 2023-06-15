package mk.ukim.finki.hospital.repository;

import mk.ukim.finki.hospital.entity.LekoviPoTromesecijaView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LekoviPoTromesecijaViewRepository extends JpaRepository<LekoviPoTromesecijaView, String> {
}
