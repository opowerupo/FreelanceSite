package main.kotlin.Easy


fun twoSum(nums: IntArray,target: Int): IntArray? {
    var map:HashMap<Int,Int> = hashMapOf<Int,Int>();
    for(i in nums.indices){
        if(map.containsKey(nums[i])) {
            return intArrayOf(map.get(nums[i])!!,i)
        }
        map.put(target - nums[i], i)
    }
    return null
}

fun main(){
    var result = twoSum(intArrayOf(2,8,7,3),9)
    for(i in result!!) {
        print(i)
    }
}


