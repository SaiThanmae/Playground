#include<iostream>
using namespace std;
int main()
{
  int n,a=4;
  cin>>n;
  for(int i=1;i<=a;i++)
  {
    for(int k=1;k<=i;k++)
    {
      cout<<n;
    }
    cout<<"\n";
    n++;
  }
  n--;
  for(int i=a;i>=1;i--)
  {
    for(int k=1;k<=i;k++)
    {
      cout<<n;
    }
    cout<<"\n";
    n--;
  }
}