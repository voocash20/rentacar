package rentacar.repo;

import org.springframework.data.repository.CrudRepository;

import rentacar.domain.LuxuryCar;

public interface LuxuryCarRepo extends CrudRepository<LuxuryCar, Long> {

}
