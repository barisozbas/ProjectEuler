import math

def problem_34():
    sum=0
    for d in range(3, 1000000):
        temp1=0
        temp=str(d)

        for i in range(0,len(temp)):
            temp1+=(math.factorial(int(temp[i])))
        if temp1==d:
            sum+=d
    return sum

print(problem_34())