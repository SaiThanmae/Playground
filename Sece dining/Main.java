#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char str[10];
  int n;
  cin>>str>>n;
  if((strcmp(str,"rear")==0 && n == 1) || (strcmp(str,"front")==0 && n==0)){
    cout<<"Right Handed";
  }
  else
    cout<<"Left Handed";
  }