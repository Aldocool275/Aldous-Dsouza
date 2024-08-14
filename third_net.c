#include<stdio.h>
#include<string.h>


int main(){
    static char input[100];
    static char output[100];
    int count = 0;


    printf("Enter the bits:");
    gets(input);
    int len = strlen(input);


    int j = 0;
    for(int i = 0 ; i <= len + 1; i++){
        if(input[i] == '1'){
            count++;
            if(count == 6){
                output[j++] = '0';
                count = 0;
            }
        }else{
            count = 0;
        }
        output[j++] = input[i];
    }
    printf("The stuffed data is 01111110_%s_01111110",output);




    return 0;
}
