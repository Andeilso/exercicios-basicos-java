package entities;

import entities.enums.WorkerLevel;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contract = new ArrayList();
    
    public Worker(){
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public WorkerLevel getLevel() {
        return this.level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void getContract() {
        for(HourContract c : this.contract){
            System.out.println(c.toString());
        }
    }

    public void addContract(HourContract contract){
        this.contract.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contract.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        for(HourContract c : this.contract){
            if(c.getDate().getYear() == year && c.getDate().getMonthValue() == month){
                sum += c.totalValue();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Worker [name = " + name + ", level = " + level + ", baseSalary = " + baseSalary + ", department = "+ department + "]";
    }
}
