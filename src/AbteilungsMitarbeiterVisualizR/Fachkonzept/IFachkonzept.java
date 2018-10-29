package AbteilungsMitarbeiterVisualizR.Fachkonzept;

import AbteilungsMitarbeiterVisualizR.Entities.Department;
import AbteilungsMitarbeiterVisualizR.Entities.Employee;

import java.util.List;

public interface IFachkonzept {
    // TODO refine me
    String getProjectName(); // TODO Do we display the Project name? if not remove this function


    Department getDepartment(long departmentId);

    List<Department> getDepartments();

    void saveDepartment(String departmentName);

    void deleteDepartment(long departmentId);

    void updateDepartmentName(String name, long departmentId);


    Employee getEmployee(long employeeId);

    List<Employee> getEmployees(long departmentId);

    void saveNewEmployee(String employeeName, long departmentId);

    void deleteEmployee(long employeeId);

    void updateEmployeeName(String name, long employeeId);

    void reassingEmployeeDepartment(long employeeId, long departmentId);
}