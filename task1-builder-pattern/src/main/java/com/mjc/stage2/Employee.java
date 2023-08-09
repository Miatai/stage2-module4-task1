package com.mjc.stage2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Employee {
    private String name;
    private String lastName;
    private String position;
    private String phone;
    private String email;
    private String carNumber;

    public Employee() {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        private Employee employee;

        public EmployeeBuilder() {
            this.employee = new Employee();
        }

        public EmployeeBuilder setName(String name) {
            return this.setName(name);
        }

        public EmployeeBuilder setLastName(String lastName) {
            return this.setLastName(lastName);
        }

        public EmployeeBuilder setPosition(String position) {
            return this.setPosition(position);
        }

        public EmployeeBuilder setPhone(String phone) {
            return this.setPhone(phone);
        }

        public EmployeeBuilder setEmail(String email) {
            return this.setEmail(email);
        }

        public EmployeeBuilder setCarNumber(String carNumber) {
            return this.setCarNumber(carNumber);
        }

        public Employee build(){
            return employee;
        }

    }
}
