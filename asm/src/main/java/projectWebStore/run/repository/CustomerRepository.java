package projectWebStore.run.repository;

import java.util.Optional;

import projectWebStore.run.model.Customer;

public interface CustomerRepository extends CommonRepository<Customer, Integer> {
	Optional<Customer> findByEmailEquals(String email);
}
