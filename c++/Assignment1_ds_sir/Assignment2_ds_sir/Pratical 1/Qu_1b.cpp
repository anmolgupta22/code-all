
#include<stdio.h>
struct faculty
{
    char faculty_name[20];
    int faculty_id;
    int sub_code;
    char class_name[20];
};
void accept(struct faculty list[],int s);
void display(struct faculty list[],int s);
void radix_sort(struct faculty list[],int s);
int main()
{
    struct faculty data[20];
    int n;
    printf("Number of records you want to enter  ? \n");
    scanf("%d",&n);
    accept(data,n);
    printf("\n Before sorting ");
    display(data,n);
    radix_sort(data,n);
    printf("\n After sorting \n");
    display(data,n);

}
void accept(struct faculty list[80],int s )
{
    int i;
    for(i=0;i<s;i++)
    {
        printf("\n PRAKRATI AGARWAL	     21MCA10116 \n");
        printf("\n Enter data for records %d ",i+1);
        printf("\nEnter faculty ID : ");
        scanf("%d",&list[i].faculty_id);
        printf("Enter faculty name : ");
        scanf("%s",&list[i].faculty_name);
        printf("Enter faculty subject code : ");
        scanf("%d",&list[i].sub_code);
        printf("Enter class name : ");
        scanf("%s",&list[i].class_name);
    }
}
void display(struct faculty list[80],int s)
{
    int i;
    printf("\n\nFACULTY ID\tFACULTY NAME\tSUBJECT CODE\tCLASS NAME\n ");
    for(i=0;i<s;i++)
    {
        printf("%d\t\t%s\t\t%d\t\t%s\n",list[i].faculty_id,list[i].faculty_name,list[i].sub_code,list[i].class_name);
    }
}
void radix_sort(struct faculty list[80], int size) {
    int max = getMax(list, size);
    int place;
    for ( place = 1; max / place > 0; place = 10)

        countingsort(list, size, place);
}
void getMax(struct faculty list[80],int n)
{
    int max=list[0].faculty_id;
    int i;
    for(i=1;i<n;i++){
        if(list[i].faculty_id>max){
            max=list[i].faculty_id;
        }
    }
}
void countingsort(struct faculty list[80],int size,int place)
{
    int output[size+1];
    int max=((list[0].faculty_id/place)%10);
    int i;
    for( i=1;i<size;i++){
        if(((list[i].faculty_id/place)%10)>max){
            max=list[i].faculty_id;
        }
    }
    int count[max+1];
    for( i=0;i<max;++i)
        count[i]=0;
    for(i=0;i<size;i++)
        count[(list[i].faculty_id/place)%10]++;
    for( i=1;i<10;i++)
        count[i]+=count[i-1];
    for( i=size-1;i>=0;i--){
        output[count[(list[i] .faculty_id/place) % 10] - 1] = list[i].faculty_id;
        count[(list[i].faculty_id/ place) % 10]--;
    }
}
