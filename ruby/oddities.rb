nums = []

STDIN.each_line do |line|
  nums.append(line.strip.to_i)
end

for n in nums.drop(1)
  puts (n % 2 == 0) ? (n.to_s + " is even") : (n.to_s + " is odd")
end
