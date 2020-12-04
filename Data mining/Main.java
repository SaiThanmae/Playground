#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int even=0,odd=0,c=1;
  while(n>0)
  {
    if(c%2==0)
    {
      even+=n%10;
    }
    else{
      odd+=n%10;
    }
    n=n/10;
    c++;
	}
  if(odd==even)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}