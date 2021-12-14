package PlantMain;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Mawar extends Plant
{
public String jenis;
public Mawar(){
super();
jenis = "Mawar";
}
public void cekKondisiTumbuh() {
if(jumlahAir >=3 && jumlahPupuk >=2) {
tumbuh();
}
}
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