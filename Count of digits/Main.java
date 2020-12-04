#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int num;
  cin>>num;
  int rem,count=0;
  do
  {
    count++;
    num=num/10;
  }while(num>0);
  cout<<count;
}