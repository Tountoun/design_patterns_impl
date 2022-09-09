package structural.filter;

import java.time.LocalDate;
import java.util.Objects;

public class Author {
    private String firstname;
    private String lastname;
    private String country;
    private LocalDate birthDay;
    public Author(String firstname, String lastname, String country, LocalDate birthDay){
        this.firstname = firstname;
        this.lastname = lastname;
        this.country = country;
        this.birthDay = birthDay;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getCountry() {
        return country;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstname, author.firstname) && Objects.equals(lastname, author.lastname) && Objects.equals(country, author.country) && Objects.equals(birthDay, author.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, country, birthDay);
    }
}
