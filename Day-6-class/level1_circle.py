
import math

class Circle:
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return math.pi * self.radius ** 2

    def circumference(self):
        return 2 * math.pi * self.radius

    def display(self):
        print(f"Radius: {self.radius}, Area: {self.area():.2f}, Circumference: {self.circumference():.2f}")

# Example
c = Circle(5)
c.display()
