def problem_28():
    inc=2
    sum=1;
    realsum=1;
    while sum<1001*1001:
        for a in range(0,4):
            sum+=inc
            realsum+=sum
        inc+=2
    return realsum

print(problem_28())