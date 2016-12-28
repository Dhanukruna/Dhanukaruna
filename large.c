#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b,c;

    printf("\nEnter the number");
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);
    if((a>b)&&(a>c))
        printf("\n %d is greater",a);
    else if((b>a)&&(b>c))
        printf("\n %d is greater",b);
    else
        printf("\n %d is greater",c);

}
