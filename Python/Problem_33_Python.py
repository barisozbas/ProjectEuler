def problem_33():

    numer=1
    denom=1
    for d in range(10,100):
        for n in range(10,d):
            n0=n%10
            n1=n//10
            d0=d%10
            d1=d//10
            if(n1==d0 and n0*d == d1*n)or(n0 == d1 and n1*d == n*d0):
                 denom*=d
                 numer*=n

    return str(denom // fractions.gcd(numer, denom))

print(problem_33())