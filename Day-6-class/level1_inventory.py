
class Item:
    def __init__(self, item_code, item_name, price):
        self.item_code = item_code
        self.item_name = item_name
        self.price = price

    def display_details(self, quantity):
        total_cost = self.price * quantity
        print(f"Item Code: {self.item_code}, Name: {self.item_name}, Unit Price: {self.price}, Quantity: {quantity}, Total Cost: {total_cost}")

# Example
item = Item("A101", "Pen", 10)
item.display_details(5)
