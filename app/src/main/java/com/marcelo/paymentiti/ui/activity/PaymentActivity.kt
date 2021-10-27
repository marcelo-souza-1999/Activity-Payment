package com.marcelo.paymentiti.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marcelo.paymentiti.R
import kotlinx.android.synthetic.main.activity_payment.*
import kotlinx.android.synthetic.main.header_payment.*

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        clickButtons()
    }

    private fun clickButtons() {
        imageClosePayment.setOnClickListener {
            finish()
        }

        btnShowProvePayment.setOnClickListener {
            val intent = Intent(this, ProofPaymentActivity::class.java)
            startActivity(intent)
        }
    }
}