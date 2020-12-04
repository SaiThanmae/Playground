#include<iostream>
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
}
int main()
{
  //Type your code here.
  int a,b,c,larg;
  cin>>a>>b>>c;
  if(a>b && a>c)
  {
    if(b>c)
      larg=b;
    else
      larg=c;
  }
  else if(b>c && b>a)
  {
    if(a>c)
      larg=a;
    else
      larg=c;
  }
  else{
    if(a>b)
      larg=a;
    else
      larg=b;
  }
  int res;
  res=gcd(a,b);
  res=gcd(c,res);
  cout<<"The treasure is in box which has number "<<larg;
  cout<<"\nThe code to open the box is "<<res;
}