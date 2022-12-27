package KCKitProject.data;

import KCKitProject.models.CatColony;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatColonyRepository extends CrudRepository<CatColony, Integer> {
}
