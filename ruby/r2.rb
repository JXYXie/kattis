STDIN.each_line do |line|
  nums = line.strip.split
  x = nums[0].to_i
  y = nums[1].to_i
  z = (y * 2) - x
  puts z
end
