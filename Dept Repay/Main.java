#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,t,r;
  cin>>p>>t>>r;
  float i,a,d,f;
  i=(p*t*r)/100;
  a=p+i;
  d=i*2/100;
  f=a-d;
  cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;
}