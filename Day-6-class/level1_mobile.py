
class MobilePhone:
    def __init__(self, brand, model, price):
        self.brand = brand
        self.model = model
        self.price = price

    def display_details(self):
        print(f"Brand: {self.brand}, Model: {self.model}, Price: {self.price}")

# Example
phone = MobilePhone("Samsung", "Galaxy M32", 15000)
phone.display_details()
