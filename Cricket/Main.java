#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  int p,q,r,s;
  cin>>p>>q>>r>>s;
  float a,b,c,d,z,y;
    a=p/6;
  z=p%6;
  a=a+z*0.1;
  cout<<a<<"\n";
  b=s/6;
  y=s%6;
  b=b+y*0.1;
  printf("%.1f\n",b);
  d=q/a;
  c=r/b;
  printf("%.1f\n",c);
  printf("%.1f\n",d);
   if(c>=d)
         {
           printf("Eligible to Win");
         }
         else{
           printf("Not Eligible to Win");
         }
}