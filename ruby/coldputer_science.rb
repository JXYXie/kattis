nums = []

for line in STDIN.readlines do
  nums.append(line.strip.split)
end

nums = nums.flatten
cold = 0
i = nums[0].to_i
until i < 0
  if (nums[i-1].to_i < 0)
    cold += 1
  end
  i -= 1
end
puts cold
