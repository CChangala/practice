#include<iostream> 
using namespace std;

int main(){
    //a type in which we want to store any value or variable is called a datatype.
    int x = 10;
    cout << "The value of x is: " << x << endl;
    //long has a wider range than int
    long y = 100000;
    //long long has a wider range than long, i.e to store more bigger numbers
    long long z = 1000000000000;
    //what if we want to store a decimal number? we can use float or double ( an integer can also be stored in double).
    float a = 10.5;
    double b = 10.5;
    //char is used to store a single character and string is used to store a sequence of characters.
    char c = 'A';
    string d = "Hello";
    //But we can take Hello World as a input in a single string variable. we have to either use a different varible or use getline() function.
    /*example : the string only takes the first word or anything before the space as new first word input.
    string s1,s2;
    cin >> s1 >> s2;
    cout<< s1 << " " <<s2
    */
   /* Incase we want to take everything as input in a single string variable we can use getline() function. 
   (It takes the entire line as input)*/
    string s;
    getline(cin,s);
    cout << "You entered: " << s << endl;
    return 0;
}