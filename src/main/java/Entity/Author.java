package Entity;

public class Author {
    String name;
    String lastName;
    String gender;

    Author(String name, String lastName, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender =  gender;
    }
    public String toString() {
        return "Author name, surname: " + this.name +",  " + this.lastName +
                "\n Author gender: " + this.gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
