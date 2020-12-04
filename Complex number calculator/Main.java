#include<iostream>
using namespace std;
struct complex{
  int real;
  int imag;
};
int main(){
int ch;
cin>>ch;
struct complex a, b, res;
cin>>a.real>>a.imag;
cin>>b.real>>b.imag;
switch(ch){
  case 1:
    res.real = a. real + b.real;
    res.imag = a.imag + b.imag;
    cout<<res.real<<showpos<<res.imag<<"i\n";
	break;
  case 2:
    res.real=a.real-b.real;
    res.imag=a.imag-b.imag;
    cout<<res.real<<showpos<<res.imag<<"i\n";
    break;
  case 3:
    res.real = (a.real*b.real)-(a.imag*b.imag);
    res.imag = (a.real*b.imag)+(a.imag*b.imag);
    cout<<res.real<<showpos<<res.imag<<"i\n";
    break;
  default:
    cout<<"Invalid choice";
}
  
return 0;
}