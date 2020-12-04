#include<iostream>
using namespace std;
int fact(int a)
{
  int sum=1;
  for(int i=1;i<=a;i++)
  {
    sum*=i;
  }
  return sum;
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
  return 0;
}