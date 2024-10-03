public class Expense {

    private String name;
    private double amount;
    public Expense(String name,double amount){
        this.name= name;
        this.amount=amount;
    }
    public double getAmount() {
        return amount;
    }
    public String getName() {
        return name;
    }

}
