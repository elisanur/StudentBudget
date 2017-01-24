package sb.studentbudget.logic;

import sb.studentbudget.budget.Budget;

public class BudgetPrinter {
    
    private Budget budget;

    public BudgetPrinter(Budget budget) {
        this.budget = budget;
    }

    public void printDetailedMonthlyBudget() {
        
        for (int i = 0; i < this.budget.getExpense().size(); i++) {
            System.out.print(this.budget.getExpense().get(i).getName() + "\t");
            System.out.println(this.budget.getExpense().get(i).getAmount()); 
        }
    }

}
