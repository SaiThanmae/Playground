
#include<iostream>
using namespace std;
void stockSpan(int n, int *a);
int main(){
	int n;
  	cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
if(n>=1)
	stockSpan(n,a);
  return 0;
}
void stockSpan(int n, int *a){
	int count=0;
  for(int i=1;i<n;i++){
  if(i==1)
    cout<<"1";
    if(a[i]<=a[i-1]){
    	cout<<"\n1";
    }
    else
    {
    	count=count+2;
      cout<<"\n"<<count;
    }
  
  }
    }
