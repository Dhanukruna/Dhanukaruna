#include<stdio.h>
#include<conio.h>
int main()
{
    int y;
    printf("\nEnter the year");
    scanf("%d",&y);
    if((y%400==0&&y%4==0)||(y%100!=0))
        printf("\nThe given year is leap year");
    else
        printf("\nThe given year is not leap year");
    return 0;
}
