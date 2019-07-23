#! /usr/bin/python3
 
x = [None] * 3
y = [None] * 3
 
for i in range(3):
    x[i], y[i] = [a for a in input().split()]

if (x[0] == x[1]):
    x4 = x[2]
elif (x[1] == x[2]):
    x4 = x[0]
elif (x[0] == x[2]):
    x4 = x[1]
else:
    x4 = x[0]

if (y[0] == y[1]):
    y4 = y[2]
elif (y[1] == y[2]):
    y4 = y[0]
elif (y[0] == y[2]):
    y4 = y[1]
else:
    y4 = y[0]

print("%s %s" % (x4, y4))    
