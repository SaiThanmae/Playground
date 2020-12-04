#include<iostream>
using namespace std;
int fun(int n)
{
  int sum=0;
  while(n>0)
  {
    int rem=n%10;
    sum+=rem;
    n=n/10;
  }
  if(sum>9)
  {
    fun(sum);
  }
  else
    return sum;
}
int main()
{
  int n;
  cin>>n;
  cout<<fun(n);
  return 0;
}