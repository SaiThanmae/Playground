#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n; 
  for(int i=1;i<=n;i++)
  {
    cout<<i;
    for(int k=2;k<=i;k++)
    {
      cout<<"*"<<i;
    }
    cout<<"\n";
  }
  for(int i=n;i>=1;i--)
  {
    cout<<i;
    for(int k=i;k>=2;k--)
    {
      cout<<"*"<<i;
    }
    cout<<"\n";
  }
}
