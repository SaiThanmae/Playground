#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int s,m=0,cn=0;
  while(1){
  cin>>s;
  m+=s;
  cn++;
  if(m>=n)
    break;
  }
  cout<<"The number of turns is "<<cn;
}