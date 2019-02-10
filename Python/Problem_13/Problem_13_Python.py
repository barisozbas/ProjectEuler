def problem_13():
    k = open('datalist_problem_13','r').readlines()
        sum,ans=0,[]
    for i in range(0,50):
        for line in k:
                sum+= int(line.strip()[49-i])
            ans.append(str(sum%10))
            sum=(sum-sum%10)/10
    for i in str(sum)[::-1]:
            ans.append(i)
        ans.reverse()
    return ''.join(ans)[0:10]