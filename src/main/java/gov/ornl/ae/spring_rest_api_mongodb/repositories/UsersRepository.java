package gov.ornl.ae.spring_rest_api_mongodb.repositories;

import gov.ornl.ae.spring_rest_api_mongodb.models.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String> {
  Users findBy_id(ObjectId _id);
}
