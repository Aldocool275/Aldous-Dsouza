#include <stdio.h>
#include <string.h>

int main()
{
    char inp[50], out[50];
    int i, j = 0, count = 0, len;

    printf("Enter stuffed data: ");
    scanf("%s", inp);

    len = strlen(inp);


    if (strncmp(inp, "01111110", 8) == 0) {
        memmove(inp, inp + 8, len - 8);
        len -= 8; 
        inp[len] = '\0'; 
    } else {
        printf("Error: Missing starting flag.\n");
        return 1;
    }

    
    if (len >= 8 && strncmp(inp + len - 8, "01111110", 8) == 0) {
        inp[len - 8] = '\0';
        len -= 8; 
    } else {
        printf("Error: Missing ending flag.\n");
        return 1;
    }

    for (i = 0; i < len; i++) {
        if (inp[i] == '1') {
            count++;
        } else {
            count = 0;
        }
        out[j++] = inp[i];

        if (count > 5) {
            printf("Error: Input data is not stuffed.\n");
            return 1;
        }

        if (count == 5) {
            if (i + 1 < len && inp[i + 1] != '0') {
                printf("Error: Input data is not stuffed.\n");
                return 1;
            } else {
                count = 0;
                i++;
            }
        }
    }

    out[j] = '\0';
    printf("DESTUFFED DATA: %s\n", out);

    return 0;
}
