#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,t;
  cin>>a>>b>>t;
  int m,n,p,q,r,s;
  m = 1;
  n=b;
  if((t>=m) and (t<=n))
  {
    cout<<"Yes";
  }
  else if(((t-1)%b)==0)
  {
    cout<<"Yes";
  }
  else if((t%b==0))
  {
    cout<<"Yes";
  }
  else{
    cout<<"No";
  }
  
}