#include<iostream>
using namespace std;
int main()
{
  int n,a=6;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<a<<" ";
    a+=5*(i+1);
  }
}