#include<stdio.h>
int main(){
    char input[10];
    char output[100];

    printf("Enter digits of your data:");
    gets(input);

    int j = 0;
    for(int i = 0 ; input[i] != '\0' ; i++){
        if(input[i] == '$'){
             output[j++] = '$';
             output[j++] = '$';
        }else{
            output[j++] = input[i];
        }
    }

    printf("The manipulated data is $%s$",output);
    return 0;
}