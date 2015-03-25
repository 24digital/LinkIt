package Entities;

/**
 * Created by Marion on 3/25/2015.
 */
public class Contact {
    private long id;
    private String firstName;
    private String lastName;

    public long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
