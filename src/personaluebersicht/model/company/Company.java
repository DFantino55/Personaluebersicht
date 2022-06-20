package personaluebersicht.model.company;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public Department getDepartment(int index) {
        return departments.get(index);
    }

    public String getDepartmentsName() {
        String names = null;
        for (Department entry: departments) {
            names = names + ", " + entry.getName();
        }
        return names;
    }

    public void removeDepartment(int index) {
        departments.remove(index);
    }

    public int getNumberOfDepartments() {
        return departments.size();
    }
}
