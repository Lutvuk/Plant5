package PlantMain;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Anggrek extends Plant
{
public String jenis;
public Anggrek(){
super();
jenis = "Anggrek";
}
@Override
public void cekKondisiTumbuh() {
if(jumlahAir >=3 && jumlahPupuk >=2) {
tumbuh();
}
}
@Override
public void tumbuh() {
if(statusTumbuh <4) {
jumlahAir = jumlahAir - 3;
jumlahPupuk = jumlahPupuk - 2;
statusTumbuh++;
}
}
public String getJenis() {
return jenis;
}
}
