def problem_12():
        sum,i = 0,1
    while True:
            sum += i
        i += 1
        if NumFactors(sum)>= 500:
            return sum
			
def NumFactors(n):
    i = PrimeFactor(n)
    y = 1
    for x in set(i[1::]):
        y=y*(1+i.count(x))
    return y

def PrimeFactor(n):
    n,p,i = abs(n),[1],2
    l = n**0.5  
    while i <= l:  
        if n % i == 0:  
            p.append(i)
            n = n // i  
            l = n**0.5  
        else:  
            i += 1  
    if n > 1:  
        p.append(n)
    return p