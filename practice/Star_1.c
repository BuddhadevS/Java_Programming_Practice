#include<stdio.h>
int main()
{
    int a = 10;
    int b = 20;
    printf("The value of a and b %d is: ", a,b);
    a =a+b;
    b= a-b;
    a=a-b;
    printf("The value of a and b %d is: ", a,b);
    return 0;
}
