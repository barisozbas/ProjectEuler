def problem_5():
    p=1
    for i in range(1,21):
        p=Least(i,p)
    return p
	
def Least(a,b):
    if not max(a,b)%min(a,b): return max(a,b)
    l,p=1,{}
    for t in [PrimeFactor(a),PrimeFactor(b)]:
        for i in set(t):
            if i not in p:p[i]=t.count(i)
            else: p[i]=max(p[i],t.count(i))
    for g in p: l=l*g**p[g]
    return l
	
def PrimeFactor(n):
    n,p,i=abs(n),[1],2
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