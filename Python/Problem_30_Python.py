def problem_30():
    ans = sum(a for a in range(2,1000000) if a == fifth_power(a))
    return str(ans)

def fifth_power(n):
    return sum(int(c)**5 for c in str(n))

print(problem_30())