package model.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Seller implements Serializable {

    private Integer Id;
    private String name;
    private String email;
    private LocalDateTime date;
    private Double baseSalary;

    private Department department;

    public Seller() {
    }

    public Seller(Integer id, String name, String email, LocalDateTime date, Double baseSalary, Department department) {
        Id = id;
        this.name = name;
        this.email = email;
        this.date = date;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;
        return getId().equals(seller.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String toString() {
        return "Seller [" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                ']';
    }
}
