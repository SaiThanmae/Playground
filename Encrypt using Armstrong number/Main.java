#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int rem,sum=0,dg=0;
  int p=n,r=n;
  while(n>0)
  {
    n=n/10;
    dg++;
  }
  while(p>0)
  {
    rem=p%10;
    sum+=power(rem,dg);
    p=p/10;
  }
  if(sum==r)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}