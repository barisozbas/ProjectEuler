day=[3,3,5,4,4,3,5,5,4,3,6,6,8,8,7,7,9,8,8]
a=10
b=[6,6,5,5,5,7,6,6]
ans=0
    for i in range(0,10):
        h = a + day[i-1]
        if i == 0: h = 0
        ans += max(0,h-3)
        for j in range(0,len(day)): ans += ( day[j] + h )
        for q in range(0,len(b)):
            ans += b[q] + h
            for x in range(0,9): ans += ( b[q] + day[x] + h )
    ans += 11
	
print(ans)