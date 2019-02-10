def point(name): 
    return sum(ord(letter) - ord('A') + 1 for letter in name)

txt = open("p022_names.txt")
data  = txt.read()[1:][:-1].split('","')
data.sort()

ans = sum((i+1) * point(data[i]) for i in xrange(0, len(data)))

print ans