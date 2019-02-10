import csv

def problem_18():
    i = list(csv.reader(open('datalist_problem_18.csv'), delimiter=' '))
    ch=[int(i[0][0])]
    for row in i[1::]:
        arr=[]
        for j in range(1,len(row[1:])):
            arr.append( max( ch[j-1], ch[j] ) + int( row[j] ) )
        ch =[ ch[0] + int( row[0] )] + arr + [ ch[-1] + int(row[-1]) ]
    return max(ch)  