#include<iostream>
using namespace std;
int fib(int a)
{
  int p=0,q=1,r;
 if(a==1)
   return 0;
  else if(a==2)
    return 1;
  else{
    for(int i=3;i<=a;i++)
    {
      r=p+q;
      p=q;
      q=r;
    }
    return r;
  }
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n);
  return 0;
}