nums = []

STDIN.each_line do |line|
  nums.append(line.strip.to_i)
end

nums.drop(1).each do |n|
  puts((n % 2).zero? ? n.to_s + ' is even' : n.to_s + ' is odd')
end
