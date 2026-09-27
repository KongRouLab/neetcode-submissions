func hasDuplicate(nums []int) bool {
    seen := make(map[int]bool)
    for _, i := range nums {
        if seen[i] {
            return true
        }
        seen[i] = true
    }
    return false
}
