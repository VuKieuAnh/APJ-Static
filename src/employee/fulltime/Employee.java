package employee.fulltime;

import java.util.Date;

public class Employee {
    private String name;
    private Date dateOfBirth;
    private Float basicSalary;
    String displayName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getDisplayName() {
        return displayName != null? displayName: name;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    protected void getFullSaraly(){
        System.out.println("Day la luong cua ban: " + getDisplayName());
    }



}
