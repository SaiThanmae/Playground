#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a1,a2,a3,b1,b2,b3,c1,c2,c3;
  cin>>a1>>a2>>a3>>b1>>b2>>b3>>c1>>c2>>c3;
  int a,b,c;
  a = (a1-(a1*a2/100))+a3;
  b = (b1-(b1*b2/100))+b3;
  c = (c1-(c1*c2/100))+c3;
  cout<<"In Flipkart Rs."<<a<<"\n";
    cout<<"In Snapdeal Rs."<<b<<"\n";
  cout<<"In Amazon Rs."<<c<<"\n";
  if(a<=b && a<=c){
    cout<<"He will prefer Flipkart";
}
  else if(b<=a && b<=c)
  {
    cout<<"He will prefer Snapdeal";
  }
  else{
    cout<<"He will prefer Amazon";
  }
}