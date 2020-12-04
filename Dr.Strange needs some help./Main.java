#include<iostream>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int sum=1;
  while(n>0)
  {
    sum*=m;
    n--;
  }
  if(sum>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}