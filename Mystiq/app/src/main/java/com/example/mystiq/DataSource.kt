package com.example.mystiq

import java.util.ArrayList

class DataSource {
    companion object {
        fun createDataSet(): ArrayList<Instances>{
            val list = ArrayList<Instances>()
            list.add(Instances("Kolín","5.3.2020","12:00","68%"))
            list.add(Instances("České Budějovice","25.3.2020","15:30","93%"))
            list.add(Instances("Kutná Hora","2.12.2019","13:30","52%"))
            list.add(Instances("Kladno","14.11.2019","13:50","43%"))
            list.add(Instances("Hradec Králové","1.3.2020","15:30","73%"))
            list.add(Instances("Liberec","28.2.2020","16:30","78%"))
            list.add(Instances("Tábor","25.3.2020","11:30","82%"))

            return list
        }
    }
}