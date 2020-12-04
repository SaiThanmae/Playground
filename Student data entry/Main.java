#include <iostream>
#include<string>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
}s;
int main() 
{
  cin.get(s.name,50);
  cin>>s.roll>>s.marks;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s.name<<"\n";
  cout<<"Roll: "<<s.roll<<"\n";
  cout<<"Marks: "<<s.marks<<"\n";
return 0;
}