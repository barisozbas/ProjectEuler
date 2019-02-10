def problem_4():
        ran=range(999,99,-1)
    for i in xrange(998000,0,-1):
        st=str(i)
        if st==st[::-1]:
            for j in ran:
                if not i % j and len(str(i/j))==3:
                    return st

problem_4()