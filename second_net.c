#include<stdio.h>
#include<string.h>
int main(){
    static char input[10];
    static char output[100];
    int flag = 0;

    printf("Enter digits of your data:");
    gets(input);

    int len = strlen(input);
    int j = 0;

    if(input[0] != '$' && input[len-1] != '$'){
        flag = 0;
    }else{
        for(int i = 1 ; i < len - 1 ;){
                if(input[i] == '$'){
                    if(input[i+1] == '$' && (i+1) != len-1){
                        output[j++] = input[i];
                        i+=2;
                    }else{
                        flag = 0;
                        break;
                    }
                }else{
                    output[j++] = input[i];
                    i++;
                }

                flag = 1;
        }
    }

    if(flag == 1){
        printf("%s",output);
    }else{
        printf("Error!!!");
    }
    return 0;
}