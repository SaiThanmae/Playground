#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,k=1;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      cout<<i+1;
      for(int m=1;m<n;m++)
        cout<<i;
    }
    else{
      for(int m=1;m<n;m++)
      	cout<<i;
      cout<<i+1;
    }
    cout<<"\n";
  }
    return 0;
}