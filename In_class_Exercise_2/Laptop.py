class Laptop:
    def __init__(self, brand="Unknown Brand", model="Unknown Model", price=0.0):
        self.brand = brand
        self.model = model
        self.price = price

    def getBrand(self):
        return self.brand
    def getModel(self):
        return self.model
    def getPrice(self):
        return self.price

# Main function
if __name__ == "__main__":
    print("--- Creating object 1 (Default) ---")
    lap1 = Laptop() 
    print(f"Brand: {lap1.getBrand()}, Model: {lap1.getModel()}, Price: ${lap1.getPrice()}")

    print("\n--- Creating object 2 (Parameterized) ---")
    lap2 = Laptop("Asus", "ROG Zephyrus", 1800.00) 
    print(f"Brand: {lap2.getBrand()}, Model: {lap2.getModel()}, Price: ${lap2.getPrice()}")