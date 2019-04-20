package com.nandaadisaputra.master.simplemvp

class KalkulatorPresenters: KalkulatorPresenterImp {

    var mainView : MainViewImp? = null

    constructor(mainView : MainViewImp){
        this.mainView =  mainView
    }

    override fun perhitungantambah(nilai1: String, nilai2: String) {

        var hasil= nilai1.toDouble() + nilai2.toDouble()

        mainView?.hitung(hasil.toString())

    }

    override fun perhitungankurang(nilai1: String, nilai2: String) {

        var hasil= nilai1.toDouble() - nilai2.toDouble()

        mainView?.hitung(hasil.toString())

    }

    override fun perhitungankali(nilai1: String, nilai2: String) {

        var hasil= nilai1.toDouble() * nilai2.toDouble()

        mainView?.hitung(hasil.toString())
    }
}