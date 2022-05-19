def twoSum(nums: List[int], target: int) -> List[int]:
    dict = {}
    for i in range(len(nums)):
        if nums[i] in dict:
            if i * 2 == target:
                return [dict[nums[i]], i]
        elif target - nums[i] in dict:
            return [dict[target - nums[i]], i]
        else:
            dict[nums[i]] = i


# 按间距中的绿色按钮以运行脚本。
if __name__ == '__main__':
    print(twoSum([2, 7, 11, 15], 9))

