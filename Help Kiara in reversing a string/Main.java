#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end, i=0;    
//Your code goes here
   std::cin.getline(str,100);
    while(str[i]!='\0')
    {
      count++;
      
     // std::cout<<str[i]<<std::endl;
      i++;
  	}
//std::cout<<count;
  int k=0;
  for(int m=count-1;m>=0;m--)
  {
    std::cout<<str[m];
    k++;
  }
//std::cout<<rev;
}