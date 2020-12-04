#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,m;
  cin>>a>>b;
  if(b>=a)
    cout<<b-a;
  else
  {
    m = 100-a+b;
    cout<<m;
  }
}