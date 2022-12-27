package KCKitProject.data;

import KCKitProject.models.CatShelter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatShelterRepository extends CrudRepository<CatShelter, Integer> {
}
