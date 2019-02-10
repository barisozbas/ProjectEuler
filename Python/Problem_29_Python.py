def problem_29():
    compute = set(a**b for a in range(2,101) for b in range(2,101))
    return len(compute)

print(problem_29())