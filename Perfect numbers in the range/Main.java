#include<iostream>
using namespace std;
int main()
{
  int start,end,i,count;
  cin>>start>>end;
 for(int sum=start;sum<end;sum++)
 {
   count=0;
  	for(int i=1;i<sum;i++)
    {
      if(sum%i==0)
      {
        count+=i;
      }
    }
  if(sum==count)
    cout<<sum<<" ";
   
 }
  return 0;
}