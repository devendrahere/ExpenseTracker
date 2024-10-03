import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker= new ExpenseTracker();
        Scanner input =new Scanner(System.in);
        String command;
        System.out.println("welcome to Expense tracker");
        do {
            System.out.println("\noptions : add,delete,view,summary,exit\n");
            System.out.println("Enter the command:");
            command =input.nextLine();

            switch (command.toLowerCase()){
                case "add": {
                    System.out.println("Enter the name of Expense");
                    String name = input.nextLine();
                    System.out.println("Enter the amount of Expense");
                    double amount = input.nextDouble();
                    tracker.addExpense(name, amount);
                    break;
                }
                case "delete":{
                    System.out.println("Enter the name of Expense you want to delete");
                    String name = input.nextLine();
                    tracker.deleteExpense(name);
                    break;
                }
                case "view":{
                    tracker.viewExpense();
                    break;
                }
                case "summary":{
                    tracker.summary();
                    break;
                }
                case "exit":{
                    System.out.println("You are exiting Expense tracker");
                    break;
                }
                default:{
                    System.out.println("Enter valid option from above");
                    break;
                }
            }

        }while (!command.equalsIgnoreCase("exit"));
        input.close();
    }
}