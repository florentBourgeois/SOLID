package fr.uha.ensisa.archi.usermanager.model;

public class User {
    private String firstName = "default";
    private String lastName = "default";
    private int financialCapital = 1;

    public User() {
    }

    public User(String firstName, String lastName, int financialCapital) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.financialCapital = financialCapital;
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

    public int getFinancialCapital() {
        return financialCapital;
    }

    public void setFinancialCapital(int financialCapital) {
        this.financialCapital = financialCapital;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", financialCapital=" + financialCapital +
                '}';
    }
}
