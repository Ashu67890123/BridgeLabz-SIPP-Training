
class Student:
    def __init__(self, name, roll_number, marks):
        self.name = name
        self.roll_number = roll_number
        self.marks = marks

    def calculate_grade(self):
        if self.marks >= 90:
            return "A"
        elif self.marks >= 75:
            return "B"
        elif self.marks >= 60:
            return "C"
        else:
            return "D"

    def display(self):
        grade = self.calculate_grade()
        print(f"Name: {self.name}, Roll Number: {self.roll_number}, Marks: {self.marks}, Grade: {grade}")

# Example
s = Student("Alice", 1, 88)
s.display()
