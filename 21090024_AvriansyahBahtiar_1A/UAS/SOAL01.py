varMinimum =  int(2)
varMaksimum = int(100)
x = int(3)
y = int(7)
jumlah = []

while varMinimum <= varMaksimum:
    if (varMinimum%x)==0:
        print(varMinimum)
        jumlah.append(varMinimum)
    varMinimum+= 1
print("jumlah intem: ", len(jumlah))    