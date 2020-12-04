#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  float score=0;
  while(count<3){
  	cin>>n;
    if(n>=0){
    if(n%2!=0)
    { count++;
      score++;
    }
    else{
    	score-=0.5;
    }
    }
    else{
    score--;
      break;
    }
  }
  cout<<score;
}