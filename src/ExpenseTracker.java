import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {
    private List<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(String name, double amount) {
        Expense expense = new Expense(name, amount);
        expenses.add(expense);
        System.out.println("Expense " + name + " - " + amount);
    }

    public void viewExpense() {
        System.out.println("List of all Expenses");
        for (Expense expense : expenses)
            System.out.println(expense.getName() + "-  $" + expense.getAmount());
    }
    public void deleteExpense(String name){
        boolean found =false;
        for (int i=0;i<expenses.size();i++){
            if(expenses.get(i).getName().equalsIgnoreCase(name)){
                expenses.remove(i);
                System.out.println("Expense removed"+name);
                found =true;
                break;
            }
            if(!found){
                System.out.println("No such expenses");
            }
        }
    }
    public void summary(){
        double totalexpense=0;
        for (int i=0;i<expenses.size();i++){
            totalexpense+=expenses.get(i).getAmount();
        }
        System.out.println("Total spending is $"+totalexpense);
    }
    public static void main(String[] args) {
        System.out.println("This is a simple expense tracker !!");
    }
}