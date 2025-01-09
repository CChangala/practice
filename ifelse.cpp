#include<iostream>
using namespace std;
int main(){
    int age;
    cin >> age;
    if(age>=18){
        cout << "You are an adult" << endl;
    }
    else{
        cout << "You are not an adult" << endl;
    }

    //if else ladder
    if(age>=60){
        cout << "You are a senior citizen" << endl;
    }
    else if(age>=18){
        cout << "You are an adult" << endl;
    }
    else{
        cout << "You are a child" << endl;
    }

    int marks;
    cout << "Enter the marks";
    cin >> marks;
    if(marks < 25){
        cout << "Fail";
    }
    else if(marks >= 25 && marks <=44){
        cout << "Grade:E";
    }
    else if(marks>=45 && marks<=49){
        cout << "Grade:D";
    }
    else if(marks>=50 && marks<=59){
        cout << "Grade:C";
    }
    else if(marks>=60 && marks<=79){
        cout << "Grade:B";
    }
    else{
        cout << "Grade:A";
    }
    //we can also do nested conditions
    return 0;
}