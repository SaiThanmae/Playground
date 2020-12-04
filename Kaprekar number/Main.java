#include<iostream>
using namespace std;
#include<math.h>
bool iskaprekar(int n) 
{ 
    if (n == 1) 
       return true; 
  
    // Count number of digits in square 
    int sq = n * n; 
    int cd = 0; 
    while (sq) 
    { 
        cd++; 
        sq /= 10; 
    } 
  
    sq = n*n; 
    for (int r=1; r<cd; r++) 
    { 
         int eq = pow(10, r); 
         if (eq == n) 
            continue; 
         int sum = sq/eq + sq % eq; 
         if (sum == n) 
          return true; 
    } 
  return false; 
}  


int main()
{
  int n;
  cin>>n;
  if(iskaprekar(n))
  {
    cout<<"Kaprekar Number";
  }
  else{
    cout<<"Not a Kaprekar Number";
  }
  return 0;
}