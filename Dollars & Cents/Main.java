#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int s1,s2;
  s1=d1+d2;
  s2=c1+c2;
  if(s2>=100)
  {
    s2=s2-100;
    s1=s1+1;
  }
  cout<<s1<<"\n"<<s2;
}