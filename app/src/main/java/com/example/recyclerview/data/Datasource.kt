package com.example.recyclerview.data

import com.example.recyclerview.R
import com.example.recyclerview.model.Proverb

class Datasource() {
    fun loadProverbs(): List<Proverb> {
        return listOf<Proverb>(
            Proverb(R.string.proverb1),
            Proverb(R.string.proverb2),
            Proverb(R.string.proverb3),
            Proverb(R.string.proverb5),
            Proverb(R.string.proverb6),
            Proverb(R.string.proverb7),
            Proverb(R.string.proverb8),
            Proverb(R.string.proverb9),
            Proverb(R.string.proverb10),
            Proverb(R.string.proverb11),
            Proverb(R.string.proverb12),
            Proverb(R.string.proverb13),
            Proverb(R.string.proverb14),
            Proverb(R.string.proverb15),
            Proverb(R.string.proverb16),
            Proverb(R.string.proverb17),
            Proverb(R.string.proverb18),
            Proverb(R.string.proverb19)
        )
    }
}