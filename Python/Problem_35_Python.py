def problem_35():
    count=0
    for i in range(10,100000):
        if isCircularPrime(i)==True:
            count+=1
    return count+4

def isCircularPrime(n):
    perm = [''.join(p) for p in itertools.permutations(str(n))]

    bool=True

    for subset in range (0,len(perm)):
        if(isPrime(int(perm[subset]))!=bool):
            return False
    return True

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
	
print(problem_35())