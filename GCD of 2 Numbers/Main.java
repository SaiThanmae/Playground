#include<iostream>
using namespace std;
int gcd(int a, int b)
{
  int small;
  if(a<b)
    small=a;
  else
    small=b;
    while(small>0)
    {
      if(a%small == 0 && b%small==0)
      {
        return small;
      	break;
      }
      small--;
  }
}
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
  return 0;
}