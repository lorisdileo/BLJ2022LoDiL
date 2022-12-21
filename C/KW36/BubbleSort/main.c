#include <stdio.h>
#include <stdlib.h>

void main() {
    int nums[] = {4, 1, 5, 2, 12, 5, 1, 12 , 87, 65, 15, 38, 6854, 1564, 12, 357, 15631, 4342534, 45, 1536, 4, 45454, 75637485, 15, 4551, 454321, 7, 4653, 12248754, 18946, 57563451, 54, 12, 3, 47, 57, 69, 4684, 4864, 4894, 68754565, 12, 13, 354543, 5377357357, 2, 756, 2134, 6543, 2134, 3452345, 1234, 34, 76, 12, 6, 67, 2, 1, 23, 6, 6, 34, 123, 6, 8, 356, 23, 124, 7, 8, 1, 1, 6, 78, 8, 69};
    int pos1 = 0;
    int pos2 = pos1++;
    int size;
    size = sizeof(nums) / sizeof(nums[0]);
    int sizebuff1 = size;
    int sizebuff2 = size;
    
    while (sizebuff2 > 0){
        
        while (size > 0){
            
            if (nums[pos1] > nums[pos2]){
                
                int buff = nums[pos1];
                nums[pos1] = nums[pos2];
                nums[pos2] = buff;
                pos1++;
                pos2++;
            } else {
                
                pos1++;
                pos2++;        
            }
            size--;
        }
        sizebuff2--;
        pos1 = 0;
        pos2 = 1;
        size = sizebuff2;       
    }
    pos1 = 0;
    puts("here is the sorted list of numbers:");
    
    while(pos1 < sizebuff1){
        printf("%d, ", nums[pos1]);
        pos1 += 1;
    }
    puts("\n");
}