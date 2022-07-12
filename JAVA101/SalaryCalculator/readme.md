# Salary Calculator

In Java, you should write a class called "Employee" that represents factory workers and calculates employee salaries with its methods. This class will have 4 attributes and 5 methods.

**Attributes of the Class**

- name : Name and surname of the employee
- salary : The employee's salary
- workHours : Weekly working hours
- hireYear : Year of employment

**Methods of the Class**

- Employee(name,salary,workHours,hireYear) : It is a constructor method and will take 4 parameters.
- tax() : It will calculate the tax applied to the salary.
- If the employee's salary is less than 1000 TL, no tax will be applied.
- If the employee's salary is more than 1000 TL, 3% of his salary will be taxed.
- bonus() : If the employee has worked more than 40 hours a week, bonus wages will be calculated as 30 TL per hour of extra work.
- raiseSalary() : It will calculate the salary increase based on the employee's start year. Take the current year as 2021.
- If the employee has been working for less than 10 years, his salary will be increased by 5%.
- If the employee has worked for more than 9 years and less than 20 years, his salary will be increased by 10%.
- If the employee has been working for more than 19 years, a 15% raise will be made.
- toString() : It will print the information of the employee to the screen.
