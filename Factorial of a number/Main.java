#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int i,fact=1;
  cin>>i;
  for(int k=1;k<=i;k++)
  {
    fact=fact*k;
  }
  cout<<fact;
}