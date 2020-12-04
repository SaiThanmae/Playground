#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int p = a+1;
  int q = a*2;
  int m = a*(b-2)+1;
  int n = a*(b-1);
  if((c>=p)&&(c<=q))
  {
    cout<<"It is a mango tree";
  }
  else if((c>=m)&&(c<=n))
  {
cout<<"It is a mango tree";
  }
  else
  {
    cout<<"It is not a mango tree";
}
}