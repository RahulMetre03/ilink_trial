import java.util.*;

public class q100 {

// Employee class represents each employee with relevant fields
static class Employee {
    String name;
    String department;
    int experienceYears;
    double salary;
    double bonusPercentage;
    double totalCompensation;

    // Constructor to initialize an Employee object
    public Employee(String name, String department, int experienceYears, double salary, double bonusPercentage) {
        this.name = name;
        this.department = department;
        this.experienceYears = experienceYears;
        this.salary = salary;
        this.bonusPercentage = bonusPercentage;
    }

    // Method to calculate total compensation
    public void calculateTotalCompensation() {
        // Calculate total compensation
        this.totalCompensation = salary + (bonusPercentage / 100 * salary);
    }
}

public static void main(String[] args) {
    // Create a List of Employee objects
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Shraddha", "Engineering", 5, 70000, 10));
    employees.add(new Employee("Sai", "Engineering", 3, 60000, 5));
    employees.add(new Employee("Krishna", "HR", 10, 80000, 12));
    employees.add(new Employee("Ravi", "HR", 2, 50000, 3));
    employees.add(new Employee("Raghu", "Engineering", 8, 90000, 8));

    // Calculate total compensation for each employee
    for (Employee employee : employees) {
        employee.calculateTotalCompensation();
    }

    // Create a map to hold the department totals for calculating average compensation
    Map<String, List<Double>> departmentCompensation = new HashMap<>();
    Map<String, Integer> departmentCount = new HashMap<>();

    // Iterate through employees and fill department compensation map
    for (Employee employee : employees) {
        // One-hot encoding: Add total compensation to the corresponding department in the map
        departmentCompensation.putIfAbsent(employee.department, new ArrayList<>());
        departmentCompensation.get(employee.department).add(employee.totalCompensation);

        // Count number of employees in each department for averaging
        departmentCount.put(employee.department,
            departmentCount.getOrDefault(employee.department, 0) + 1);
    }

    // Determine the department with the highest average total compensation
    double highestAverageCompensation = 0;
    String highestDepartment = "";

    // Calculate averages and find the highest
    for (String department : departmentCompensation.keySet()) {
        List<Double> compensations = departmentCompensation.get(department);
        double totalCompensation = compensations.stream().mapToDouble(Double::doubleValue).sum();
        double averageCompensation = totalCompensation / departmentCount.get(department);

        // Compare with current highest average to find the highest department
        if (averageCompensation > highestAverageCompensation) {
            highestAverageCompensation = averageCompensation;
            highestDepartment = department;
        }
    }

    // Print the results
    System.out.println("Department with highest average Total Compensation: " + highestDepartment +
            " with an average compensation of: " + highestAverageCompensation);

    // Analyze the relationship between Experience_Years and Salary
    // Using simple correlation calculation for demonstration
    double sumExperience = employees.stream().mapToDouble(e -> e.experienceYears).sum();
    double sumSalary = employees.stream().mapToDouble(e -> e.salary).sum();
    double sumExperienceSalary = 0;

    for (Employee employee : employees) {
        sumExperienceSalary += (employee.experienceYears - (sumExperience / employees.size())) *
                               (employee.salary - (sumSalary / employees.size()));
    }

    // Print correlation analysis
    System.out.println("Experience and Salary correlation: " + sumExperienceSalary);

    // Final conclusions
    System.out.println("Conclusion: More experience does not always mean a higher salary.");
}
}