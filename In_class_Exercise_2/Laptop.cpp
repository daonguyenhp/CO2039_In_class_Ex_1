#include <iostream>
using namespace std;

class Laptop {
    private:
        string brand;
        string model;
        double price;
    public:
        Laptop(string b, string m, double p) : brand(b), model(m), price(p) {}

        Laptop() : Laptop("A", "B", 999.0) {
            cout << "-> Default constructor triggered chaining." << endl;
        }

        string getBrand() const { return brand; }
        string getModel() const { return model; }   
        double getPrice() const { return price; }
};

int main() {
    cout << "--- Creating object 1 (Default) ---" << endl;
    Laptop lap1;
    cout << "Brand: " << lap1.getBrand() << ", Model: " << lap1.getModel() << ", Price: $" << lap1.getPrice() << endl;

    cout << "\n--- Creating object 2 (Parameterized) ---" << endl;
    Laptop lap2("MacBook", "Pro M3", 2000.00);
    cout << "Brand: " << lap2.getBrand() << ", Model: " << lap2.getModel() << ", Price: $" << lap2.getPrice() << endl;

    return 0;
}