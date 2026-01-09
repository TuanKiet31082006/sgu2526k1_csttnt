s = input ("Moi ban nhap chuoi ky so s: ")

en = ["zero","one","two","three","four","five","six","seven","eight","nine","ten"]
vi = ["khong","mot","hai","ba","bon","nam","sau","bay","tam","chin","muoi"]
num = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

s_lower = s.lower()

# Xu ly
if s_lower in en:
    print("Chuoi vua nhap hop le!")
    idx = en.index(s_lower)
    print(f"“{s}” bieu dien so cho “{idx}” va ung voi tieng Viet “{vi[idx]}”.")
else:
    print("Chuoi vua nhap khong hop le!")



