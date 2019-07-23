from sys import stdin

switches = int(stdin.readline())
first = list(stdin.readline())
second = list(stdin.readline())

for times in range(switches):
    for i in range(len(first)-1):
        if first[i] == '1':
            first[i] = '0'
        else:
            first[i] = '1'

if first == second:
    print("Deletion succeeded")
else:
    print("Deletion failed")
