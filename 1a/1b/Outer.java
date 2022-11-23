paket  Nusput . P7 . b ;

 kelas  publik Luar {
    int  angka = 0 ;

    batal  metode luar (){
        kelas  Dalam {
             cetak kosong  publik (){
                Sistem . keluar . println ( "Mengakses inner class yang ke:" + ( angka ++));
            }
        }

        Batin  batin = batin baru  ();
        batin . cetak ();
    }
}

kelas  Akses Luar {
    public  static  void  main ( String [] args ) {
        Luar  luar = baru  Luar ();
        keluar . metode luar ();
        keluar . metode luar ();
        keluar . metode luar ();
    }
}
