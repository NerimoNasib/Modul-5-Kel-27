
package modul.pkg5.tugas;
class userService {
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][4];
    private String email, password, roles = "";
    private String emailh,matkul,matkull,date;
    //ini adalah constructor yang akan dijalankan ketika class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"Egakelompok27@gmail.com", "12345", "supedAdmin"},
            {"Ilzamkelompok27@gmail.com", "12345", "user"} 
        };
        String[][] histories = 
        { 
            {"Egakelompok27@gmail.com", "Fisika Dasar","Dasar Komputer dan Pemrograman", "25-04-2020"},
            {"Ilzamkelompok27@gmail.com", "Dasar Komputer dan Pemrograman","Konsep Jaringan Komputer", "25-04-2020"} 
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()//pengecekan data pada array di constructor userService
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {   
                if(data[i][1].equals(password))
                {   //variabel berisi data dari array pada constructor 
                    emailh = histories[i][0];
                    matkul = histories[i][1];
                    matkull= histories[i][2];
                    date = histories [i][3];
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()//proses login dengan mengambil boolean dari checkCredential sebagai kondisi penentu dalam pengkondisian pada method ini
    {
        boolean status = checkCredential();
        if(status == true)//jika benar akan ditampilkan output seperti dibawah
        {//output
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + emailh);
            System.out.println(matkul);
            System.out.println(matkull);
            System.out.println("Tanggal Pinjaman : " + date);
        }
        else//jika salah maka akan ditampilkan invalid login
        {
            System.out.println("\nInvalid Login ");
        }
    }
}
