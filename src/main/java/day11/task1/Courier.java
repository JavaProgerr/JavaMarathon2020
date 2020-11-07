package day11.task1;

public class Courier implements Worker {
    private int salary;
    private static final int TASK_SALARY = 100;
    private Warehouse warehouse;
    private boolean isBonus;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void doWork() {
        salary = salary + TASK_SALARY;
        warehouse.incDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() == 10000) {
            salary = salary + 50000;
        } else {
            System.out.println("Бонус пока не доступен");
        }
        if (isBonus) {
            System.out.println("Бонус уже был выплачен");
        }
        isBonus = true;
    }
}
