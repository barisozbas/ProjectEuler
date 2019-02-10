import itertools

def problem_32():
    table="123456789"
    perm = [''.join(p) for p in itertools.permutations('123456789')]
    sum=0

    for a in perm:
        test=a
        if int(str(test[0])+str(test[1]))* int(str(test[2])+str(test[3])+str(test[4]))== int(str(test[5])+str(test[6])+str(test[7])+str(test[8])):
            sum+=int(str(test[5])+str(test[6])+str(test[7])+str(test[8]))

    return sum

print(problem_32())