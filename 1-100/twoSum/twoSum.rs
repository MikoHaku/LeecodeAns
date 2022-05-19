use std::arch::x86_64::_xsaves;
use std::collections::HashMap;

fn main() {
    let target: i32 = 6;
    let nums = vec![3,3];
    for i in twoSum(nums, target) {
        println!("{}", i);
    }

    // println!("Hello, world!");
}

fn twoSum(nums: Vec<i32>, target: i32) -> Vec<i32> {
    let mut map = HashMap::new();
    for i in 0..nums.len() {
        let tag = (target-nums[i]);
        match map.get_key_value(&tag) {
            Some((_,j)) => return vec![*j as i32, i as i32],
            None => {map.insert(nums[i], i);}
        }
    }
    return vec![];
}