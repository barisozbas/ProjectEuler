from math import factorial
def problem_20():
    ans=0
    for i in str(factorial(100)):ans += int(i)
    return ans