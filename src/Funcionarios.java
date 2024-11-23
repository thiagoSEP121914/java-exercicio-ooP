public class Funcionarios {

    private int id;
    private String name;
    private double salary;

    public Funcionarios(int id,String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += this.salary * (percentage/100);
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public double getSalary() {
        return salary;
    }




    public String toString(){
        return + id + "," + name + "," + salary;
    }

}
