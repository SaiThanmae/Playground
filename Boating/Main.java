#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int weight, adults, child;
  cin>>weight>>adults>>child;
  int ad=adults*75;
  int ch=child*30;
  int tot=ad+ch;
  if(tot<=weight)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}