def problem_7():
    i=0
    for x in Primes(2,1000000000):
        i+=1
        if i==10001:
            return x
			
			
def Primes(n, x):
    global primeList
    if 2 >= n: yield 2
    i = 3
    while i <= x:
        for p in primeList:
            if i%p == 0 or p*p > i: break
        if i%p:
            primeList.append(i)
            if i >= n: yield i
        i = i+2