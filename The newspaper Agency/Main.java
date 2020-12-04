#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y,profit;
  cin>>w>>x>>y;
  int sp=w*x;
  int cp=w*y;
  profit=sp-cp-100;
  cout<<profit;
}