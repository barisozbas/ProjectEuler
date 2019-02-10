def problem_1():
    x=0
    for i in range(0,1000,3):
        if not (i % 3 and i % 5): x+=i
    return x

problem_1()