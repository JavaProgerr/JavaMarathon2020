package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int TASK_SALARY = 80;
    private Warehouse warehouse;
    private boolean isBonus;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void doWork() {
        salary = salary + TASK_SALARY;
        warehouse.incPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() == 10000) {
            salary = salary + 70000;
        } else {
            System.out.println("Бонус пока не доступен");
        }
        if (isBonus){
            System.out.println("Бонус уже был выплачен");
        }
        isBonus = true;
    }
}
