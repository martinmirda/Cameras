package sk.kas.mirda.Cameras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.kas.mirda.Cameras.model.Lens;

@Repository
public interface LensRepository extends JpaRepository<Lens, Integer> {
}
