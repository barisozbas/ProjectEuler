import itertools

def problem_26():
    ans = max(range(1, 1000), key=reciprocal_cycle_len)
    return str(ans)


def reciprocal_cycle_len(n):
    seen = {}
    x = 1
    for i in itertools.count():
        if x in seen:
            return i - seen[x]
        else:
            seen[x] = i
            x = x * 10 % n

print(problem_26())