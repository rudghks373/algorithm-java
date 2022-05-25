/*
Boyer-Moore Voting Algorithm
같은 수가 연속해서 나온다면 cnt에 1을 더해주고
다른 수가 나온다면 cnt에 1을 빼주게 된다.

만일 cnt가 0이 된다면 비교할 후보를 새로운 대상으로 바꿔준다.

 

위 과정을을 통해 과반수일 확률이 있는 후보를 선정할 수 있다.

 

이후 한번 더 반복문을 실행시켜 후보가 과반수가 맞는지 확인해준다.

 

만일 후보가 과반수 이상을 차지할 경우 후보를 반환해주며,
과반수가 아닐 경우 -1을 반환한다.
*/
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0; 
        int ret = 0;
        for (int num: nums){
            if(count == 0)
                ret = num;
            if (num !=ret)
                count--;
            else
                count++;
        }
        return ret;
    }
}
