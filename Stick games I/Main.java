#include<iostream>
using namespace std;
void print(int a)
{
  if(a%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  print(n+m);
}