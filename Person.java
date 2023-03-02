public class Person {
    String lastName;
    String name;
    String middleName;
    String birthDate;
    Integer phone;
    char gender;

    public Person() {

    }

    public Person(String lastName, String name, String middleName, String birthDate, Integer phone, char gender) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "<" + this.lastName + ">" + "<" + this.name + ">" + "<" + 
        this.middleName + ">" + "<" + this.birthDate + ">" + "<" + this.phone + ">"
        + "<" + this.gender + ">";
    }
}
