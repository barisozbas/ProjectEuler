def Primes(n, x):
    global primesList
    if 2 >= n: yield 2
    i = 3
    while i <= x:
        for p in primesList:
            if i%p == 0 or p*p > i: break
        if i%p:
            primesList.append(i)
            if i >= n: yield i
        i = i+2
		
def problem_3():
    n = 600851475143
    for i in Primes(2,n):
        if not n % i: n = n / i
        if n==1:
            return i

problem_3()