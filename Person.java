
package Ex3;

import java.util.Date;

public abstract class Person implements IPerson {
    String id;
    String name;
    Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public abstract void displayInfo();

    
}