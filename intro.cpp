#include<iostream>
using namespace std;

int main() {
    cout << "Hello World" << endl; // Added endl to ensure it shows up immediately.
    cout << "Enter an integer: " << flush; // Prompting the user for input.
    int x;
    cin >> x;
    cout << "You entered: " << x << endl; // Echo input back to the user.
    return 0;
}