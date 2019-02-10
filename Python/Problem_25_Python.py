import math

p = (1 + pow(5, 0.5)) / 2
x = math.log10(5) / 2
logP = math.log10(p)
ans = 1
while True:
    if ans * logP - x >= 999:
        break
    ans = ans + 1

print(ans)