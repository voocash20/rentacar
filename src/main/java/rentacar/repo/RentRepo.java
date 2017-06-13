package rentacar.repo;

import org.springframework.data.repository.CrudRepository;

import rentacar.domain.Rent;

public interface RentRepo extends CrudRepository<Rent, Long> {

}
