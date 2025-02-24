package entities;

import java.time.LocalDate;

public class Customer {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int cnh;
    private String contactNo;
    private String email;
    private String address;

    private Customer(String firstName, String lastName, LocalDate birthDate, int cnh, String contactNo, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.cnh = cnh;
        this.contactNo = contactNo;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", cnh=" + cnh +
                ", contactNo=" + contactNo +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class CustomerBuilder{
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private int cnh;
        private String contactNo;
        private String email;
        private String address;

        public CustomerBuilder firstNameBuilder(String firstName){
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder lastNameBuilder(String lastName){
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder birthDateBuilder(LocalDate birthDate){
            this.birthDate = birthDate;
            return this;
        }

        public CustomerBuilder cnhBuilder(int cnh){
            this.cnh = cnh;
            return this;
        }

        public CustomerBuilder contactBuilder(String contactNo){
            this.contactNo = contactNo;
            return this;
        }

        public CustomerBuilder emailBuilder(String email){
            this.email = email;
            return this;
        }

        public CustomerBuilder addressBuilder(String address){
            this.address = address;
            return this;
        }

        public Customer build(){
            return new Customer(firstName, lastName, birthDate, cnh, contactNo, email, address);
        }
    }
}
