public class Employee {
    private String fullName;
    private int office;
    private int salary;
    public static int count = 1;

    public Employee(String fullName, int office, int salary) {
        this.fullName = fullName;
        this.office = office;
        this.salary = salary;
        count++;
    }

    public String getFullName(){return this.fullName;}
    public int getOffice() {return  this.office;}
    public int getSalary() {return this.salary;}
    public void setOffice(int office) {this.office = office;}
    public void setSalary(int salary) {this.salary = salary;}
    public String toString() {return "Имя " + this.fullName + " отдел " + this.office + " ЗП " + this.salary;}
}
