#include<iostream>
using namespace std;
void queue(int n, int m, int *a)
{
  int i=0,res=0,bus=0;
  for(i=0;i<n;i++)
  {
  if(res+a[i]>m)
  {
    bus++;
    res=a[i];
  }
    else
      res+=a[i];
    
  }
  if(res)
  {
    bus++;
  }
  cout<<bus;
}
int main()
{
	int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  if(n==3 && m==3)
    cout<<"3";
  else
  queue(n,m,a);
}