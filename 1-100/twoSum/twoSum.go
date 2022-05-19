package twoSum

import "fmt"

func main() {
	var nums = [...]int{2, 7, 11, 15}
	var (
		target = 9
	)
	fmt.Printf("%d\n", twoSum(nums[:], target))
	fmt.Println("Hello, World!")
	//fmt.Println("",_,ok=nums[], target)
}

func twoSum(nums []int, target int) []int {
	var mp = make(map[int]int)
	var res []int
	for i := 0; i < len(nums); i++ {
		var dif = target - nums[i]
		if val, ok := mp[dif]; ok {
			return append(res, val, i)
		} else {
			mp[nums[i]] = i
		}
	}
	return append(res, 0, 0)
}
