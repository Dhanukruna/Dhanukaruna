#include<stdio.h>
#include<conio.h>
void main()
{
int a;
printf("\nEnter the number ");
scanf("%d",&a);
if(a==0)
printf("\nThe given number is not even or odd");
else if(a%2==0)
printf("\nThe given number is even");
else
printf("\nThe given number is odd");
}
