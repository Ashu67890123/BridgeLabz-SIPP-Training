
class CartItem:
    def __init__(self):
        self.cart = []

    def add_item(self, item_name, price, quantity):
        self.cart.append((item_name, price, quantity))

    def remove_item(self, item_name):
        self.cart = [item for item in self.cart if item[0] != item_name]

    def display_total_cost(self):
        total = sum(price * quantity for _, price, quantity in self.cart)
        print(f"Total Cost: {total}")

# Example
cart = CartItem()
cart.add_item("Book", 100, 2)
cart.add_item("Pen", 10, 5)
cart.remove_item("Pen")
cart.display_total_cost()
