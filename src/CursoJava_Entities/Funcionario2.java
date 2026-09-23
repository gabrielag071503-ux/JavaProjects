package CursoJava_Entities;

public class Funcionario2 {
    private String name;
    private Integer id;
    private Double salary;

    public Funcionario2(String name, Integer id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public void salaryIncrese(Double percentage) {
        this.salary += salary * (percentage/100);
    }

    @Override
    public String toString() {
        return getId() + ", " + name + ", " + String.format("%.2f", salary);
    }

    
 
}
