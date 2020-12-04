#include<iostream>
using namespace std;
int main()
{
  int a[7],sum=0;
  for(int i=0;i<7;i++){
    cin>>a[i];
    sum+=a[i];
  }
  int sal;
  sal=sum*100;
  for(int i=0;i<7;i++){
  	if(a[i]>8){
   	sal+=((a[i]-8)*15); 
   }
  }
  if(a[0]>0){
  	sal+=a[0]*100*0.5;
  }
  if(a[6]>0){
    sal+=a[6]*100*0.25;
  }
  cout<<sal;
  return 0;
}