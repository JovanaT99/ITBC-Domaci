package PrimeriOOp;

public class Person {

    private String name;
    private String surname;
    private int birth;
    private String zanimanje;

    Person(String name, String surname, int birth, String zanimanje) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.zanimanje = zanimanje;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirth() {
        return birth;
    }

    public String getZanimanje() {
        return zanimanje;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setZanimanje(String zanimanje) {
        this.zanimanje = zanimanje;
    }

    public String toString() {

        return name + surname + birth + zanimanje;
    }
}
