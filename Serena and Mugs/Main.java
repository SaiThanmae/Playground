#include<iostream>
using namespace std;
int printresult(int *a,int n, int s)
{
  int sum=0;
  for(int i=0;i<n;i++)
    sum+=a[i];
  if(sum<=s)
    return 1;
  else
    return 0;
}
int main()
{
  //Type your code here.
  int n,s;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int res=printresult(a,n,s);
  if(res==1)
    cout<<"YES";
  else
    cout<<"NO";
}