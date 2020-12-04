#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  int i;
  float t;
  cin>>i>>t;
  float o;
  if(i==2)
  {
    o=t+(t*5/10);
 	printf("%.2f",o);
  }
  else if(i==3)
  {
    o=t+t;
    printf("%.2f",o);
  }
  else
  {
    cout<<"Number of items is more";
  }
}