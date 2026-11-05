#include<stdio.h>
int main()
{
    int *ptr;

    ptr = (int *)malloc(sizeof(int));
    printf("\n ptr = %d",ptr);
    int i;
    for(i=0;i<7;i++)
    {
        ptr[i] = i + 10;
    }

    for(i=0;i<7;i++)
    {
        printf("   %d",ptr[i]);
    }
    free(ptr);
}
