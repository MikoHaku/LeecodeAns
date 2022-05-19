#include<iostream>
#include<vector>
#include <unordered_map>
using namespace std;
vector<int> twoSum(vector<int>& nums, int target);
int main()
{
    vector<int> nums ={2, 7, 11, 15};
    int target=9;
    vector<int> secend;
    secend=twoSum(nums, target);
    cout<<secend[0]<<' '<<secend[1]<<endl;

}
vector<int> twoSum(vector<int>& nums, int target){
    unordered_map<int,int>mp;
    for (int i = 0; i < nums.size(); ++i) {
        int fg =target-nums[i];
        if (mp.count(fg)){
            return {mp[fg],i};

        }
        else{
            mp[nums[i]]=i;
        }
    }
    return {};
}
