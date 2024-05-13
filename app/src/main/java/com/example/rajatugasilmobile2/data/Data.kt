package com.example.rajatugasilmobile2.data

import com.example.rajatugasilmobile2.R
import com.example.rajatugasilmobile2.model.Category
import com.example.rajatugasilmobile2.model.Gallery
import com.example.rajatugasilmobile2.model.Place


object Data {
    val Categories = listOf(
        Category(
            id = 1,
            name = "Bulu Tangkis",
            detail = "Olahraga raket di mana pemain menggunakan raket untuk memukul kok di atas jaring.",
            photo = R.drawable.bulu_tangkis
        ),
        Category(
            id = 2,
            name = "Sepak Bola",
            detail = "Permainan tim di mana pemain mencoba mencetak gol dengan mengendalikan bola ke gawang lawan.",
            photo = R.drawable.sepak_bola
        ),
        Category(
            id = 3,
            name = "Bola Basket",
            detail = "Olahraga tim di mana dua tim berusaha mencetak poin dengan memasukkan bola ke keranjang lawan.",
            photo = R.drawable.basket
        ),
        Category(
            id = 4,
            name = "Bola Voli",
            detail = "Permainan di mana dua tim berusaha mencetak poin dengan memukul bola melewati jaring ke sisi lawan.",
            photo = R.drawable.voli
        ),
        Category(
            id = 5,
            name = "Tenis",
            detail = "Olahraga raket di mana pemain menggunakan raket untuk memukul bola ke sisi lapangan lawan.",
            photo = R.drawable.tenis
        ),
        Category(
            id = 6,
            name = "Lari",
            detail = "Aktivitas fisik di mana seseorang berlari dengan kecepatan tertentu, bisa dalam bentuk lari cepat, jarak jauh, atau marathon.",
            photo = R.drawable.lari
        ),
        Category(
            id = 7,
            name = "Senam",
            detail = "Serangkaian gerakan tubuh yang dilakukan untuk meningkatkan kekuatan, fleksibilitas, dan keseimbangan.",
            photo = R.drawable.senam
        ),
        Category(
            id = 8,
            name = "Tenis Meja",
            detail = "Permainan meja di mana pemain menggunakan raket kecil untuk memukul bola ke meja lawan.",
            photo = R.drawable.tenis_meja
        ),
        Category(
            id = 9,
            name = "Lempar Lembing",
            detail = "Olahraga di mana atlet melempar lembing sejauh mungkin ke area yang ditentukan.",
            photo = R.drawable.lempar_lembing
        ),
        Category(
            id = 10,
            name = "Bersepeda",
            detail = "Aktivitas mengayuh sepeda, baik di jalan raya maupun lintasan khusus.",
            photo = R.drawable.bersepeda
        ),
    )

    val Places = listOf(
        Place(
            id = 1,
            name = "Lapangan Futsal Ikan Daun",
            photo = R.drawable.futsal_ikan_daun,
            detail = "(0778) 461149",
            address = "Teluk Tering, Batam Kota, Batam City, Riau Islands 29444",
        ),
        Place(
            id = 2,
            name = "M-Barca - Futsal Majesty",
            photo = R.drawable.m_barca,
            detail = "(0778) 421630",
            address = " Baloi Permai, Batam Kota, Batam City, Riau Islands 29433",
        ),
        Place(
            id = 3,
            name = "Futsal Hang Jebat Batam",
            photo = R.drawable.futsal_hang_jebat_batam,
            detail = "-",
            address = "Jl. Hang Tuah, Batu Besar, Kecamatan Nongsa, Kota Batam, Kepulauan Riau 29464",
        ),
        Place(
            id = 4,
            name = "Sport Hill Centre",
            photo = R.drawable.sport_hill_centre,
            detail = "0811-7721-882",
            address = "Jl. Hang Tuah, Belian, Kec. Batam Kota, Kota Batam, Kepulauan Riau 29433",
        ),
        Place(
            id = 5,
            name = "GO Futsal",
            photo = R.drawable.go_futsal,
            detail = "0811-7036-090",
            address = "Golden City Blok K no 1, 2, RW.3, Bengkong Laut, batam island, Batam City, Riau Islands",
        ),
        Place(
            id = 6,
            name = "Gor Bulu Tangkis Orchid Park",
            photo = R.drawable.gor_orchid_park,
            detail = "0851-0005-9999",
            address = "Perumahan Orchid Park Batam Center, Taman Baloi, Kec. Batam Kota, Kota Batam, Kepulauan Riau 29444",
        ),
        Place(
            id = 7,
            name = "GOR Badminton Batu Batam",
            photo = R.drawable.gor_batu_batam,
            detail = "0819-9092-0505",
            address = "Gor Badminton Batu Batam, Baloi Indah, Kec. Lubuk Baja, Kota Batam, Kepulauan Riau 29444",
        ),
        Place(
            id = 8,
            name = "Elite Badminton",
            photo = R.drawable.elite_badminton,
            detail = "0811-6911-168",
            address = "KIOS GOLDEN CITY, Blk. A No.52, Tj. Buntung, Kec. Bengkong, Kota Batam, Kepulauan Riau 29432",
        ),
        Place(
            id = 9,
            name = "GOR Badminton Temenggung",
            photo = R.drawable.gor_temenggung,
            detail = "0812-7000-463",
            address = "Kabil, Nongsa, Batam City, Riau Islands 29444",
        ),
        Place(
            id = 10,
            name = "GOR Bulu tangkis Tiban",
            photo = R.drawable.gor_tiban,
            detail = "0812-7666-9995",
            address = "Harapan River, Sekupang, Batam City, Riau Islands 29424",
        )
    )

    val Galleries = listOf(
        Gallery(
            id = 1,
            name = "Marselino Ferdinan",
            position = "Forward",
            about = "Marselino Ferdinan Philipus is an Indonesian professional footballer who plays as a attacking midfielder or winger for Challenger Pro League club Deinze and the Indonesia national team. Marselino started his senior career with Persebaya Surabaya in 2021, emerging through its youth system.",
            photo = R.drawable.marselino
        ),
        Gallery(
            id = 2,
            name = "Rafael Struick",
            position = "Forward",
            about = "Rafael William Struick is an Indonesian professional footballer who plays as a left winger or a forward for Eerste Divisie club ADO Den Haag. Born in the Netherlands, he plays for the Indonesia national team.",
            photo = R.drawable.rafael
        ),
        Gallery(
            id = 3,
            name = "Ramadhan Sananta",
            position = "Forward",
            about = "Muhammad Ramadhan Sananta is an Indonesian professional footballer who plays as a striker for Liga 1 club Persis Solo and the Indonesia national team",
            photo = R.drawable.sananta
        ),
        Gallery(
            id = 4,
            name = "Witan Sulaeman",
            position = "Midfielder",
            about = "Witan Sulaeman is an Indonesian professional footballer who plays as a winger or attacking midfielder for Liga 1 club Bhayangkara, on loan from Persija Jakarta, and the Indonesia national team. A youth product of Ragunan Sports School, Witan started his professional career with PSIM Yogyakarta.",
            photo = R.drawable.witan
        ),
        Gallery(
            id = 5,
            name = "Ivar Jenner",
            position = "Midfielder",
            about = "Ivar Jenner is an Indonesian professional footballer who plays as a midfielder for Eredivisie club Utrecht. Born in the Netherlands, he plays for the Indonesia national team.",
            photo = R.drawable.ivan
        ),
        Gallery(
            id = 6,
            name = "Justin Hubner",
            position = "Defender",
            about = "Justin Quincy Hubner is a professional footballer who plays as a centre-back for J1 League club Cerezo Osaka, on loan from Premier League club Wolverhampton Wanderers. Born in the Netherlands, he represents the Indonesia national team.",
            photo = R.drawable.justin
        ),
        Gallery(
            id = 7,
            name = "Pratama Arhan",
            position = "Defender",
            about = "Pratama Arhan Alif Rifai is an Indonesian professional footballer who plays as a left-back for K League 1 club Suwon FC and the Indonesia national team. He is most known for his powerful throw-ins and free kicks. Arhan was also a nominee of the AFC's 11 players to watch in 2023.",
            photo = R.drawable.arhan
        ),
        Gallery(
            id = 8,
            name = "Nathan Tjoe-A-On",
            position = "Defender",
            about = "Nathan Noël Romejo Tjoe-A-On is a professional footballer who plays as a left-back or midfielder for Eredivisie club Heerenveen, on loan from EFL Championship club Swansea City. Born in the Netherlands, he plays for the Indonesia national team.",
            photo = R.drawable.nathan
        ),
        Gallery(
            id = 9,
            name = "Rizky Ridho",
            position = "Defender",
            about = "Rizky Ridho Ramadhani is an Indonesian professional footballer who plays as a centre-back for Liga 1 club Persija Jakarta and the Indonesia national team.",
            photo = R.drawable.rizky
        ),
        Gallery(
            id = 10,
            name = "Ernando Ari",
            position = "Goalkepeer",
            about = "Ernando Ari Sutaryadi is an Indonesian professional footballer who plays as a goalkeeper for Liga 1 club Persebaya Surabaya and the Indonesia national team.",
            photo = R.drawable.ernando
        )
    )
}