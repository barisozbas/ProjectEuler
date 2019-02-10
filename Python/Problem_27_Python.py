import itertools

def problem27():
    result= max(((a,b)for a in range(-999,1000) for b in range (2,1000)),
                key=computePrime)
    return str(result[0]*result[1])

def computePrime(ab):
    a,b=ab
    for i in itertools.count():
        n= i*i + i*a + b
        if not isPrime(n):
            return i
	
def isPrime(n):
    if n==2:
        return True
    if n<=1:
        return False
    if n & 1 == 0:
        return False
    d= 3
    while d * d <= n:
        if n % d == 0:
            return False
        d= d + 2
    return True

print(problem27())