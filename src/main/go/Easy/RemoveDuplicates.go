package Easy

import "fmt"

func removeDuplicates(nums []int) int {
	var l = len(nums)
	if (l == 0) {
		return 0
	}
	var i int = 0
	for j := 1; j < l; j++ {
		if (nums[j] != nums[i]) {
			i++
			nums[i] = nums[j]
		}
	}

	return i + 1
}

func main() {
	var nums []int = []int{1, 1, 2}
	var res = removeDuplicates(nums)
	fmt.Print(res)
	fmt.Print(":")
	fmt.Print(nums)
}