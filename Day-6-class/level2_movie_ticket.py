
class MovieTicket:
    def __init__(self):
        self.movie_name = ""
        self.seat_number = ""
        self.price = 0

    def book_ticket(self, movie_name, seat_number, price):
        self.movie_name = movie_name
        self.seat_number = seat_number
        self.price = price

    def display_ticket(self):
        print(f"Movie: {self.movie_name}, Seat: {self.seat_number}, Price: {self.price}")

# Example
ticket = MovieTicket()
ticket.book_ticket("Inception", "B12", 250)
ticket.display_ticket()
