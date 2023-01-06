package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Model.ApplicationUser;

public interface ApplicationUserRepository extends MongoRepository<ApplicationUser, Long>{

}
