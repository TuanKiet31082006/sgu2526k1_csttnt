# Nhap du lieu
a = int(input("Moi ban nhap he so a: "))
b = int(input("Moi ban nhap he so b: "))

# Xu ly
if a == 0:
    if b == 0:
       flag = -1 # vo so nghiem
    else:
       flag = 0  # vo nghiem 
else: 
    flag = 1 # nghiem duy nhat
    x = -b / a
    
# Xuat du lieu
s = f'Phuong trinh {a}x + {b} = 0'
if flag == -1:
    print(f'{s} vo so nghiem.')
elif flag == 0:
    print(f'{s} vo nghiem.')
else:
    print(f'{s} co 1 nghiem x = {x: .2f}.')