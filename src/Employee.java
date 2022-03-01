public abstract class Employee {
    static int lastEmployeeID;
    private int employeeID;
    private String employeeName;

    public Employee(String name) {
        employeeID = lastEmployeeID + 1;
        lastEmployeeID += 1;
        employeeName = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String name) {
        employeeName = name;
    }
}
