nums = []

STDIN.readlines.each do |line|
  nums.append(line.strip.split)
end

nums = nums.flatten
cold = 0
i = nums[0].to_i
until i.negative?
  cold += 1 if nums[i - 1].to_i.negative?
  i -= 1
end
puts cold
