import math
class SimpleMethod:
    
    def CetakJudul(self):
        Title01 = 'Cetak judul dari class method'
        Title02 = 'Method ini dipanggil dari main program'
        print(Title01)
        print(Title02)

    def HitungLuasPersegi(self):
        print('\nMenghitung Luas Persegi dari method')
        Panjang = 10
        Lebar = 4
        Luas = Panjang * Lebar
        print('Luas Persegi Panjang = %2.2f'%Luas)

    def HitungLuasLingkaran(self):
        print('\nMenghitung Luas Lingkaran dari method')
        r = input('masukan jari-jari = ')
        LuasLingkaran = math.pi * float(r) * float(r)
        print('Luas Lingkaran = %5.2f'%LuasLingkaran)

Judul01 = 'Cetak judul tanpa class method'
Judul02 = 'judul02 dicetak di sini'
print(Judul01)
print(Judul02)
print('\n')
myMethod = SimpleMethod()
myMethod.CetakJudul()
myMethod.HitungLuasPersegi()
myMethod.HitungLuasLingkaran()