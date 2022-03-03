public int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        if(nums.length == 1 || nums.length == 0){
            return 0;
        }
        else{
            int diff = 0;
            
            for(int i = 0;i < nums.length-1;i++){
                diff = nums[i+1] - nums[i];
                for(int j = i + 1;j < nums.length-1;j++){
                    int tempdiff = nums[j+1] - nums[j];
                    if(tempdiff == diff && j + 2 - i < 3){
                        continue;
                    }
                    else if(tempdiff == diff && j + 2 - i >= 3){
                        result++;
                    }
                    else{
                        break;
                    }
                }
            }
            return result;
        }
        
    }