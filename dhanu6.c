#include<stdio.h>
#include<conio.h>
void main()
{
    char ch;
    printf("\nEnter the character");
    scanf("%c",&ch);
    if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
       printf("\n  alphabet",ch);
    else
        printf("\n not alphabet",ch);
}
