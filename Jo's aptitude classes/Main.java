#include<iostream>
using namespace std;
int main()
{
	int a,b,c,ans;
	cin>>a>>b>>c>>ans;
	int small, gcd;
	if(a<b && a<c)
		small = a;
	else{
		if(b<c && b<a)
			small = b;
	else
		small = c;
	}
  while(small>0)
  {
    if(a%small ==0 && b%small ==0 && c%small ==0)
    {
      gcd = small;
      break;
    }
    small--;
  }
  if(gcd==ans)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}