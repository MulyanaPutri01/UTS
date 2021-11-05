package com.example.javamusicapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data
        data?.add(DataModel(R.drawable.bonang,"Alat Musik Tradisional","BONANG","Perannya dalam komposisi musik adalah sebagai melodi. Dalam sebuah pentas gamelan, bonang memiliki beragam variasi yang dilihat dari kunci nadanya. Dari segi fisik, bonan memiliki tonjolan di bagian atasnya yang sering disebut dengan pencu atau pencon.\n" +
                "\n" +
                "Cara memainkannya dengan dipukul atau ditabuh pada bagian pencu-nya untuk menghasilkan nada yang sesuai dengan jenis bonangnya. Untuk memukul bonang, para pemain menggunakan dua alat pemukul yang disebut dengan bindhi. "))

        data?.add(DataModel(R.drawable.gambang,"Alat Musik Tradisional","GAMBANG","Gambang merupakan alat musik tradisonal yang dimainkan dengan cara dipukul. Biasanya terdiri dari 18 bilah bambu dengan alat pemukul khusus. Fungsi dari gambang dalam mengiringi lagu ialah sebagai pangrengga lagu. Dalam kesenian gambang kromong biasnaya digunakan gambang.\n "))

        data?.add(DataModel(R.drawable.gong_kempul2,"Alat Musik Tradisional","GONG KEMPUL","Gong merupakan alat musik tradisional yang dimainkan dengan cara dipukul dan bahkan sudah banyak dikenal di Asia Tenggara maupun Asia Timur. Nada gong belum terdengar bagus dihasilkan jika belum dibersihkan/dibilas saat baru di tempa.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Gong dan kempul biasanya digantung dalam satu tempat yang sama.kempul memiliki bentuk yang hampir sama dengan gong namun lebih kecil. Di dalam gamelan kempul termasuk ke dalam instrumen keras. Fungsi dari kempul ialah sebagai penanda aksen-aksen tertentu dalam lagu/gending. Suara yang dihasilkan lebih tinggi dibandingkan gong. semakin kecil ukuran kempul maka suara yang dihasilkan juga semakin tinggi."))

        data?.add(DataModel(R.drawable.kendang,"Alat Musik Tradisional","KENDANG","Kendang (kendhang) merupakan instrumen tradisional dalam gamelan dari Jawa Tengah yang digunkan untuk mengatur irama atau tempo lagu.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Cara memainkannya yaitu dengan ditepak menggunakan tangan. instrumen ini terbuat dari kulit kerbau, tali rotan kayu nangka, kayu pohon cempedak atau kayu pohon kelapa. Kendang juga terbagi atas 2 jenis yaitu:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Kendang kecil bernama ketipung.\\n\" +\n" +
                "                \"Kendang menengah/sedang bernama kendang ciblon/kebar.\\n\" +\n" +
                "                \"Ketipung mempunyai pasangan yaitu kendang gedhe atau disebut juga kendang kalih."))

        data?.add(DataModel(R.drawable.kenong,"Alat Musik Tradisional","KENONG","Kenong merupakan alat musik tradisional atau bisa dikategorikan dalam alat musik berpencu yang digunakan untuk pengisi akor atau harmoni. Yang fungsi utamanya penegas irama, penentu batas gatra.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Cara memainkan kenong ialah dengan cara dipukul menggunakan alat khusus. Ukurannya lebih besar dibandingkan dengan bonang. Jika dibandingkan dengan gong dan kempul lebih gemuk dan pipih. Jumlahnya bervariasi dalam satu set, namun yang lebih sering dijumpai sekitar 10 buah. Suara yang dihasilkan lebih nyaring namun lebih rendah."))

        data?.add(DataModel(R.drawable.saron,"Alat Musik Tradisional","SARON","Saron/ricik merupakan keluarga dari Balungan, dan termasuk alat musik gamelan. Instrumen ini terbuat dari lembaran/wilahan logam dan berukuran kecil. Cara memainkannya yaitu dengan cara ditabuh/dipukul menggunakan alat khusus yang terbuat dari kayu yang dilapis karet.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Teknik memathet (pathet/pencet) ialah teknik untuk memainkan saron yaitu dipukul dengan tangan kanan lembaran logam, kemudian tangan kiri memencet bagian yang dipukul tadi (menghilangkan dengungan). Ada 2 pasang saron dan, slendro dan laras pelog dalam satu set gamelan. nada yang dihasilkan lebih tinggi satu oktaf daripada demung maupun saron panembung. "))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("alat", item?.alat)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }

}