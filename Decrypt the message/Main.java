#include<iostream>
using namespace std;
int main()
{
 	int num,terr,count=0;
  	cin>>num>>terr;
  	int sum = num + terr;
  	for(int i=1;i<sum;i++)
    {
      if(sum%i==0)
      {
        count+=i;
      }
    }
  if(sum==count)
    cout<<"They can read the message";
 else
   cout<<"They can't read the message";
}