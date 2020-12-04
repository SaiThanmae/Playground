#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
   char cap[100];
  std::cin.getline(cap,100);
  int c=0,i=0;
  while(cap[i]!='\0'){
    if(cap[i]==' ')
      c++;
    i++;
  }
  //std::cout<<c;
  if(c<=10)
    std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
  return 0;
}