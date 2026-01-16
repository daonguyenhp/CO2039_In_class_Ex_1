class Car:
    def __init__(self, brand="Unknown", model ="Unknown", year =2021):
        self.__brand = brand
        self.__model = model
        self.__year = year

    def getBrand(self):
        return self.__brand
    
    def getModel(self):
        return self.__model
    
    def getYear(self):
        return self.__year
    
    def setBrand(self, b):
        self.__brand = b

    def setModel(self, m):
        self.__model = m

    def setYear(self, y):
        self.__year = y

if __name__ == "__main__":
    # Create an object using the default constructor and display its details.
    car1 = Car()
    print(f"Car 1 - Brand: {car1.getBrand()}, Model: {car1.getModel()}, Year: {car1.getYear()}")

    print("--" * 20)

    # Create another object using the parameterized constructor and display its details.
    car2 = Car("Toyota", "Corolla", 2020)
    print(f"Car 2 - Brand: {car2.getBrand()}, Model: {car2.getModel()}, Year: {car2.getYear()}")