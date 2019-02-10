def problem_19():
    mon = [31,28,31,30,31,30,31,31,30,31,30,31]
    x = 0
	ans = 0
    for i in range(0,101):
        if (not (1900 + i)%4 and (1900 + i)%100) or not (1900 + i)%400: mon[1] = 29
        else: mon[1] = 28
        for j in mon:
            if not (x-1)%7 and i >= 1:
                ans += 1
            x += j

    return ans