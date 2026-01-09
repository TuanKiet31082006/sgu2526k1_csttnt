import math

def NhapDuLieu():
    while True: 
        try:
            s = input("Moi ban nhap he so a, b, c: ")
            a, b, c = map(float, s.split())
            return a, b, c
        except:
            print("Ban nhap sai! Moi ban nhap lai!")
            
def GiaiPhuongTrinhBac2(a, b, c):
    flag = None
    x = ()
    
    if a == 0:
        if b == 0:
            if c == 0:
                flag = -1
            else: 
                flag = 0
        else:
            flag = 1
            x = (-c / b,)
    else:
        delta = b*b - 4*a*c
        if delta < 0:
            flag = 0
        elif delta == 0:
            flag = 1
            x0 = -b / (2*a)
            x = (x0,)
        else:
            flag = 2
            x1 = (-b - math.sqrt(delta)) / (2*a)
            x2 = (-b + math.sqrt(delta)) / (2*a)
            x = (x1, x2)
    return flag, x

a, b, c = NhapDuLieu()

flag, x = GiaiPhuongTrinhBac2(a, b, c)

s = f'Phuong trinh bac 2 {a}x^2 + {b}x + {c} = 0'
if flag == -1:
    print(f'{s} co vo so nghiem!')
elif flag == 0:
    print(f'{s} vo nghiem!')
elif flag == 1:
    print(f'{s} co 1 nghiem, x = {x[0]:.2f}!')
elif flag == 2:
    print(f'{s} co 2 nghiem, x1 = {x[0]:.2f}, x2 = {x[1]:.2f}!')
