package gov.ornl.ae.spring_rest_api_mongodb.endpoints;

import gov.ornl.ae.spring_rest_api_mongodb.models.Users;
import gov.ornl.ae.spring_rest_api_mongodb.repositories.UsersRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
  @Autowired
  private UsersRepository repository;

  // GET
  @RequestMapping(value = "", method = RequestMethod.GET)
  public List<Users> getAllUsers() {
    return repository.findAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Users getUsersById(@PathVariable("id") ObjectId id) {
    return repository.findBy_id(id);
  }

  // PUT
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Users users) {
    users.set_id(id);
    repository.save(users);
  }

  // POST
  @RequestMapping(value = "", method = RequestMethod.POST)
  public Users createUser(@Valid @RequestBody Users users) {
    users.set_id(ObjectId.get());
    repository.save(users);
    return users;
  }

  // DELETE
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteUser(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }
}
