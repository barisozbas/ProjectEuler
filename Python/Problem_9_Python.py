def problem_9():
    for c in range(0,1000):
        for a in range(0,c-1):
            b=(c**2-a**2)**.5
            if not b%1 and a>b and c+a+b==1000:
      			return int(a*b*c)

problem_9()