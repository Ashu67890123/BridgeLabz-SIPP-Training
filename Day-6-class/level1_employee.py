
class Employee:
    def __init__(self, name, emp_id, salary):
        self.name = name
        self.emp_id = emp_id
        self.salary = salary

    def display_details(self):
        print(f"Name: {self.name}, ID: {self.emp_id}, Salary: {self.salary}")

# Example
emp = Employee("John Doe", 101, 50000)
emp.display_details()
