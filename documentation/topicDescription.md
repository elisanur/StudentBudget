# Topic spesification and description

### Topic: Budget calculator

I will implement a program that allows the user calculate the monthly, weekly and daily budget. The program will present the income and expenses separately. User can name and add headers to both income and expenses which makes the program user friendly. The program is designed for students, because it will be easy to use and it helps to understand the current balance.

### Users:

- Student or any other user

### Functions for users:

- Composing an expense title
- Composing an income title
- Removing a title
- Budget review shows how much money is there in total and how much there is to save/spend or if the balance is negative.
- Exporting budget review in a .txt file


### Structure

The application consists of one budget (class Budget) that holds ArrayLists income and expense. In addition class Budget is connected to BudgetPrinter, Function and Money classes. 
Money object holds only title and amount. Income and expense lists consists of Money objects. 
Function class is for methods used for editing budget, it holds methods for adding and removing income and expense titles. 
BudgetPrinter class is designed for all manipulation related to the budget review. It creates a String budget review. It's connected to Calc and TextWriter classes. 
Calc does all the calculations used in the budget review. 
TextWriter uses the budget review string and writes it to a txt.file.

### Class diagram

![Class diagram](/documentation/ClassDiagram.png)

### Sequence diagram - Add income

![Sequence diagram](/documentation/sequenceDiagramAddIncome.png)

### Sequence diagram - Delete inconme

![Sequence diagram](/documentation/sequenceDiagramDeleteIncome.png)

### Sequence diagram - Budget review

![Sequence diagram](/documentation/sequenceDiagramBudgetReview.png)

### Sequence diagram - Export budget review

![Sequence diagram](/documentation/sequenceDiagramExportBudgetReview.png)
