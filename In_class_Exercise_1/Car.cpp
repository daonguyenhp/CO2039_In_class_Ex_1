#include <iostream>
#include <string>
using namespace std;

class Car {
    private:
        string brand;
        string model;
        int year;

    public:
        Car() : brand("Unknown"), model("Unknown"), year(2026) {};
        Car(string b, string m, int y) : brand(b), model(m), year(y) {}

        string getBrand() {return this->brand;}
        string getModel() {return this->model;}
        int getYear() {return this->year;}

        void setBrand(string b) {this->brand = b;}
        void setModel(string m) {this->model = m;}
        void setYear(int y) {this->year = y;}
};

int main()  {
    // Create an object using the default constructor and display its details.
    Car car1;
    cout << "Car 1 - Brand: " << car1.getBrand() << ", Model: " << car1.getModel() << ", Year: " << car1.getYear() << endl;

    cout << "----------------------------------------" << endl;

    // Create an object using the parameterized constructor and display its details.
    Car car2("Toyota", "Camry", 2020);
    cout << "Car 2 - Brand: " << car2.getBrand() << ", Model: " << car2.getModel() << ", Year: " << car2.getYear() << endl;
}