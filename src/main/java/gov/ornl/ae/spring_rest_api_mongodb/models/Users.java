package gov.ornl.ae.spring_rest_api_mongodb.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Users {
  @Id
  public ObjectId _id;

  public String name;
  public String role;

  public Users() {}

  public Users(ObjectId _id, String name, String role) {
    this._id = _id;
    this.name = name;
    this.role = role;
  }

  public String get_id() { return _id.toHexString(); }
  public void set_id(ObjectId _id) { this._id = _id; }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public String getRole() { return role; }
  public void setRole(String role) { this.role = role; }
}
