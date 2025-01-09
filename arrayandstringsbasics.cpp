#include<iostream>
using namespace std;
int main(){
    //collections of elements of similar datatype is called array;
    //we can use any datatype, change data and also perform operations.
    //array elements are stored consq in memory location
    int arr[5];
    cin >> arr[0] >>arr[1] >> arr[2] >> arr[3] >> arr[4];
    cout << arr[3];

    // 2D array - see these later in depth
    int a[4][4];

    //Strings
    string s = "Tanya";
    //string also stored every character in terms of index just like array.
    int len = s.size();

    //take two numbers and print its sum
    int num1 = 3;
    int num3 = 4;

    return 0;
}