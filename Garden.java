/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  // Import the Scanner class
import java.util.stream.Collectors;

/**
 *
 * @author Alwan Abiyu Putra
 */
public class Garden {
    String mGardenName;
        int hasilPanen;
        List<String> mPlantArr = new ArrayList<>();
        int jumlahPoin;
        
        Plant p = new Plant() ;
        
        public Garden(){
            mGardenName = "\nTAMAN MELATI";
            hasilPanen = 0;
            int[] mPlantArr = {1,2,3,4,5,6,7,8,9,10};
        
        }
        public void addPlant(Object plant){
            if (mPlantArr.size() < 10){
                mPlantArr.add(plant.toString());
            } else{
                System.out.println("Taman Penuh");                
            }
        }
        
        public int harvestPlant(String tanaman){
            System.out.println("");
            System.out.println(this.p.getStatusTumbuhText());
            if (this.p.getStatusTumbuh() == 0){
                if (mPlantArr.size() < 1){
                    System.out.println("Taman Kosong");
                }else {
                    List<String> result = mPlantArr.stream().filter(x -> x.contains(tanaman)).collect(Collectors.toList());
                    mPlantArr.removeIf(s -> s.equals(tanaman));
                    jumlahPoin += result.size() * 100;       
                }
            }
            
            System.out.println("Sisa Tanaman = "+ mPlantArr);
            System.out.println("Poin yang didapat = "+ jumlahPoin);
            return jumlahPoin;
        }
        
        
        public void beriAir() {
                p.beriAir();
                
                
    }
        public void menambahPupuk(){
                p.beriPupuk();
    }

        public void displayGarden(String t){
            List<String> result = mPlantArr.stream().filter(x -> x.contains(t)).collect(Collectors.toList());
            System.out.println(mGardenName);
            System.out.println("Jumlah Poin:" + jumlahPoin);
            System.out.println("Jumlah Tanaman:" + result);
        }
        public void displayGarden(){
            System.out.println("Jumlah Poin:" + jumlahPoin);
            if (mPlantArr.isEmpty() ) {
                System.out.println("Jumlah Tanaman:" + mPlantArr.size());
            } else {
            System.out.println("Jumlah Tanaman:" + mPlantArr);    
            }
            
        }
}
        

