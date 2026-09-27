func twoSum(nums []int, target int) []int {
    numMap := make(map[int]int)

    for i, n := range nums {
        diff := target - n
        if j, ok := numMap[diff]; ok {
            return []int{j, i}
        }
        numMap[n] = i
    }
    return []int{}
}
