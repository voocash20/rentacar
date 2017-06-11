package rentacar.repo;

import org.springframework.data.repository.CrudRepository;

import rentacar.domain.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Long> {

}
