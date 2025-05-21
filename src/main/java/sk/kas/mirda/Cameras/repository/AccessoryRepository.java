package sk.kas.mirda.Cameras.repository;

import sk.kas.mirda.Cameras.model.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Integer> {
}