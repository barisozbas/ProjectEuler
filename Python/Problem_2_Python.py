def problem_2():
    i=0
    j=[1,1]
    while j[1] < 4000000:
        n=sum(j)
        if not n % 2: i+=n
        j=[j[1],n]
    return i

problem_2()