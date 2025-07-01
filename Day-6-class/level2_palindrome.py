
class PalindromeChecker:
    def __init__(self, text):
        self.text = text

    def is_palindrome(self):
        return self.text == self.text[::-1]

    def display_result(self):
        result = "is" if self.is_palindrome() else "is not"
        print(f"The text '{self.text}' {result} a palindrome.")

# Example
p = PalindromeChecker("madam")
p.display_result()
