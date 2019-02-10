import itertools

x = 0
for values in itertools.permutations([0,1,2,3,4,5,6,7,8,9]):
    x += 1
    if x == 1000000:
        print (values)
        break