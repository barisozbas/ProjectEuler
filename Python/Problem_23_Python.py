import prime

MAX = 28124
prime._refresh(MAX/2)
abs = [i for i in xrange(1, MAX) if sum(prime.all_factors(i)) > i+i]
abs_dict = dict.fromkeys(abs, 1)
total = 0
for i in xrange(1, MAX):
    sum_abs = 0
    for j in abs:
        if j > i: break
        if abs_dict.get(i - j):
            sum_abs = 1
            break
    if not sum_abs:
        total = total + i

print total