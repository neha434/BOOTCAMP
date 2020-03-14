package hibernate.jpa.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*Q.1)Create an Employee Entity which contains following fields
        Name
        Id
        Age
        Location*/
@Entity   //we are using jpa entities
@Table    //on which we are using
public class Employee {
    @Id
    private  int id;
    private  String  name;
   // @Column(name = "description")
    private  int age;
    private  String location;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
