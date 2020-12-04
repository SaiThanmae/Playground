#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n,fm=0,m=0;
  cin>>n;
  int *p = (int *)malloc(n*sizeof(int));
    for(int i=0;i<n;i++)
  {
    cin>>*(p+i);
  }
  for(int i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
      fm++;
    else
      m++;
  }
  cout<<m<<"\n"<<fm;
  return 0;
}