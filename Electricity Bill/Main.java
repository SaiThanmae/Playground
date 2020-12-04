#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  cin>>num;
  int tot;
  if(num<=200)
  {
    tot=num*0.5;
  }
  else if(num<=400)
  {
    tot=num*0.65+100;
  }
  else if(num<=600)
  {
    tot=num*0.80+200;
  }
  else{
    tot=num*1.25+425;
  }
  cout<<"Rs."<<tot;
}