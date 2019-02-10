def problem_6():
    i,y=0,0
    for j in range(1,101):
        i+=j**2
        y+=j
    y=y**2
    return y-i