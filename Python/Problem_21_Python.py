def divisors(n): 
    return list(i for i in xrange(1, n/2+1) if n % i == 0)

p = dict( ((n, sum(divisors(n))) for n in xrange(1, 10000)) )

print sum(n for n in xrange(1, 10000) if p.get(p[n], 0) == n and p[n] != n)
