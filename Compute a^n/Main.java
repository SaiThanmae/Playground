#include<iostream>
using namespace std;
int pow(int a, int n)
{
  int res=1;
  for(int i=1;i<=n;i++)
      res*=a;
   return res;
}
int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
  return 0;
}