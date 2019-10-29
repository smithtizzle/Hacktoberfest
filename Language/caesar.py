'''
Author: Luca Gouveia
'''

alf = ['A', 'B', 'C', 'D', 'E', 'F', 'G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
mod_alf = alf[:]

length = int(input("Number of letters will be shifted: "))
shift = alf[:length]

for i in shift:
    mod_alf.remove(i)
    mod_alf.insert(25,i)

#-----------------------------------------

inp = str(input("Your message: ")).upper() 
ou = []

answer = int(input("encrypt[1] or decrypt[2]?"))

if(answer == 1):
    for i in range (len(inp)):
        if(inp[i] == ' '):
            ou.append(' ')
        else:
            index_n = alf.index(inp[i])
            ou.append(mod_alf[index_n])

    print("".join(ou))

if(answer == 2):
    for i in range(len(inp)):
        if(inp[i] == ' '):
            ou.append(' ')
        else:
            index_mod = mod_alf.index(inp[i])
            ou.append(alf[index_mod])

    print("".join(ou))
