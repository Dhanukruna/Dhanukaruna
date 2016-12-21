#include<stdio.h>
#include<conio.h>
void main()
{
    int a;
    printf("\n Enter the number in positive or negative or zero");
    scanf("%d",&a);
    if(a>0)
        printf("\n The given  number is positive",a);
    else if(a==0)
        printf("\n The given number is zero ",a);
    else
        printf("\n The number is negative",a);
}
